fun main(args: Array<String>) {

    for (c in 1..10){
    println("counting: $c")

        if(c==5){
            break
        }
    }
    for (b in 1..10){
        if(b==5){
            continue
    }
        println("count: $b")
    }

    loop@ for (g1 in 1..5){
        for (g2 in 1..3)
            println(1)
        if (g1==2)
            break@loop
    }

    println("end app")
}