package iteration

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz!"
    i % 3 == 0 -> "Fizz!"
    i % 5 == 0 -> "Buzz!"
    else -> "${i}"
}

fun main() {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    //100부터 거꾸로 2씩 증감시키는 루프
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}