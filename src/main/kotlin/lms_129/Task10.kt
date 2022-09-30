package lms_129

fun task10(password: String): Boolean {


    var result= false


    val pattern = "[a-zA-Z0-9._-]{6,10}+@".toRegex()

    password.forEach {
        password

        if (pattern.matches(password)) {

           result= true
        } else {
            result = false

        }

    }


    return result
}

fun main(){
    println(task10(password="hej0122$@"))
}