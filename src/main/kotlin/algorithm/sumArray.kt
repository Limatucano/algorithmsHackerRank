package algorithm


fun main(){
    val sum = SumArray()

    print(sum.arraySum(arrayOf(1,2,3,4,10,11)))
}


class SumArray {

    fun arraySum(ar: Array<Int>): Int = ar.reduce { acc, i -> acc + i }

}
