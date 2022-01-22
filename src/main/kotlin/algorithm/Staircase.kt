package algorithm

fun main(){
    Staircase.staircase(6)
}
object Staircase {

    fun staircase(n: Int): Unit {
        for(i in 1..n){
            val item = "#".repeat(i)
            val blankSpace = " ".repeat(n-i)
            val stair = "$blankSpace$item"
            println(stair)
        }

//        if(n!=0){
//            staircase(n - 1)
//        }
    }
}

