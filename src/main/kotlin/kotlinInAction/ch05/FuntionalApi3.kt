package kotlinInAction.ch05

fun main() {
    //groupBy
    val list = listOf("a", "ab", "b", "bb")
    println(list.groupBy(String::first))

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    //flatMap으로 작가 리스트 만들기
    val books = listOf(
            Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Thursday Next", listOf("Terry Pratchett", "Neil Gaiman")))

    val authors = books.flatMap { it.authors }.toSet()
    
    println(authors)
}

class Book(val title: String, val authors: List<String>)