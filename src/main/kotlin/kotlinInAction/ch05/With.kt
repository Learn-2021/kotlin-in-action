package kotlinInAction.ch05

import java.lang.StringBuilder

fun main() {
    println(alphabet())
}

//with를 사용하지 않을 때 'result'를 반복해야 한다.
fun alphabet(): String {
    val result = StringBuilder()

    for (letter in 'A'..'Z') {
        result.append(letter)
    }

    result.append("\nNow I know the alphabet")
    return result.toString()
}

//with를 사용하여 리팩토링
fun alphabet2() : String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet")
        this.toString()
    }
}

//with와 식을 본문으로 하는 함수를 활용해 알파벳 만들기
fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
    toString()
}