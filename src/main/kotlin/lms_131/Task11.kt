package lms_131

fun task11(mapa: Map<Int, String>, prospect: Int): Boolean {

    var result = false


    for(entry in mapa){
        if(entry.key == prospect){
            result = true
        }

    }



    return result
}

fun main(){
    println(task11(mapa = mapOf(1 to "A", 2 to "B", 3 to "C"), prospect = 1))
}

