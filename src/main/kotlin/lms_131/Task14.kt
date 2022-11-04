package lms_131

fun task14(sentence: String): Char {

    val dictionary = mutableMapOf<Char, Int>()
    val cleanedSentence = sentence.lowercase().replace(Regex("[.,;]"),"").replace(" ", "")

    cleanedSentence.forEach{letter ->
        if(letter in dictionary.keys){

            val currentScore = dictionary.get(letter) !!
            val newScore = currentScore+1
            dictionary[letter]=newScore
        }else{
            dictionary[letter]=1
        }
    }
    val maxValue = dictionary.values.maxOrNull()
    val maxValueKeys: MutableList<Char> = mutableListOf()
    for((key, value) in dictionary) {
        if (value == maxValue) {
            maxValueKeys.add(key)
        }
    }
    val result = maxValueKeys[0]


    return result
}

fun main(){
    println(task14(sentence = "I am it"))
}
