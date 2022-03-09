package algorithm

fun main(args: Array<String>){
//    println(xpFunction().size)
//    println(xpFunction().maxByOrNull { it.length }?.capitalize() ?: "XP")
//    println(xpFunction().maxByOrNull { it.length } ?: "XP")
//    println(xpFunction().minByOrNull { it.length }?.capitalize() ?: "XP")
//    println(xpFunction().minByOrNull { it.length } ?: "XP")

    customA()
}
private fun xpFunction(str : String = "Ready, steady, go!") = str.split(Regex("[^a-zA-Z]+"))
private fun customA(){
    val input = listOf(1,2, -1,1,0,10,1999,-1,-1,9,0,1)
    val newInputAfterMap = listOf(-1,2,1,-1,0,10,1999,1,1,9,0,-1)
    var acc = 0
    val toALgorithm = input.map{
        when(it){
            -1 -> it * -1
            1 -> it * -1
            else -> it
        }
    }.apply {
        acc = this.reduce{a,b -> a + b}
        acc = acc.inc()
        acc = acc.inc()
        acc = acc.dec().apply { this * 2 }
    }
    println(custom(toALgorithm))
    print("Acc = $acc")
}
private fun custom(list : List<Int>) : List<Int>{
    return if(list.size > 1){
        val medium = list[list.size/2]
        val less = list.filter{it < medium}
        val equal = list.filter {it == medium}
        val greater = list.filter {it > medium}
        custom(less) + equal + custom(greater)
    }else{
        list
    }
}
fun t(){
    var x = -33
    var y = 33

    x = y.also{
        y = x
    }

    x.apply{
        x*=-1
        y *= -1
        x + 33
        y -= 33
    }

    with(x){
        println("X = ${this + y}")
    }

    println("Y = ${y/-1}")
}