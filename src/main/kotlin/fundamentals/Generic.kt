package fundamentals

interface Repository<T>{
    fun addItem(item: T)
    fun deleteItem(item: T)
}
data class Person(val name: String, val age : Int)

class PersonRespository : Repository<Person>{
    override fun addItem(item: Person) {
        println(item)
    }

    override fun deleteItem(item: Person) {
        println(item)
    }

}
/**
 * Create a function named printItem that prints out a generic parameter.
 * Call the parameter "item"
 */
fun <T> printItem(item : T){
    println(item)
}

/**
 * Create a function named printList that takes a generic list as a parameter
 * and prints out each item
 */
fun <QualquerCoisa> printList(item: List<QualquerCoisa>){
    item.forEach {
        println(it)
    }
}
fun main(args : Array<String>){



    val teste = PersonRespository()
    val matheus = Person("matheus",30)
    teste.addItem(matheus)

    printList(listOf(2,3,4,5,5,6))
}