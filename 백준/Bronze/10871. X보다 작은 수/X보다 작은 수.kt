fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val numbers = readLine()!!.split(" ").map { it.toInt() }

    val result = numbers.filter { it < x } 
    println(result.joinToString(" ")) 
}
