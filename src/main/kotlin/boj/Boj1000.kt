package boj

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.next()

    for (i in input.indices) {
        print(input[i])
        if (i % 10 == 9) println("$i % 10 == 9")
    }
}