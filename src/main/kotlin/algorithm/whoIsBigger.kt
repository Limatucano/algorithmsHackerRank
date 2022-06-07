package algorithm

fun main(){
    val input = WhoIsBigger.readInt()
    WhoIsBigger.whoIsBigger(input)
}
object WhoIsBigger {

    private val values : MutableList<Int> = mutableListOf()

    fun whoIsBigger(n: Int) : Int{
        if(n == 0){
            return 0
        }
        this.values.add(n)
        this.values.sort()
        println("maior valor: ${this.values.maxOrNull()}")
        println("menor valor: ${this.values.minOrNull()}")


        return whoIsBigger(readInt())
    }

    fun readInt() : Int {
        val input = readLine()
        input?.let {
            return it.toInt()
        }
        return 0
    }

}
