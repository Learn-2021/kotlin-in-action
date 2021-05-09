package kotlinInAction.ch04

interface Clickable {
    fun click()
    //default method
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if(b) "got" else "lost"} focus")
    fun showOff() = println("I'm focusable!")
}


class Button : Clickable, Focusable {
    override fun click() = println("I was clicked!")
    /*
    *   두 개의 인터페이스를 구현하는데, 각 인터페이스에 같은 이름의 디폴트 메서드가 존재한다면
    *   직접 오버라이딩해서 사용해야 한다.
    * */
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.click()
    button.setFocus(true)
    button.showOff()
}