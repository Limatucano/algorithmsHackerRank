package algorithm

fun main(){
    val diagonalDifference = DiagonalDifference()
    val matrix = arrayOf(arrayOf(11,2,4),arrayOf(4,5,6),arrayOf(10,8,-12))
    diagonalDifference.diagonalDifference(matrix)
}

class DiagonalDifference {
    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var primaryDiagonal = 0
        var secondaryDiagonal = 0
        for (i in arr.indices) {
            primaryDiagonal += arr[i][i]
            secondaryDiagonal += arr[arr.size - 1 - i][i]
        }

        return kotlin.math.abs(primaryDiagonal - secondaryDiagonal)

    }
}