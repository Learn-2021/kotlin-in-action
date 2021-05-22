package kotlinInAction.ch06

class PersonS(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonS ?: return false

        return otherPerson.firstName == firstName
                && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = PersonS("Dmitry", "Jemerov")
    val p2 = PersonS("Dmitry", "Jemerov")

    println(p1 == p2)
    println(p1.equals(42))
}