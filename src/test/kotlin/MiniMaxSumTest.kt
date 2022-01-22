import algorithm.MiniMaxSum
import kotlin.test.Test
import kotlin.test.assertEquals

class MiniMaxSumTest {

    @Test
    fun test_case_1(){
        val arraySample = arrayOf(5,5,5,5,5)
        val response = MiniMaxSum.miniMaxSum(arraySample)
        assertEquals("20 20","${response[0]} ${response[1]}")
    }
    @Test
    fun test_case_2(){
        val arraySample = arrayOf(1,3,5,7,9)
        val response = MiniMaxSum.miniMaxSum(arraySample)
        assertEquals("16 24", "${response[0]} ${response[1]}")
    }
    @Test
    fun test_case_3(){
        val arraySample = arrayOf(256741038 ,623958417 ,467905213 ,714532089 ,938071625)
        val response = MiniMaxSum.miniMaxSum(arraySample)
        assertEquals("2063136757 2744467344", "${response[0]} ${response[1]}")
    }
    @Test
    fun test_case_4(){
        val arraySample = arrayOf(396285104, 573261094 ,759641832 ,819230764 ,364801279)
        val response = MiniMaxSum.miniMaxSum(arraySample)
        assertEquals("2093989309 2548418794", "${response[0]} ${response[1]}")
    }

}