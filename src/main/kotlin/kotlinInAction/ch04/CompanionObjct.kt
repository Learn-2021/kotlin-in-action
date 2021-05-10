package kotlinInAction.ch04

class User3 {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(facebookAccountId: Int): String = "temp"
}

class User4 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User4(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) {
            //logic..
        }
    }
}

fun main() {
    val subscribingUser: User4 = User4.newSubscribingUser("bob@email.com")
    println(subscribingUser.nickname)
}