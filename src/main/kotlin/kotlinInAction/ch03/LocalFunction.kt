package kotlinInAction.ch03

import java.lang.IllegalArgumentException

fun main() {
    //saveUser(User(1, "", ""))
    saveUser2(User(1, "kong", ""))
}

class User(val id: Int, val name: String, val address: String)

//로컬 함수를 확장 함수로 만들어서 개선
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser3(user: User) {
    user.validateBeforeSave()
}

//함수 안에 로컬 함수를 사용해 중복 줄이기
fun saveUser2(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}


fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty name")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty address")
    }
    //user를 데이터베이스에 저장한다
}
