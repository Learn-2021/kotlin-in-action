package my.kotlinDocs


fun main() {
    //숫자에 대한 기본 연산
    val numbers = listOf<Int>(6, 42, 10, 4)

    println("Count: ${numbers.count()}")
    println("Max: ${numbers.maxOrNull()}")
    println("Min: ${numbers.minOrNull()}")
    println("Average: ${numbers.average()}")
    println("Sum : ${numbers.sum()}")
    println("-------------------------------")

    /*
    *  maxByOrNull() 또는 minByOrNull()는 가장 크거나 가장 작은 값을 반환한다.
    * */
    val numbers2 = listOf<Int>(5, 69, 42, 10, 4, 12, 6, 45)
    val min3Remainder = numbers2.minByOrNull {
        //가장 처음으로 3으로 나누어지는 수를 반환한다.
        println("${it} % 3 = ${it % 3}")
        it % 3
    }

    println("min3Remainder : $min3Remainder")
    println("---------------------------------")

    val strings = listOf<String>("one", "two", "three", "four", "longest-string")
    val longestString = strings.maxWithOrNull(compareBy { it.length })

    println(longestString)
    println("------------------------------")

    println(numbers2.sumOf { println("it * 2 = ${it * 2}"); it * 2 })
    println(numbers2.sumOf { println("it.toDouble() / 2 = ${it.toDouble() / 2}");  it.toDouble() / 2})
}
