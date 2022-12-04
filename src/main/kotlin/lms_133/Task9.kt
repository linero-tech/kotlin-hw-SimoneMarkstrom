package lms_133


fun harshad(number: Int): Boolean{

    val numberAsString = number.toString()
    var total = 0
    var result = true

    numberAsString.forEach{digit ->
        if(digit.digitToInt() != 0) {
            total += digit.digitToInt()
            result = number % total == 0
        }else{
            result = false
        }
    }
    return result
}
fun main(){
    println(harshad(number = 0))
}

// What is the number?
//Is the number a harshad? How do we count that?
// If number is harshad result = true, else result = false