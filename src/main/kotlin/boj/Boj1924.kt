package boj

import java.util.*

/**
 * 문제
오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.

출력
첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 */
fun main() {
    val sc = Scanner(System.`in`)
    val month = sc.nextInt()
    val day = sc.nextInt()

    var sumDay = day

    for (i in 0 until month-1)
        sumDay += Months.values()[i].day

    println(DayOfWeek.values()[sumDay % 7])
}

enum class DayOfWeek {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

enum class Months(val day: Int) {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31)
}
