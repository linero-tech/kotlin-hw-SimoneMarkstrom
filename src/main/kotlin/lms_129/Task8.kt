package lms_129

fun task8(number: Int): Int {

    var result = 0

    for(digit in number.toString()){
       result += Character.getNumericValue(digit)

    }


    return result
}
fun main(){
    println(task8(number=12))

}
