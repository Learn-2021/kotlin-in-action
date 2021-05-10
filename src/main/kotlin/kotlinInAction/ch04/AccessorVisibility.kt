package kotlinInAction.ch04

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    var lengthCounter = LengthCounter()
    lengthCounter.addWord("12")
    lengthCounter.addWord("34")

    println(lengthCounter.counter)
}