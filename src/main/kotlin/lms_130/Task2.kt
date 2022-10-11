package lms_130

fun task2(items: List<Int>): Int {

    // set result to 0
    var totalsum = 0

    // create if its not empty
    if(items.isNotEmpty())
        items.forEachIndexed { index, number ->
            if( index % 2 == 0){
                totalsum += number

            }


            //get the even numbers in a list
            // add  number with result
        }


     println ( totalsum )
    return totalsum
}



fun main(){
    task2(listOf(1,2,3,4))
}