fun main() {
    val remainders = mutableSetOf<Int>() 
    repeat(10) { 
        val num = readLine()!!.toInt() 
        remainders.add(num % 42) 
    }
    println(remainders.size) 
}
