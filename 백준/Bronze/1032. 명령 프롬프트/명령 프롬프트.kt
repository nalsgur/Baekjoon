fun main() {
    val size = readln().toInt()
    val list = arrayListOf<String>()

    // 입력받기
    for (i in 0 until size) {
        list.add(readln())
    }

    // 첫 번째 파일 이름을 기준으로 결과를 초기화
    val result = StringBuilder(list[0])

    // 나머지 파일들과 비교하여 '?'로 변경
    for (i in 1 until size) {
        for (j in result.indices) {
            if (result[j] != list[i][j]) {
                result.setCharAt(j, '?') // 일치하지 않으면 '?'로 대체
            }
        }
    }

    // 결과 출력
    println(result.toString())
}
