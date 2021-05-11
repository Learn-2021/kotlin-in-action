package kotlinInAction.ch05

fun main() {
    val people = listOf(Person("Alice", 22), Person("GO", 31))

    val nameStartsWithA = people.asSequence()
            .map { Person::name }
            .filter { it.toString().startsWith("A") }
            .toList()

    println(nameStartsWithA)
}