package algorithm

fun main(){
    var s = "aaabbbbcccddd"
    s = "abccddde"
    var queries = arrayOf(9,7,8,12,5)
    queries = arrayOf(1,3,12,5,9,10)

    WeightedUniformStrings.weightedUniformStrings(s,queries)
}

object WeightedUniformStrings {

    fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
        val weightChar = mapOf(
            'a' to 1,
            'b' to 2,
            'c' to 3,
            'd' to 4,
            'e' to 5,
            'f' to 6,
            'g' to 7,
            'h' to 8,
            'i' to 9,
            'j' to 10,
            'k' to 11,
            'l' to 12,
            'm' to 13,
            'n' to 14,
            'o' to 15,
            'p' to 16,
            'q' to 17,
            'r' to 18,
            's' to 19,
            't' to 20,
            'u' to 21,
            'v' to 22,
            'w' to 23,
            'x' to 24,
            'y' to 25,
            'z' to 26
        )
        val arr = mutableListOf<Int>()
        var lastChar : Char? = null
        var acc : Int = 0
        val output = mutableListOf<String>()
        for(char in s){
            if(char == lastChar){
                acc+= weightChar[char]!!
                arr.add(acc)
            }else{
                acc = 0
                acc+= weightChar[char]!!
                arr.add(acc)
            }
            lastChar = char
        }

        for(querie in queries){
            if(querie in arr){
                output.add("Yes")
            }else{
                output.add("No")
            }

        }
        return output.toList() as Array<String>
    }


}