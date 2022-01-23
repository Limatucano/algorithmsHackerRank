package algorithm

fun main(){

}

object MiniMaxSum {
    fun miniMaxSum(arr: Array<Int>): Array<Long> {

        val minValue = arr.minOrNull()
        val maxValue = arr.maxOrNull()

        val arrMax = arr.indices.filter { it != arr.indexOfFirst { it == minValue } }.map{ arr[it] }
        val arrMin = arr.indices.filter { it != arr.indexOfFirst { it == maxValue } }.map{ arr[it] }

        val sumMax : Long= sumArray(arrMax)
        val sumMin : Long= sumArray(arrMin)


        return arrayOf(sumMin,sumMax)

    }

    fun sumArray(arr : List<Int>) : Long{
        var sum : Long= 0
        for(i in arr){
            sum+=i.toLong()
        }
        return sum
    }
}