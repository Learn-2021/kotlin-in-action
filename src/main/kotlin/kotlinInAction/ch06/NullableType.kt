package kotlinInAction.ch06

//Null이 될 수 있는 프로퍼티를 다루기 위해 안전한 호출 사용하기
class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) : String? = employee.manager?.name

fun main() {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(ceo))
    println(managerName(developer))

    val person = Person("Dmitry", null)
    println(person.countryName())
}
class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)
class Company(val name: String, val address: Address)
class Person(val name: String, val company: Company?)

fun Person.countryName() : String {
    val country = this.company?.address?.country
//    return if (country != null) country else "Unknown"
    return country ?: "Unknown"
}
