package algorithm


fun main(){
    val plusMinus = PlusMinus()
    val arraySample = arrayOf(1,1,0,-1,-1)

    plusMinus.plusMinus(arraySample)
}

class PlusMinus {

    fun plusMinus(arr: Array<Int>): Unit {

        var negativeRatio = 0
        var positiveRatio = 0
        var zeroRatio = 0

        for(i in arr) {
            when{
                i > 0  -> positiveRatio++
                i < 0  -> negativeRatio++
                i == 0 -> zeroRatio++
            }
        }
        val positiveDiv = (positiveRatio.toDouble()/arr.size.toDouble())
        val negativeDiv = (negativeRatio.toDouble()/arr.size.toDouble())
        val zeroDiv = (zeroRatio.toDouble()/arr.size.toDouble())
        println("%.6f".format(positiveDiv))
        println("%.6f".format(negativeDiv))
        println("%.6f".format(zeroDiv))
    }

}