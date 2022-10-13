package lms_130

fun task7(items: List<Int>): Int {

    var result = 0

    if(items.isNotEmpty()) {
        var minVal = items.first()
        var maxVal = items.first()

        items.forEach { number ->
            if (number > maxVal) {
                maxVal = number

            }else if( number < minVal){
                minVal = number
            }
        }



           val result= (minVal)

    }

    return result
}

fun main(){
   println(task7(items= listOf(-1, 0, 1, 2, 3, 4, 5, -9, -10, 0, 100)))
}
