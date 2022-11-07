package lms_131

fun task14(sentence: String): Char {

    val dictionary = mutableMapOf<Char, Int>()
    val cleanedSentence = sentence.lowercase().replace(Regex("[.,;]"),"").replace(" ", "")

    var maxKey = cleanedSentence[0]
    var maxValue = 0
    for ((key, value) in dictionary.entries) {
        if (value > maxValue) {
            maxValue = value
            maxKey = key
        }
    }

 
    return maxKey
}

fun main(){
    println(task14(sentence = "I am it"))
}
