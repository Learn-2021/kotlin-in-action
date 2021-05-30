package algorithms

fun main() {
    val result = BoggleGame().hasWord(1, 1, "RETTY") // false
    val result2 = BoggleGame().hasWord(1, 1, "PRETTY") // true
    println(result)
    println(result2)
}

class BoggleGame {
    val DX = intArrayOf(-1, -1, -1, 1, 1, 1, 0, 0)
    val DY = intArrayOf(-1, 0, 1, -1, 0, 1, -1, 1)

    //5x5 boggle game에서 주어진 단어가 시작하는지 반환
    fun hasWord(y: Int, x:Int, word:String): Boolean {
        //기저 사례1: 시작 위치가 범위 밖이면 무조건 실패
        if (!inRange(y, x)) return false
        //기저 사례2: 첫글자가 일치하지 않으면 실패
        if (board.get(y).get(x) != word[0].toString()) return false
        //기저 사례3: 단어의 길이가 1이면 성공
        if (word.length == 1) return true

        //인접한 여덟 칸 검사
        for (direction in 0..7) {
            val nextY = y + DY.get(direction)
            val nextX = x + DX.get(direction)

            if (hasWord(nextY, nextX, word.substring(1)))
                return true
        }

        return false
    }

    private fun inRange(y: Int, x: Int): Boolean =
        !((y >= 5 || 0 > y) || (x >= 5 || 0 > x))

    //5x5 board
    private var board: Array<Array<String>> = arrayOf(
        arrayOf("U", "R", "L", "P", "M"),
        arrayOf("X", "P", "R", "E", "T"),
        arrayOf("G", "I", "A", "E", "T"),
        arrayOf("X", "T", "N", "Z", "Y"),
        arrayOf("X", "O", "Q", "R", "S")
    )
}