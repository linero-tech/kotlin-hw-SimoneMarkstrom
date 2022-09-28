package lms_129

fun task2(number: Int): Boolean {


    var result = false

    for (i in 2.. number/2)

        if(number % 2 == 0){
            result= true
             break
        }

    if (!result)
        println("$number is a primenumber")

    else
        println("$number is not a primenumber")


 return result

     }


fun main (){
    task2(number = 6)
}



/*
fun main(args: Array<String>) {
    val num = 29
    var flag = false
    for (i in 2..num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}
 */