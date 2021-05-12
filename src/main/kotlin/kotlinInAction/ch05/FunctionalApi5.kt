package kotlinInAction.ch05

fun main() {
    //직접 무명 객체를 선언하는 경우, 함수를 호출할 때마다 인스턴스가 만들어진다.
    postponeComputation(1000, object : Runnable {
        override fun run() {
            println(42)
        }
    })

    //람다를 사용하는 경우 인스턴스를 재사용한다.
    postponeComputation(1000) { println(42) }

    //람다를 사용하지 않으면서 람다처럼 인스턴스를 재사용
    val runnable = Runnable { println(42) }
    postponeComputation(1000, runnable)

    createAllDoneRunnable().run()
}

//SAM(Single Abstract Method)생성자를 사용해 값 반환하기
fun createAllDoneRunnable() : Runnable {
    return Runnable { println("All done!") }
}

fun postponeComputation(delay: Int, computation: Runnable) {
    //...
}
