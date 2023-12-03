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
    val stringList = readFile("first_problem_input.txt")

    if (stringList == null) {
        println("Couldn't find any file to read :(")
        return -1;
    }

    /*
    TODO: Solve algorithm here :)
     */

    return 0
}

fun secondProblem(): Int {
    return 0
}

fun readFile(fileName: String) =
    object {}.javaClass.getResourceAsStream(fileName)?.bufferedReader()?.readLines()