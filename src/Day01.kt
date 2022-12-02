fun main() {
    fun part1(calorieSumsByElf: List<Int>): Int {
        return calorieSumsByElf.max()
    }

    fun part2(calorieSumsByElf: List<Int>): Int {
        return calorieSumsByElf.sortedDescending().take(3).sum()
    }

    val input = readInput("Day01").iterator()

    val calories = mutableListOf<Int>()
    var currentCalCount = 0

    while (input.hasNext()) {
        val i = input.next()
        if (i.isEmpty()) {
            calories.add(currentCalCount)
            currentCalCount = 0
        } else {
            currentCalCount += i.toInt()
        }
    }

    println(part1(calories))
    println(part2(calories))
}
