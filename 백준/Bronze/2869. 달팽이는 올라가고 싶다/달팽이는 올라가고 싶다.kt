fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val A = input[0]
    val B = input[1]
    val C = input[2]

    // 수식을 통해 필요한 날짜 계산
    val days = (C - B - 1) / (A - B) + 1

    println(days)
}
