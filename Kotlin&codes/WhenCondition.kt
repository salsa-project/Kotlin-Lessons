
fun main(arg:Array<String>){

    println("enter n value:")
    val n:Int=readLine()!!.toInt()

    when(n){
    //اذا ادخلت رقم 1 اظهر الرسالة
        1->{
            println("you entred 1")
        }
    //اذا ادخلت رقم 2 اظهر الرسالة
        2->{
            println("you entred 2")
        }
    //اذا ادخلت رقم 3 اظهر الرسالة
        3->{
            println("you entred 3")
        }
    //اذا ادخلت رقم4 او5 او6 او7 او8 او9 اظهر الرسالة
        4,5,6,7,8,9->{
            println("you entred n between 4 and 9")
        }
    //اذا ادخلت رقم ما بين 10 و 30 أظهر الرسالة
        in 10..30->{
            println("you entred between 10..30")
        }

    //اذا ادخلت رقم ليس موجود بين المجال 30 الى 50 اظهر الرسالة
        // علامة التعجب ! تستعمل للنفي
        !in 30..50->{
            println("not in range")
        }else->{
        println("nothing")
    }

    }




}