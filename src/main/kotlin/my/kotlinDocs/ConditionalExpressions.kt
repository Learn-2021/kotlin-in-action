package my.kotlinDocs

fun main() {
    println(maxOf(1, 2))
    println(maxOf2(1, 2))
}
fun maxOf(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

//in Kotlin, 'if' can also be used as an expression
fun maxOf2(a: Int, b: Int) = if (a > b) a else b