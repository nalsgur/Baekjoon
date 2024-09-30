fun main() {
    //26 >> 68
    var target_input = readln().toInt()
    var guess : Int
    var time = 0
    var target = target_input

    do {
        if(target / 10 == 0) {
            var plus = ((target/10) + (target%10))%10
            guess = (target%10)*10 + plus
        }else{
            var plus = ((target/10) + (target%10))%10
            guess = ((target%10)*10) + plus
        }

        target = guess

        time++
    }while (target_input != guess)

    print("$time")
}