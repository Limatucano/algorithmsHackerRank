package algorithm

import kotlin.math.pow


fun main(){
    renameFile.renameFile("aba", "ababa")

}

object renameFile {

    fun renameFile(newName: String, oldName: String): Int {
        val newNameSize = newName.length - 1
        val oldNameSize = oldName.length - 1

        var point = (1..oldNameSize+1).map{ 1 }

        for(i in 1..newNameSize+1){
            val nPoint = (0..oldNameSize+1).map { 0 }.toMutableList()
            for(j in i..oldNameSize + 1){
                nPoint[j] = nPoint[j - 1]
                if(newName[i - 1] == oldName[j - 1]){
                    nPoint[j] += point[j - 1]
                }
            }
            point = nPoint
        }
        val result = point.last() % ((10.0.pow(9)) + 7)
        return result.toInt()


    }
}