package fundamentals

fun main(args: Array<String>) {


    /*
    * Sum all the integers in the list that are
    * greater than 5 and print out the result
     */
    val values = listOf(24,5,10,4)

    fun List<Int>.sumValues(result : (Int) -> Unit){
        result(this.filter { it > 5 }.sum())
    }

    values.sumValues { println(it) }


    /*
    *
    * Given the Person class below, destructuring
    * the name and age
     */

    data class Person(val name : String, val age : Int)
    val sam = Person("sam",30)
    val (name, age) = sam
    println("name: $name and age: $age")
}