package lms_133

fun washing(times: Int, months: Int): Double {
    val timesPerMonth = times * 30
    val timesAllMonths = timesPerMonth * months
    val seconds = timesAllMonths * 21

    return seconds / 60.0

}


//830= 240, gånger per dag 1 månad
//240 * 7 = 1680 // svar från ovan * antal månader
//1680 * 21 = 35280// antal gånger tvätt * 21 sekunder
//35280/60 = 588// sekunder / 60 = antal minuter