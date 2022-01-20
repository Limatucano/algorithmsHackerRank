import algorithm.CompareTheTriplets
import kotlin.test.Test
import kotlin.test.assertEquals

class CompareTheTripletsTest {

    @Test
    fun should_to_compare_two_challenges_and_return_an_array(){
        val compareTheTriplets = CompareTheTriplets()
        val alice = arrayOf(5,6,7)
        val bob = arrayOf(3,6,10)

        assertEquals(compareTheTriplets.compareTriplets(alice,bob), arrayOf(1,1))

    }
}