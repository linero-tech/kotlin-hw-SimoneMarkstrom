package lms_129

fun task7(a: Int, b: Int): Int {


    var result = 1
    for(count in 1..b) {
        result *= a
    }

    println(result)


    return result
}

fun main() {
    task7(a = 2, b = 3)

}