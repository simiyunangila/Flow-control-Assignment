fun main(){
    println( numbers(arrayOf(1..100)))
println( names(arrayOf("Becca","School","Lorraine","car","one")))
    partyDrinks(4)
    partyDrinks(14)
    partyDrinks(19)
    number()
}
//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun numbers(num:Array<Any>):Array<Any> {
    for (number in 1..100) {
       if (number%2!=0){
           println(number)
       }
    }
    return num
}
// 2 Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun names(name:Array<String>):Int {
    var count = 0
    for (nam in name) {
        if (nam.length > 5) {
            count++
        }
    }
    return count
}
//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun partyDrinks(Age:Int){
    when(Age){
        in 0..6 -> println("A glass of Milk")
        in 6..15-> println("Bottle of Fanta Orange")
        else -> println("Bottle of Coca Cola")
    }
}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number
fun number(){
    for (x in 1..100){
        if (x%3==0 &&x%5==0){
            println("FizzBuzz")
        }else if(x % 3==0){
            println("Fizz")
        }
        if(x % 5==0){
            println("Buzz")

        }
    }
}