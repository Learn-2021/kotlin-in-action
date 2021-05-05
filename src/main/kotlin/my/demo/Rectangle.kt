package my.demo

/*
*  Classes are final by default;
* */
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

//The default constructor with parameters listed
//in the class declaration is available automatically.
//클래스 선언에 나열된 매개변수가 있는 기본 생성자는 자동 생성됨.
fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}