package algorithm

fun main(){

}
object BirthdayCakeCandles {

    fun birthdayCakeCandles(candles: Array<Int>): Int {
        val maxValue = candles.maxOrNull()

        val howMuchCandle = candles.filter{it == maxValue}.size

        return howMuchCandle

    }
}