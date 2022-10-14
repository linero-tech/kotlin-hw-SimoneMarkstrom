package lms_130

fun task7(items: List<Int>): Int {




        var minVal = items.first()
        var maxVal = items.first()

            if(items.isNotEmpty()) {
        items.forEach { number ->
            if (number > maxVal) {
                maxVal = number

            }else if( number < minVal){
                minVal = number
                var result = minVal
            }
        }


           var result = minVal


    }

    return minVal
}

fun main(){
   println(task7(items= listOf(1,2,3,4,5)))
}
