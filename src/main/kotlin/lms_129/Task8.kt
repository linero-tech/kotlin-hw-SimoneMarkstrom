package lms_129

fun task8(number: Int): Int {

   var result=  0
    var number= number
    while( number > 0){
        var digit= number % 10
        result = digit + result
        number /=10
    }


    return result
}
fun main(){
    println(task8(number=1))

}
