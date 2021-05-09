package kotlinInAction.ch03.extensionFunctions

import java.lang.StringBuilder

//확장함수 -> 확장 프로퍼티
//fun String.lastChar(): Char = get(length - 1) 와 같은 프로퍼티
val String.lastChar2: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    println("Kotlin".lastChar2)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}
