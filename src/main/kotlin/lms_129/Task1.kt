 package lms_129

fun task1(a: Int, b: Int): Int {



    var result = 0

    if (a < b) for (number in a..b)

        result += number
    println("$result")

    return result



}

fun main (){
    task1(a=1, b=5)
}









/*
 // Adding numbers from 1 to 10
 var totalSum = 0
 for (number in 1..10) {
     totalSum = totalSum + number
 }*/