package lms_127

fun task6(base1: Double, base2: Double, height: Double): Double {

    // write how to calculate a trapezoid
    val result = (base1 + base2) * height * 0.5
    //write the result

    println (result)

    return result
}

fun main(){
    task6(base1=10.0, base2=20.0, height=1.0)
}