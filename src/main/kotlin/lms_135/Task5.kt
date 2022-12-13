package lms_135

//Create class Circle, constructors = radius type Double, make it private
class Circle(private val radius: Double) {
    //Create function area, no arguments, return Double
    fun area(): Double =  radius * radius * 3.14159265
    //Create function perimeter, no argument, return Double
    fun perimeter(): Double = (radius * 2) * 3.14159265
}

fun main(){
    val myCircle = Circle(12.5)
    println(myCircle.area())
    println(myCircle.perimeter())
}