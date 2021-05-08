package extensionFunctions

fun String.lastChar(): Char = get(length - 1)

fun main() {
    println("Hello stranger?".lastChar())

    val view: View = Button()
    println(view.click())
    //extension functions은 오버라이드 할 수 없다.
    println(view.showOff())
}

fun View.showOff() = println("I'm a view.")
fun Button.showOff() = println("I'm a button")

open class View {
    open fun click() = println("View Click!")
}

class Button: View() {
    override fun click() = println("Button Click!")
}