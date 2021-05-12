package kotlinInAction.ch05

import java.lang.StringBuilder
import javax.naming.Context

fun main() {
    val alphabet4: StringBuilder = alphabet4()
    val alphabet5: String = alphabet5()
}

//apply는 with와 거의 유사하다.
//다만 apply는 자신에게 전달된 객체(수신 객체)를 반환한다.
fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

//buildString라이브러리 활용하기
fun alphabet5() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}