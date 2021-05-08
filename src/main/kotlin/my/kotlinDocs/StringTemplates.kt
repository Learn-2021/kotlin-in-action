package my.kotlinDocs

fun main() {
    var a = 1
    //simple name in template:
    val s1 = "a is $a"

    a = 2
    //arbitrary(임의적인) expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s1)
    println(s2)
}