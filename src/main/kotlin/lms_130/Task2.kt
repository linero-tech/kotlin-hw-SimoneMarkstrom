package lms_130

fun task2(items: List<Int>): Int {

    // set result to 0
    var result = 0

    // create if its not empty
    if(items.isNotEmpty())
        items.forEachIndexed { index, number ->
            if( index % 2 == 0){
                result += number

            }


            //get the even numbers in a list
            // add  number with result
        }


     println ( result )
    return result
}



fun main(){
    task2(listOf(1,2,3,4))
}