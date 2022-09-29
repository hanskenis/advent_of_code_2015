package day_03

fun move(char: Char): Pair<Int, Int> {

        when (char) {
                '>' -> return Pair(1, 0)
                '<' -> return Pair(-1, 0)
                '^' -> return Pair(0, 1)
                'v' -> return Pair(0, -1)
        }
        throw Exception("invalid input")
}

fun part_1(input: String): Int {
        var (x, y) = 0 to 0
        val set = mutableSetOf("$x $y")

        input.forEach {
                val delta = move(it)
                x += delta.first
                y += delta.second
                set.add("$x $y")
        }

        return set.size
}

fun part_2(input: String): Int {
        var (santaX, santaY) = 0 to 0
        var (robotX, robotY) = 0 to 0
        val set = mutableSetOf("0 0")

        input.forEachIndexed { index, it ->
                val delta = move(it)

                if (index % 2 != 0) {
                        robotX += delta.first
                        robotY += delta.second
                        set.add("$robotX $robotY")
                } else {
                        santaX += delta.first
                        santaY += delta.second
                        set.add("$santaX $santaY")
                }
        }

        return set.size
}

fun main() {
        var lines = generateSequence(::readLine).toList()
        var input = lines.single()

        println("Part 1: ${part_1(input)}")
        println("Part 2: ${part_2(input)}")
}
