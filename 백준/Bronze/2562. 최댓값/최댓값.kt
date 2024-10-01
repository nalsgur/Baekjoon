fun main() {
    var input_list = arrayListOf(0,0,0,0,0,0,0,0,0)

    for (i in 0..8) {
        input_list[i] = readln().toInt()
    }

    var max_num = input_list.max()
    var time = 0

    for (i in 0..8) {
        if(input_list[i] == max_num){
            time = i+1
        }
    }

    println("$max_num")
    println("$time")
}