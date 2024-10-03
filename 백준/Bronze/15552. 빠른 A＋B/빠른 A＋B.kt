import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine().toInt()
    for (i in 0 until size) {
        val (num1, num2) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${num1 + num2}\n")
    }

    bw.flush()
    bw.close()
}
