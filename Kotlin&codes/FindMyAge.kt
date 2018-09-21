import java.util.*

fun main(args:Array<String>){

    //user input
    println("Enter your BirthYear: ")
    var yob= readLine()!!.toInt()

    //process
    var thisYear=Calendar.getInstance().get(Calendar.YEAR)
    var age=thisYear-yob


    //output

    println("Your Age : $age")




}