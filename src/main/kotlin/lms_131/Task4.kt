package lms_131

fun task4(mapa: Map<Int, Int>, value: Int): List<Int> {



    val result = mutableListOf<Int>()

    mapa.forEach{number ->
        if(value == number.value){
            result += number.key
        }
    }
    return result
}

fun main(){
    println(task4(mapa = mapOf(1 to 10, 2 to 100, 3 to 100), value = 100))
}