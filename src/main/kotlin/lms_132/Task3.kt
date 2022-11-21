package lms_132

fun task3(sentence: String?): String {

     var result = ""
    
    if(sentence.isNullOrEmpty()){
        result += "*"
    }else{
        result= sentence.replace(Regex("[aeiouAEIOU]"),"*")
    }

    return result
}

fun main() {
    println(task3(sentence = ""))
}

