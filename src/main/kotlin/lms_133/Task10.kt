package lms_133


fun tweet(sentence: String): String{

    var newSentence = sentence

    while(newSentence.length < 280){
        newSentence += "@"
    }
    return newSentence
}
fun main(){
    println(tweet(sentence = "Hello its me"))
}
// Get sentence
// Check sentence length
// Is sentence shorter than 280?
// If so, add "@" to the blank spaces