package kotlinInAction.ch04

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

val listener =  object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
    }

    override fun mouseEntered(e: MouseEvent?) {
        super.mouseEntered(e)
    }
}

//자바와 달리 final이 아닌 변수도 객체 식 내부에서 사용할 수 있다.
fun countClicks(window: Window) {
    var clickCount = 0
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            clickCount++
        }
    })
}