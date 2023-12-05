package day_one

import kotlin.system.measureTimeMillis

fun main() {
    val timeInMillis = measureTimeMillis {
        println(firstProblem())
    }

    println("-------------------------------------")
    println("(The operation took $timeInMillis ms)")
}

fun firstProblem(): Int {
    val stringList = readFile("input.txt")

    if (stringList == null) {
        println("Couldn't find any file to read :(")
        return -1;
    }

    var start: Int?
    var end: Int?
    var sum = 0

    stringList.forEach { word ->
        start = null
        end = null

        for (c in word) {
            if (!c.isDigit())
                continue

            if (start == null)
                start = c.digitToInt()

            end = c.digitToInt()
        }

        sum += "$start$end".toInt()
    }

    return sum
}

fun secondProblem(): Int {
    return 0
}

fun readFile(fileName: String) =
    object {}.javaClass.getResourceAsStream(fileName)?.bufferedReader()?.readLines()