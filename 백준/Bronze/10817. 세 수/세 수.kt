import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var a = nextInt()
    var b = nextInt()
    var c = nextInt()
    
    if(a<=b && a<=c){
        if(b<c) println("$b")
        else println("$c")
    }
    else if(b<=a && b<=c){
        if(a<c) println("$a")
        else println("$c")
    }
    else {
        if(a<b) println("$a")
        else println("$b")
    }
}