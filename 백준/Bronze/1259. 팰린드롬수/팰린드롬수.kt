fun main() {
    while (true){
        var list = readln()
        if(list == "0") break

        var change_list = list.reversed()
        if(list == change_list) println("yes")
        else println("no")
    }

}