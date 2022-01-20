fun main(args: Array<String>) {

    val inteiros = mutableListOf<Int>()
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()
    val positivos = mutableListOf<Int>()
    val negativos = mutableListOf<Int>()
    var count : Int = 0
//continue declarando as variaveis

    for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }
    for (i in inteiros) {
        if (i % 2 == 0) {
            pares.add(i)
        }
        if (i > 0) {
            positivos.add(i)
        }
        if (i % 2 == 1) {
            count = 1
            impares.add(i)
        }
        if (i < 0) {
            if (-i % 2 == 1) {
                if(count != 1){
                    impares.add(i)
                }
                count = 0
            }
            negativos.add(i)
        }
    }
    println("${pares.size} valor(es) par(es)")
    println("${impares.size} valor(es) impar(es)")
    println("${positivos.size} valor(es) positivo(s)")
    println("${negativos.size} valor(es) negativo(s)")

}