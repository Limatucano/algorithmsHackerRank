fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    //declare suas variaveis auxiliares e continue a solucao
    var sum : Int = 0
    var total : Int = 0
    var fibonnaci : MutableList<Int> = mutableListOf()
    for (i in 1..(n-1)) {
        print("$sum ")
        fibonnaci.add(sum)
        if(i > 1){
           sum = fibonnaci.get(i-2) + fibonnaci.get(i-1)
        }else{
           sum = i + (i - 1)
        }
        total = sum
    }
    print("$total")
    println()

}