package lms_132

fun task3(sentence: String?): String {

     var result = ""
    var vowels = listOf('a', 'e', 'i' ,'o','u')
    if(sentence.isNullOrEmpty()){
        result += "*"
    }else{ result= sentence.replace(Regex("['a''e''i''o''u''A''E''I'O'U']"),"*")
    }

    return result.toString()
}

fun main() {
    println(task3(sentence = null))
}



/*
fun main() {
    val input = "H...H"
    val output = input.replace('.', 'B')
    println(output)  // Prints "HBBBH"
}
*/