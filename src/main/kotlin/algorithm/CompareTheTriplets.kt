package algorithm


fun main(){
    val alice = arrayOf(5,6,7)
    val bob = arrayOf(3,6,10)

    val compareTheTriplets = CompareTheTriplets()
    print(compareTheTriplets.compareTriplets(alice,bob))
}

class CompareTheTriplets {

    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        var aPoint = 0
        var bPoint = 0
        for(i in 0..2){
            if(a[i] > b[i]){
                aPoint++
            }
            if(b[i] > a[i]){
                bPoint++
            }
        }
        return arrayOf(aPoint,bPoint)
    }
}