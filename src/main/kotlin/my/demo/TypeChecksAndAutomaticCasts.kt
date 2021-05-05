package my.demo

/*
* 'is'연산자는 expression이 그 타입의 인스턴스인지 체크한다.
* 변경 불가능한(immutable) 지역 변수 또는 속성은 타입이 확인되면
* 명시적으로 캐스팅하지 않아도 된다.
* */

fun getStringLength(obj: Any): Int? {
    if (obj is String)
        //'obj' is automatically cast to 'String' in this branch
        return obj.length

    //'obj' is still of type 'Any'.
    return null
}

//Or

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    //obj는 자동으로 이 블럭에서 String으로 캐스팅됨
    return obj.length
}

//Or

fun getStringLength3(obj: Any): Int? {
    //'obj' is automatically cast to 'String' on the right-hand of '&&'
    if (obj is String && obj.length > 0)
        return obj.length

    return null
}

fun main() {
    fun printLength(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength3(obj) ?: "Error: The object is not a String"}")
    }
    printLength("Incomprehensibilities")
    printLength("")
    printLength(1000)
}