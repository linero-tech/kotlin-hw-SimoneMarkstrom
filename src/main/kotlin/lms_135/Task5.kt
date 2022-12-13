package lms_135

//Create class Circle, constructors = radius type Double, make it private
class Circle(private val radius: Double) {
    //Create function area, no arguments, return Double
    fun area(): Double = 3.14 * (radius * radius)
    //Create function perimeter, no argument, return Double
    fun perimeter(): Double = (radius * 2) * 3.14
}

fun main(){
    val myCircle = Circle(12.5)
    println(myCircle.area())
    println(myCircle.perimeter())
}