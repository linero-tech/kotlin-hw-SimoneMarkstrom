package lms_133

fun groceries(groceryList: List<Map<String, Any>>): Double{
    var result = 0.0
    var totalQuantity = 0
    var totalPrice  = 0.0
    if(groceryList.isEmpty()){
        result
    }else {
        groceryList.forEach { input ->
            totalQuantity = input.getValue("quantity") as Int
            totalPrice = input.getValue("price") as Double
            val total = totalQuantity * totalPrice
            result += total
        }
    }
    return result
}

fun main(){
    println(groceries(groceryList =
    listOf(mapOf("product" to "milk", "quantity" to 3, "price" to 1.50),
        mapOf("product" to "meat", "quantity" to 3, "price" to 2.50))))
}


// Go through the list
// If list is empty return 0.0
// Else count how many items you should buy and multiply with cost
// Return total cost of all groceries