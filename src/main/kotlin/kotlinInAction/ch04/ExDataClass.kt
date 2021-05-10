package kotlinInAction.ch04

fun main() {
    val client01 = Client("오현석", 4422)
    val client02 = Client("오현석", 4422)

    println(client01 == client02)

    //hashcode를 오버라이딩 하지 않은 경우
    val processed = hashSetOf(Client("이지훈", 4122))
    //equals를 오버라이딩 했으니 true를 반환할 것 같지만 false를 반환
    println(processed.contains(Client("이지훈", 4122)))

    //data class
    println(Client2("코코", 1224))
    val processed2 = hashSetOf(Client2("이지훈", 4122))
    println(processed2.contains(Client2("이지훈", 4122)))
}

//equals(), hashCode(), toString()을 직접 오버라이딩하는 대신,
//data class로 해결할 수 있다.
data class Client2(val name: String, val  postalCode: Int)

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}