package iteration

import java.util.*

fun main() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    //다른 컬렉션에도 구조분해할당 적용 가능
    val list = arrayListOf("10", "11", "1101")
    for ((index, element) in list.withIndex()) {
        println("$index : $element")
    }
}