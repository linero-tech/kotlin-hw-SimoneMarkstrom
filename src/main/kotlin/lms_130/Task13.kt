package lms_130

fun task13_1(customers: List<String>): List<String> {

    val result = customers.distinct()
    return result

}

    fun task13_2(customers: List<String>): List<String> {

        val result = mutableSetOf<String>()
        val uniqueList = mutableListOf<String>()

        for (mail in customers) {
            if (mail in uniqueList) {
                result.add(mail)
            } else {
                uniqueList.add(mail)
            }
        }

        return result.toList()

    }

    fun task13_3(customers: List<String>): List<String> {



        val result = mutableSetOf<String>()
        val unique = customers.toSet()

        unique.forEach{domain ->
            val (name, last) = domain.split("@")
            val (company, end) = last.split(".")
            result.add(company)
        }
        return result.toList()

    }

    fun main() {
        val listOfCustomer = listOf(
            "tgundrey1l@prlog.org",
            "bgrix1u@apache.org",
            "mbreakspear1v@wordpress.com",
            "cdalli1w@ft.com",
            "rclayborn1x@mtv.com",
            "rclayborn1x@mtv.com",
            "jchidlow1y@nasa.gov",
            "jchidlow1y@nasa.gov",
            "kovell1z@washingtonpost.com",
            "kovell1z@washingtonpost.com",
            "kovell1z@washingtonpost.com"
        )

        println("The customers who purchased from your product: ${task13_1(listOfCustomer)}")
        println("The customers that purchased multiple times include: ${task13_2(listOfCustomer)}")
        println("The companies that purchased from you include: ${task13_3(listOfCustomer)}")
    }
