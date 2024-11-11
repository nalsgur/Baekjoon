fun main() {
    val inputNum = readln().toInt()
    
    for (i in 1 until inputNum) {
        var testNum = i
        var guessNum = i

        while (testNum > 0) {
            guessNum += testNum % 10
            testNum /= 10
        }
        
        if (guessNum == inputNum) {
            println(i)
            return
        }
    }
    
    println(0) 
}
