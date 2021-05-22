package kotlinInAction.ch06

import java.lang.IllegalArgumentException

fun main() {
    println(strLenSafe("abc"))
    println(strLenSafe(null))

    val address = Address2("Elsestr. 47", 80687, "Munchi", "Germany")
    val jetbrains = Company2("JetBrains", address)
    val person = Person2("Dmitry", jetbrains)

    printShippingLabel(person)
    printShippingLabel(Person2("Alexey", null))
}

fun strLenSafe(s: String?): Int = s?.length ?: 0

class Address2(val streetAddress: String, val zipCode: Int,
               val city: String, val country: String?)
class Company2(val name: String, val address: Address2?)
class Person2(val name: String, val company: Company2?)

fun printShippingLabel(person: Person2) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city $country")
    }
}
