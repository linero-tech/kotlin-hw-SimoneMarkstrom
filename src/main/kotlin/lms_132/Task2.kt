package lms_132

fun task2(items: List<Int?>?): Int {

    var result =  0

    if(items == null){
        result = 0
    }else{
        items.forEach{element->
            if(element== null){
                result += 1
            }

        }
    }

    return result
}

fun main(){
    println(task2(items= listOf( 1, null, 2, null, 3)))
}