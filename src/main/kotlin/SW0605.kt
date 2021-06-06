import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var testCase = sc.nextInt()

    for (testCount in 1..testCase) {
        val list = mutableListOf<Int>()
        for (n in 0 until sc.nextInt()) {
            list.add(sc.nextInt())
        }
        var sum = 0L
        var max = 0

        for (i in list.lastIndex downTo 0) {
            if (max < list[i]) {
                max = list[i]
            } else {
                var num = max - list[i]
                sum += num
            }
        }

        println("#$testCount $sum")
    }
}

fun calculate(index: Int, list: Int) {

}