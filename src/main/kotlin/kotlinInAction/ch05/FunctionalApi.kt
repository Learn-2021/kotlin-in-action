package kotlinInAction.ch05

fun main() {
    //filter
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })

    val people = listOf(Person("Alice", 22), Person("GO", 31))
    println(people.filter { it.age > 30 })

    //map
    val numbers = listOf(1, 2, 3, 4)
    println(numbers.map { it * it })
    println(people.map { it.name })

    //filter and map
    println(people
            .filter { it.age > 30 }
            .map { Person::name })

    //나이의 최댓값을 구하고 나이가 그 최댓값과 같은 모든 사람을 반환
    //1.
    people.filter { it.age == people.maxByOrNull(Person::age)!!.age}
    //2. 1번 코드는 매번 max를 구하므로 비효율적. 미리 max를 구하고 필터링.
    val maxAge = people.maxByOrNull(Person::age)!!.age
    people.filter { it.age == maxAge }
    
    //필터링 및 변환 함수를 Map에 적용
    val numbers2 = mapOf(0 to "zero", 1 to "one")
    println(numbers2.mapValues { it.value.toUpperCase() })
}