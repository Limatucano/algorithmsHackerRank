import algorithm.SumArray
import kotlin.test.*


class SumArrayTest {

    @Test
    fun should_return_an_integer_sum_in_array(){
        val listOne = arrayOf(3,5,6,10,7,4,7,4,3,2,7,65,8) //131
        val listTwo = arrayOf(1,2,3,4,5,6,7,8,9,10)// 55
        val sumArray = SumArray()

        assertEquals(sumArray.arraySum(listTwo),45)

    }
}