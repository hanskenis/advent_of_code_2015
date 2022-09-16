fun move(input: Char): Int {
    when(input) {
        '(' -> return 1
        ')' -> return -1
    }
    return 0
}

fun part_1(input: String): Int {
    var floor = 0;

    input.forEach {
       floor += move(it);
    }

    return floor
}

fun part_2(input: String): Int {
    var floor = 0;
    var index = 1;

    input.forEach{
        floor += move(it);
        if (floor == -1){
            return index;
        }
        index++;
    }
    return index;
}

fun main() {
    var input = readln()

    println("Part 1: ${part_1(input)}")
    println("Part 2: ${part_2(input)}")

}