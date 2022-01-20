import kotlin.math.abs

fun main(args: Array<String>){
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')

    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }

//insira as variaveis de acordo com o calculo do perimetro e area

    val p = ( a+b+c).format(1)

    val r = ( ( ( a + b ) *c )/ 2 ).format(1)

    if ((a<b+c) && (b<a+c) && (c<a+b))  println("Perimetro = $p")

    else println("Area = $r")
}