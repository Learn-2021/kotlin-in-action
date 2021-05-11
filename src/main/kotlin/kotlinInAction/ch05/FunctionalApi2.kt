package kotlinInAction.ch05

//collection에 술어(predicate)적용
fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 22), Person("GO", 31))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))

    println()

    val list = listOf(1, 2, 3, 4, 1, 1)
    println(list.any{it == 1})
    println(list.all { it == 1 })

    //count()
    println(list.count{ it == 1 })

    //술어에 만족하는 원소 찾기. find는 firstOrNull과 같다
    val findedPerson = people.find(canBeInClub27)
    println(findedPerson)
}