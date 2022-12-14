package lms_135

//Create class Hero, constructor empty, two properties: health = 10 and level = 0
class Hero() {
    var health = 10
    private set
    var level = 0
    private set
    // Create a function sick, no arguments, no return type, reduce health by 1
    fun sick(){
        health -= 1
    }

    // Create function heal, no arguments, no return, increase health by 1
    fun heal() {
        health++ // or health+=1
    }
    // Create function attack, no argument, no return, increase level by 1
    fun attack() {
        level+=1 // or level++
    }
}

fun main(){
    val hero1 = Hero()

    println(hero1.sick())
    println(hero1.heal())
    println(hero1.attack())
}