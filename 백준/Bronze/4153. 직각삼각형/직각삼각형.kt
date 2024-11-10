fun main() {
    var a : Int
    var b : Int
    var c : Int
    while(true) {
        var size = readln().split(" ").map { it.toInt() }
        size = size.sorted()
        a = size[0]
        b = size[1]
        c = size[2]
        if(a==0 && b==0 && c==0) break
        if (c * c == ((a * a) + (b * b))) println("right")
        else println("wrong")
    }
}
