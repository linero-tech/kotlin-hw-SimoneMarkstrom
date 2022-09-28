package lms_129

fun task6(number: Int): Int {

    var result = 0
    var n = number

    while ( n > 0) {
        result  = result * 10 + n % 10
        n /=10



    }

    println(result)

    return result

}
fun main (){
    task6( number = 123)
}
