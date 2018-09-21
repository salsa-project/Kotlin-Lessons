

//readLine()!! تستخدم لجعل المستخذم يدخل البيانات المطلوبة
//readLine()!! عبارة عن string
//readLine()!!.toInt() أو .toDouble() لجعل المستخدم يدخل اللأرقام فقط يجب اضافة  مثلا
//تصبح هكذا مثلا ()readLine()!!.toInt
fun main(args:Array<String>){

    println("enter name:")
    var name:String=readLine()!!
    println(name)

    println("enter age:")
    var age:Int=readLine()!!.toInt()
    println(age)

    println("enter avg:")
    val avg:Double= readLine()!!.toDouble()
    println(avg)


    val city="eltaref"
    println(city)




}