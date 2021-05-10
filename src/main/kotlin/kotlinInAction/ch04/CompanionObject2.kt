package kotlinInAction.ch04

//동반 객체에 대한 확장함수 정의하기
class Person3(val firstName: String, val lastName: String) {
    companion object {
        //...
    }
}

// client - server 통신 모듈
fun Person3.Companion.fromJSON(json: String) : Person3 {
    //...
    return Person3(json, "lastName")
}

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person2(val name: String) {
    companion object : JSONFactory<Person2> {
        override fun fromJSON(jsonText: String): Person2 {
            return Person2(jsonText)
        }
    }
}

fun main() {
    val person = Person2.fromJSON("{name: 'coco'}")
    println(person.name)

    val p = Person3.fromJSON("{name: 'zzz'}")
    println(p.firstName)
}