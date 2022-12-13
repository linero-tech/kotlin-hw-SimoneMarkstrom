package lms_135

class Rectangle(private val base: Double, private val height: Double){
    fun perimeter(): Double = (height * 2) + (base * 2)
    fun area(): Double = base * height
}

fun main(){
    val myRect = Rectangle(4.0,2.0)

    println(myRect.perimeter())
    println(myRect.area())
}