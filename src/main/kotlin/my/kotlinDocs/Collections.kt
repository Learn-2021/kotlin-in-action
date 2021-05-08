package my.kotlinDocs

fun main() {
    //iterate over a collection.
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items)
        println("item is ${item}")

    //Check if a collection contains an object using 'in' operator.
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too!")
    }

    //Using lambda expressions to filter and map collections:
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}