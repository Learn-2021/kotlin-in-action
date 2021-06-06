package boj

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    for (i in 0 until sc.nextInt()) {
        for (j in 0..i)
            print("*")
        println()
    }
}