package my.kotlinDocs

//A function with two 'Int' parameters and 'Int' return type.
fun sum(a: Int, b: Int): Int {
    return a + b
}

//A function body can be an expression. It's return type is inferred.
fun sum2(a: Int, b: Int) = a + b

//A function that returns no meaningful value(?).
//'Unit'생략 가능
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

