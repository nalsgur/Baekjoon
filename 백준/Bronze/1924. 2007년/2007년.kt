fun main() {
    val (month, day) = readLine()!!.split(" ").map { it.toInt() }

    // 각 월의 일수를 배열에 저장 (2월은 28일로 고정)
    val daysInMonth = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    // 요일 배열 (0 = 월요일, 6 = 일요일)
    val daysOfWeek = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

    // 주어진 월 이전까지의 총 일수를 계산
    var totalDays = 0
    for (i in 1 until month) {
        totalDays += daysInMonth[i]
    }

    // 해당 월의 일수를 더함
    totalDays += day - 1

    // 2007년 1월 1일이 월요일이므로, 총 일수를 7로 나눈 나머지를 이용해 요일을 계산
    val dayOfWeek = daysOfWeek[totalDays % 7]

    println(dayOfWeek)
}
