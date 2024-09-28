import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var time = nextInt()
    var min = nextInt()
    
    min = min-45
    
    if(min<0) {
        time=time-1
        min=min+60
    }
    
    if(time<0){
        time=time+24
    }
    
    println("$time $min")
}