fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() } // 첫 번째 줄 입력
    val numbers = readLine()!!.split(" ").map { it.toInt() } // 두 번째 줄 입력

    val result = numbers.filter { it < x } // X보다 작은 수 필터링
    println(result.joinToString(" ")) // 결과 출력
}
