package lms_135

// Create class Student, with one constructor: grades: Double
class Student(val grades: List<Double>){
    fun gpa():Double{
        var average = 0.0
        var sum = 0.0

        grades.forEach{grade ->
            sum += grade
            average = sum / grades.size
        }
        return average
    }
    fun bonus(){
        grades.forEach{grade ->
            grade +1
        }
    }
    fun lowest(): Double = grades.minOf{Double -> Double}

    fun highest(): Double = grades.maxOf{Double -> Double}
}
// Create a function gpa, no arguments, returns Double, that calculates average grade
// Create function bonus, no arguments, no return value, adds 1 point to each grade
// Create function lowest, no arguments, returns Double
// Create function highest, no arguments, returns Double
fun main(){
    val student1 = Student(listOf(5.0, 4.0, 2.0))
    println(student1.bonus())
    println(student1.gpa())
    println(student1.lowest())
    println(student1.highest())
}
