package lms_135


//Create blueprint of class Account
//Create balance variable called balance, just readable, of type Double
class Account(var balance: Double){

    fun deposit(income: Double) {
        balance += income
    }
    fun withdrawal(cost: Double) {
        if(balance > cost){
            balance -= cost
        }
    }

    fun fee() = balance - ((balance / 100) * 5)
}

fun main(){
    val myMoney = Account(300.0)
    println(myMoney.deposit(150.0))
    println(myMoney.withdrawal(100.0))
    println(myMoney.fee())
}
//Create a function deposit with one argument of double and no return value
//Create a function withdrawal with one argument of double and no return
//Create a function fee with no arguments and no return value, decrease balance by 5%