package lms_129

fun task2(number: Int): Boolean {


    var result = true

    if(number <2){
      result = false
    }else{
        for (i in 2 until number){
            if(number % i == 0){
                result= false
                break
            }

        }

    }

    return result

     }


fun main (){
    println(task2(number = 0))
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