import algorithm.BirthdayCakeCandles
import kotlin.test.Test
import kotlin.test.assertEquals

class BirthdayCakeCandlesTest {

    @Test
    fun test_case1(){
        val candles = arrayOf(4,4,1,3)
        val response = BirthdayCakeCandles.birthdayCakeCandles(candles)
        assertEquals(2, response)
    }

    @Test
    fun test_case2(){
        val candles = arrayOf(3,2,1,3)
        val response = BirthdayCakeCandles.birthdayCakeCandles(candles)
        assertEquals(2, response)
    }
}