package my.kotlinDocs

//You can declare variables at the top level.
val PI = 3.14
var z = 0

fun main() {
    //Read-only local variables are defined using the keyword 'val'.
    //They can be assigned a value only once.
    val a: Int = 1 //즉시 할당immediate assignment
    val b = 2   //'Int' type is inferred. 타입 추론
    val c: Int //Type required when no initializer is provided 초기화 없을 시 타입 필요
    c = 3
    //b = 2 error.

    //Variables that can be reassigned use the 'var' keyword.
    var x = 5;  //'Int' type is inferred.
    x += 1
}