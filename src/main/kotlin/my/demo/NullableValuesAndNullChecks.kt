package my.demo

/*
* 참조는 null값이 가능한 경우 명시적으로 nullable로 표시해야 한다.
* Nullable이라면 끝에 '?'를 붙인다
* */
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number");
    }
}

fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}
