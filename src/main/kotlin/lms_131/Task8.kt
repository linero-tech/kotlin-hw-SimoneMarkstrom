package lms_131

fun task8(grades: Map<String, List<Double>>): String {

    var result = ""
    val sum = mutableMapOf<String, Double>()

    grades.forEach{grade ->
        var totalSum = 0.0
        grade.value.forEach{number ->
            totalSum += number
        }
        sum[grade.key]=totalSum/grade.value.size

    }
    val maxi = sum.maxWithOrNull( Comparator {x, y -> x.value.compareTo(y.value)})
    if (maxi != null) {
        result = maxi.key

    }

    return result
}

fun main(){
    println(task8(grades = mapOf("Ana" to listOf(4.0, 4.5, 5.0), "John" to listOf(5.0, 5.0, 3.0), "Lise" to listOf(5.0, 1.0, 1.0))))
}





