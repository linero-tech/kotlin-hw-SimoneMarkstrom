package lms_133


    fun harshad(number: Int): Boolean{

        val numberAsString = number.toString()
        var total = 0

        for(digit in numberAsString){
            total += digit.digitToInt()
        }
        return number % total == 0
    }
    fun main(){
        println(harshad(number = 22))
    }

// What is the number?
//Is the number a harshad? How do we count that?
// If number is harshad result = true, else result = false