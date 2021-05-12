package kotlinInAction.ch05

fun main() {
    val people = listOf(Person("Alice", 22), Person("GO", 31))

    val nameStartsWithA = people.asSequence()
            .map { Person::name }
            .filter { it.toString().startsWith("A") }
            .toList()

    println(nameStartsWithA)

    //중간연산은 항상 지연된다. 결과를 얻어야 할 때
    //즉, 최종연산을 사용하기 전까지 연산은 지연된다.
     listOf(1, 2, 3, 4).asSequence()
         .map { print("map($it) "); it * it }
         .filter { print("filter($it) "); it % 2 == 0 }
//         .toList()

    //시퀀스를 사용하는 경우
    println(listOf(1, 2, 3, 4).asSequence()
        .map { it * it }
        .find { it > 3 })

    println("---------------------")

    val people2 = listOf(
        Person("Alice", 29),
        Person("Bob", 32),
        Person("Charles", 31),
        Person("Dan", 21))

    println(people2.asSequence()
        .map { Person::name }
        .filter { it.toString().length < 4 }
        .toList())

    println(people2.asSequence()
        .filter { it.name.length < 4 }
        .map { Person::name }
        .toList())
}