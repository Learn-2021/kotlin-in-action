package my.demo

fun main() {
    //Check if a number is within a range using 'in' operator
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in ranges")
    }

    //Check if a number is out of range.
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex)
        println("-1 is out of range")
    if (list.size !in list.indices)
        println("list size is out of valid list indices range, too")

    //iterate over a range.
    for (x in 0..5) {
        print(x)
    }

    println()
    //Or over a progression.
    for (x in 1..10 step 2) {   //1~10까지 2씩 증가
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3)    //9부터 0까지 3씩 감소
        print(x)
}

