
fun main(args:Array<String>){

    println(3>2)//هل 3 اكبر من 2
    println(3<2)//هل 3 اصغر من 2
    println(3!=2)// هل 3 لا يساوي 2
    println(3==2)// هل 3 يساوي 2


    /*
       AND Gate                    OR Gate                  NOT Gate
      |A  |B  |AB|                |A  |B  |AB|             |A  |A'
      |0  |0  | 0|                |0  |0  | 0|             |0  |1
      |0  |1  | 0|                |0  |1  | 1|             |1  |0
      |1  |0  | 0|                |1  |0  | 1|
      |1  |1  | 1|                |1  |1  | 1|

     */

    println("بوابة اند:")
    println(3>10 && 10<2) //بوابة AND تمثل ب &&
    var n=5
    println("الحصر: هل 5 تقع بين 1 و 10")
    println(n>=1 && n<=10)//هل n محصور بين المجال 1 و 10



    println("بوابة OR أور:")// بوابة أور تمثل ب ||
    println(3<2 || 1==1)


    println("بوابة NOT نوت:")// نوت تمثل ب ! معناها نفي
    var isMarried=false
    println(isMarried)
    println("بعد اضافة ! تصبع العكس")
    println(!isMarried)

    println("دمج اند و أور")
    var m=3
    println(m<1 && m>5 ||(m>1  && m<5))


}