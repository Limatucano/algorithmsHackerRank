package algorithm

fun main(){
    val arraySample = arrayOf(1,3,5,7,9)
    val arraySample2 = arrayOf(256741038 ,623958417 ,467905213 ,714532089 ,938071625)
    val arraySample3 = arrayOf(396285104, 573261094 ,759641832 ,819230764 ,364801279)
    val arraySample4 = arrayOf(5,5,5,5,5)
    MiniMaxSum.miniMaxSum(arraySample4)
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