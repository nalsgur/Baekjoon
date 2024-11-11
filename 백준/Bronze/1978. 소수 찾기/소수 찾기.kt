fun main() {
    val case = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    var count = 0

    for (number in list) {
        if (isPrime(number)) {
            count += 1
        }
    }

    println(count)
}

// 소수 판별 함수
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
