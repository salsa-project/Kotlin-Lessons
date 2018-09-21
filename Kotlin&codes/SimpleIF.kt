
fun main(args: Array<String>) {

    println("enter n number value:")
    var n:Int= readLine()!!.toInt()

    if (n>5 && n<70){

        print("n is between "+ (n-1));println(" and "+ (n+1))

    }else{

        println("the n value you entered isn't between our range!")
    }

    print("end app")




}