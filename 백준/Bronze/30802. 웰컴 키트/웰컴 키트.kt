fun main() {
    val N = readln().toInt()
    var list = readln().split(" ").map {it.toInt()}
    val (T,P) = readln().split(" ").map {it.toInt()}

    val result2 = N/P
    val result3 = N%P

    var count = 0
    for (i in list){
        count += (i+T-1) / T
    }

    println(count)


    println("$result2 $result3")
}