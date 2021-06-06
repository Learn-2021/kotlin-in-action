package boj

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val list = mutableListOf<Int>()

    for (i in 0 until n)
        list.add(sc.nextInt())

//    println("${list.minOrNull()} ${list.maxOrNull()}")
    println("${min(list)} ${max(list)}")
}

fun min(list: MutableList<Int>): Int {
    var min = list[0]

    for (i in 1 until list.size)
        if (list[i] < min) min = list[i]

    return min
}

fun max(list: MutableList<Int>): Int {
    var max = list[0]

    for (i in 1 until list.size)
        if (list[i] > max) max = list[i]

    return max
}