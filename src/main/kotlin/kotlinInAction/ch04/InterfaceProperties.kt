package kotlinInAction.ch04

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User //primary constructor

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

//class FacebookUser(val accountId: Int) : User {
//    override val nickname = getFacebookName(accountId)
//}

fun main() {
    println(PrivateUser("test@kotlin.org").nickname)
    println(SubscribingUser("test@kotlin.org").nickname)
}