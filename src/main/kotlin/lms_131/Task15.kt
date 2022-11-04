package lms_131

fun task15(sentence: String): Map<Char, Int> {

    //create new variable as an empty map
    val result = mutableMapOf<Char, Int>()

    // Ignore special characters and case sensitivity, spaces
    val cleanedSentence = sentence.lowercase().replace(Regex("[.,;]"),"").split(" ")

    cleanedSentence.forEach{word->
        val firstLetter = word[0]
        if(firstLetter in result.keys){
            val currentScore = result.get(firstLetter) !!
            val newScore = currentScore+1
            result[firstLetter]=newScore

        }else{
            result[firstLetter]=1

        }
    }
    return result
}

fun main(){
    println(task15(sentence = "This is the Very small Text"))
}
