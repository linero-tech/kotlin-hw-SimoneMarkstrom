package lms_131

fun task4(mapa: Map<Int, Int>, value: Int): List<Int> {



    val result = mutableListOf<Int>()

    mapa.forEach{entry ->
        if(value == entry.value){
            result.add(entry.key)
        }
    }
    return result
}

fun main(){
    println(task4(mapa = mapOf(1 to 100, 2 to 100, 3 to 200), value = 100))
}