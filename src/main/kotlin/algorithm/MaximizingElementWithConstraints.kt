package algorithm

fun main(){
    val n = 4
    val maxSum = 4
    val k = 3

    print(MaximizingElementWithConstraints.maxElement(n,maxSum,k))
}

object MaximizingElementWithConstraints {
    fun maxElement(n: Int, maxSum: Int, k: Int): Int {

        val sumRight = (k * (k+1) / 2).toInt()
        val sumLeft = ((n - k - 1) * (n - k) / 2).toInt()

        val result = (maxSum + sumRight + sumLeft) / n

        return result


    }
}