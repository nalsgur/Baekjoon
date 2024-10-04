fun main() {
    val input = readLine()!!.toUpperCase()

    val count = IntArray(26)

    for (char in input) {
        count[char - 'A']++
    }

    var max = -1
    var maxChar = '?'

    for (i in count.indices) {
        if (count[i] > max) {
            max = count[i]
            maxChar = 'A' + i
        } else if (count[i] == max) {
            maxChar = '?'
        }
    }
    println(maxChar)
}
