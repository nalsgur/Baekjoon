fun main() {
    // 테스트 케이스 수 입력
    val testcase = readln().toInt()

    for (i in 0 until testcase) {
        // 입력된 데이터를 공백으로 구분하여 리스트로 변환
        val input = readln().split(" ").map { it.toInt() }

        // 첫 번째 값은 학생 수
        val studentCount = input[0]

        // 두 번째 값부터는 학생들의 점수
        val scores = input.subList(1, input.size)

        // 평균 계산
        val average = scores.average()

        // 평균을 넘는 학생 수 계산
        val aboveAverageCount = scores.count { it > average }

        // 평균을 넘는 학생들의 비율 계산
        val percentage = aboveAverageCount * 100.0 / studentCount

        // 소수점 셋째 자리까지 출력
        println(String.format("%.3f%%", percentage))
    }
}
