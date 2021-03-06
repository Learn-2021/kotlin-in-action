package kotlinInAction.ch05

import java.util.*

fun printMessageWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach{
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")

}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error: ")

    val responses = listOf<String>("200 OK", "418 I'am a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}