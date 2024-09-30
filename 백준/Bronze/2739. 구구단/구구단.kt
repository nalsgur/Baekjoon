import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var a = nextInt()

    for (i in 1..9) {
        var result = a*i
        println("$a * $i = $result")
    }
}