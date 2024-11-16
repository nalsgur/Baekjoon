fun main() {
    // 입력 받기
    val (r, c) = readln().split(" ").map { it.toInt() }
    val card = Array(r) { readln().toCharArray() }
    val (x, y) = readln().split(" ").map { it.toInt() - 1 }

    // 확장된 카드 배열 생성
    val fullCard = Array(2 * r) { CharArray(2 * c) }

    // 원본 카드 복사 및 대칭 생성
    for (i in 0 until r) {
        for (j in 0 until c) {
            // 4구역에 대칭값 채우기
            fullCard[i][j] = card[i][j] // 1사분면
            fullCard[i][2 * c - j - 1] = card[i][j] // 2사분면
            fullCard[2 * r - i - 1][j] = card[i][j] // 3사분면
            fullCard[2 * r - i - 1][2 * c - j - 1] = card[i][j] // 4사분면
        }
    }

    // 반전 처리
    fullCard[x][y] = if (fullCard[x][y] == '#') '.' else '#'

    // 결과 출력
    fullCard.forEach { println(it.concatToString()) }
}
