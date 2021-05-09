package kotlinInAction.ch03

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println(" Dir: $directory\n name: $fileName\n ext: $extension")
}

//경로 파싱에서 정규식 이용하기
fun parsePathWithRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println(" Dir: $directory\n name: $fileName\n ext: $extension")
    }
}

fun main() {
    parsePath("/Users/yole/kotlin-book/chanter.adoc")
    println("-------------------------------------------")
    parsePathWithRegex("/Users/yole/kotlin-book/chanter.adoc")
}