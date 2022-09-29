package lms_129

fun task4(): Int {

 var totalSum= 0
    for(number in 1..10000){

        if (number%9==0){
            totalSum= totalSum + number
        }
    }
    return totalSum

}

fun main(){
     task4()

}