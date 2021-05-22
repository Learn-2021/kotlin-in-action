package my.kotlinDocs

fun main () {
    val numbers = listOf<Int>(5, 2, 10, 4, 1)

    /**
     * reduce는 첫 번째 연산에서 인수로 numbers의 첫 번째, 두 번째 요소를 사용하고
     * 그 다음부터 첫 번째 인자는 accumulated.
     *
     * sum : 5, element: 2
     * sum : 7, element: 10
     * sum : 17, element: 4
     * sum : 21, element: 1
     */
    val sum = numbers.reduce { sum, element -> sum + element}
    println(sum)
    println("-----------------------------")

    /*
    * fold함수의 첫 번째 인자는 accumulate.
    *  reduce와 다르게, accumulate 초기 값을 인수로 받는다.
    *
    * sum : 0, element: 5
    * sum : 10, element: 2
    * sum : 14, element: 10
    * sum : 34, element: 4
    * sum : 42, element: 1
    * */
    val sumDoubled = numbers.fold(0) { sum, element -> sum + element * 2 }
    println(sumDoubled)
    println("---------------------------------")

    //reverse연산은 arguments도 거꾸로다.
    val sumDoubleRight = numbers.foldRight(0) { element, sum -> sum + element * 2 }
    println(sumDoubleRight)
    println("---------------------------------")

    /**
     * numbers의 인덱스를 매개변수로 사용하는 연산도 가능하다.
     *
     * idx: 0, sum: 0, element: 5
     * idx: 1, sum: 5, element: 2
     * idx: 2, sum: 5, element: 10
     * idx: 3, sum: 15, element: 4
     * idx: 4, sum: 15, element: 1
     * */
    val sumEven = numbers.foldIndexed(0) {idx, sum, element -> if (idx % 2 == 0) sum + element else sum}
    println("sumEven : $sumEven")
    println("---------------------------------")

    val sumEvenRight = numbers.foldRightIndexed(0) { idx, element, sum -> if (idx % 2 == 0) sum + element else sum}
    println(sumEvenRight)
}