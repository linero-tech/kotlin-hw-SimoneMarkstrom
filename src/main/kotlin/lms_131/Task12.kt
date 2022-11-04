package lms_131

fun task12(a: List<Int>, b: List<String>): Map<Int, String> {

    val result = mutableMapOf<Int, String>()

    a.zip(b).forEach { pair ->
        result += pair
    }
    return result
}

fun main(){
    println(task12(a = listOf( 1, 2, 3, 4),b = listOf("W", "X", "Y", "Z")))
}

