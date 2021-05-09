package kotlinInAction.ch04

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

internal fun TalkativeButton.giveSpeech() {
//    확장함수는 protected, private에 접근할 수 없다.
//    yell()
//    whisper()
}