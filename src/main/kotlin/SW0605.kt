import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val tc = sc.nextInt() //Test Case의 수

    for (t in 1..tc) {
        var N = sc.nextInt()
        val list = mutableListOf<Int>()

        for (n in 0 until N)
            list.add(sc.nextInt())

        var max = list.last()
        var sum = 0L

        for (i in list.lastIndex-1 downTo 0) {
            if (max < list[i])
                max = list[i]
            else
                sum += (max - list[i])
        }

        println("#$t $sum")
    }
}