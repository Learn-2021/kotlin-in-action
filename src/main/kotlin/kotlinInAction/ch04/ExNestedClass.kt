package kotlinInAction.ch04

import java.io.Serializable
import java.lang.IllegalArgumentException

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button2: View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {
        super.restoreState(state)
    }
    class ButtonState : State {}
}

//inner클래스
class Outer {
    inner class Inner {
        fun getOuterReference() : Outer = this@Outer
    }
}