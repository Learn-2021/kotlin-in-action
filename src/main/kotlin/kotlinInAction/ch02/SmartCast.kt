package my

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr //value라는 프로퍼티를 가지는 Expr의 구현체
class Sum(val left: Expr, val right: Expr) : Expr //Expr타입이라면 무엇이든 Sum의 인자가 될 수 있다.


fun main() {
    println(eval2(Sum(Num(1), Num(2))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun evalWithLogging(e: Expr): Int =
    when(e) {
        is Num -> {
            println("Num : ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum : $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
}

//중첩 if대신 when사용하기
fun eval3(e: Expr): Int =
    when(e) {
        is Num -> e.value
        is Sum -> eval3(e.left) + eval3(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

//kotlin style
fun eval2(e: Expr): Int =
    if (e is Num)
        e.value
    else if (e is Sum)
        eval2(e.right) + eval2(e.left)
    else
        throw IllegalArgumentException("Unknown expression")

//java style
fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num //as Num으로 타입 캐스팅하는 것은 불필요한 중복
        return n.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}