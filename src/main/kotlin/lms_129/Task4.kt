package lms_129

fun task4(): Int {

    var totalSum= 0
    for (number in 1..1000) {
        if(number%9==0){
            totalSum += number
        }
    }

    return totalSum

}
fun main(){
    println(task4())

}