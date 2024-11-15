import kotlin.math.abs

fun main() {
    var (a,b) = readln().split(" ").map { it.toInt() }
    println(gcd(a,b))
    println(lcm(a,b))
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) abs(a) else gcd(b, a % b)
}
fun lcm(a: Int, b: Int): Int {
    return abs(a * b) / gcd(a, b)
}
