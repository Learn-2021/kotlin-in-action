package kotlinInAction.ch05

val sum = { x: Int, y: Int -> x + y}

fun main() {
    println(sum(2, 7))

    val people = listOf(
        Person4("k", 88),
        Person4("w", 2),
        Person4("q", 89),
        Person4("a", 34)
    )

    findTheOldest(people)
    //람다를 이용하는 방식

    println(people.maxByOrNull(Person4::age))
    println(people.maxByOrNull{ p -> p.age })
    println(people.maxByOrNull{ it.age })

    val getAge = {p: Person4 -> p.age}
    println(getAge)
}

//(람다를 이용하지 않은)가장 나이 많은 사람 찾기
fun findTheOldest(people: List<Person4>) {
    var maxAge = 0
    var theOldest: Person4? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println("The Oldest Person: $theOldest")
}

data class Person4(val name:String, val age:Int)