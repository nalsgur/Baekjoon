fun main() {
    val scores = IntArray(10) { readLine()!!.toInt() }  // 10개의 점수 입력받기
    var sum = 0
    var result = 0

    for (score in scores) {
        sum += score
        if (Math.abs(100 - sum) <= Math.abs(100 - result)) {
            result = sum
        }
    }

    println(result)
}
