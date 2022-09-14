package lms_127

fun task7(sentence: String): Int {


   //count the length on the sentence
    val result = sentence.length


    //print the result
    println ("The number of characters in sentence are $result")


    return result

}

fun main(){
    task7(sentence = "I love GBG")
}