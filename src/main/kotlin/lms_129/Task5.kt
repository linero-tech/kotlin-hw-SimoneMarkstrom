package lms_129

fun task5(sentence: String): Int {

    var result = 0

    for (i in " $sentence ") {

        result = sentence.length


        println(result)
        break


    }


    return result
}


fun main(){
    task5( sentence = "I Love GBG")

}
