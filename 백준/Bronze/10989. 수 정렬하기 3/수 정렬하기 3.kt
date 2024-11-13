import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    // 입력된 수의 최대값인 10,000 크기의 배열 생성
    val count = IntArray(10001)

    // 리스트 크기 입력
    val listSize = br.readLine().toInt()

    // 각 숫자의 등장 횟수를 저장
    for (i in 0 until listSize) {
        val num = br.readLine().toInt()
        count[num]++
    }

    // 정렬된 결과를 출력
    for (i in 1..10000) {
        repeat(count[i]) {
            bw.write("$i\n")
        }
    }

    // BufferedWriter를 비우고 종료
    bw.flush()
    bw.close()
}
