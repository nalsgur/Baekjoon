fun main() {
    val total_money = readln().toInt()
    val count = readln().toInt()
    var result = 0

    for (i in 1 .. count) {
        val input = readln().split(" ").map {it.toInt()}
        result += (input[0]*input[1])
    }
    if(total_money == result) println("Yes")
    else println("No")
}