package lms_132

fun task9(identification: String?): Boolean {

    val structuredRegex = Regex("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]")


    return if (identification.isNullOrEmpty() || !structuredRegex.matches(identification)) {
        false
    } else {
        identification.substring(0, 4) >= 1947.toString() &&
                identification.substring(4, 6) <= 12.toString() &&
                identification.substring(6, 8) <= 31.toString()
    }

}

fun main() {
    println(task9(identification = "19540511-4972"))
}
