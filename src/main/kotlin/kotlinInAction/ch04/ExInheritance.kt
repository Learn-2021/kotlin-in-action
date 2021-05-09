package kotlinInAction.ch04

open class RichButton: Clickable {
    fun disable() {}
    open fun animate() {}
    //오버라이드 하는 메서드 구현을 하위클래스에서 오버라이드 하지 못하게 하려면 명시적으로 final
    final override fun click() {}
}