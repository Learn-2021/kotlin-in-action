package kotlinInAction.ch05

fun main() {
    //예제 1
    run(::salute)

    //예제 2
    val createPerson = :: Person
    val p = createPerson("Alice", 29)
    println(p)

    //예제3
    fun Person.isAdult() = age >= 21
    val predicate = Person::isAdult
    println(predicate(p))

    //예제3 바운드 멤버 참조
    val p2 = Person("Tester", 22)
    val personAgeFunction = Person::age
    println(personAgeFunction(p2))
    //바운드 멤버 참조로 수정
    val hoonAgeFunction = p2::age
    val hoonNameFunction = p2::name
    println(hoonAgeFunction())
    println(hoonNameFunction())
}

//이 람다는 sendEmail함수에게 작업을 위임한다.
val action = {person: Person, message: String ->
    sendMail(person, message)
}

//람다 대신 멤버 참조 사용 가능
val nextAction = ::sendMail

data class Person(val name: String, val age: Int)

fun sendMail(person: Person, message: String): Any {
    //..
    return ""
}

fun salute() = println("Salute")