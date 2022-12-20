package lms_132

fun task7(sentence: String?): Map<String, Int> {

    val result = mutableMapOf("letters" to 0, "digits" to 0)
    val cleanedSentence = sentence?.lowercase()?.replace(Regex("[ ]"),"")

    if(sentence.isNullOrEmpty()){
        result += result
    }else{
        cleanedSentence?.forEach{char ->
            if(char.isLetter()){
                result["letters"] = result.getOrDefault("letters", 0)+1
            }else{
                result["digits"] = result.getOrDefault("digits",0)+1
            }
        }
    }

    //Go over sentence
    // if sentence null= count = 0
    // else, go over which are letter and which are digits
    // how many of each?
    // add to map(letter/digits = key, amount = value)
    return result
}
fun main(){
    println(task7(sentence = "H3ll0 w0rld"))
}