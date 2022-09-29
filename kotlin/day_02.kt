package day_02

import kotlin.math.*

fun slack_paper(l: Int, w: Int, h: Int): Int {
    return min(min(l * w, l * h), w * h)
}

fun box_paper(l: Int, w: Int, h: Int): Int {
    return 2 * l * w + 2 * w * h + 2 * h * l
}

fun total_wrapping_paper(l: Int, w: Int, h: Int): Int {
    return box_paper(l, w, h) + slack_paper(l, w, h)
}

fun part_1(input: List<Triple<Int, Int, Int>>): Int {
    return input.map { total_wrapping_paper(it.first, it.second, it.third) }.sum()
}

fun bow_ribbon(l: Int, w: Int, h: Int): Int {
    return l * w * h
}

fun box_ribbon(l: Int, w: Int, h: Int): Int {
    var list = arrayListOf(l, w, h)
    list.remove(max(max(l, w), h))

    return 2 * list[0] + 2 * list[1]
}

fun total_ribbon(l: Int, w: Int, h: Int): Int {
    return box_ribbon(l, w, h) + bow_ribbon(l, w, h)
}

fun part_2(input: List<Triple<Int, Int, Int>>): Int {
    return input.map { total_ribbon(it.first, it.second, it.third) }.sum()
}

fun main() {
    var lines = generateSequence(::readLine).toList()
    var input =
            lines.map {
                val (l, w, h) = it.split("x")
                Triple(Integer.parseInt(l), Integer.parseInt(w), Integer.parseInt(h))
            }

    println("Part 1: ${part_1(input)}")
    println("Part 2: ${part_2(input)}")
}
