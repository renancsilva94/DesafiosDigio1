/*Desafio Taxa Imposto de renda
author: Renan Carvalho
Desafio DIO Kotlin
 */

fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val renda = readLine()!!.toFloat()
    var imposto: Float

    when {
        //isento de imposto
        renda in 0.0..2000.0 -> {
            println("isento")
        }

        //para 8% de imposto de renda
        renda in 2000.01..3000.00 -> {
            imposto = (renda - 2000) * 0.08.toFloat()
            println("Valor de 8% de imposto: R$${imposto.format(2)}")
        }

        //para 18% de imposto de renda
        renda in 3000.01..4500.00 -> {
            imposto = (renda - 3000) * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()  //
            println("Valor de 18% de imposto: R$${imposto.format(2)}")
        }
        //para 28% de imposto de renda
        renda > 4500.00 -> {
            imposto = (renda - 4500) * 0.28.toFloat() + 1500.00.toFloat() * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()
            println("Valor de 28% de imposto: R$${imposto.format(2)}")
        }
    }
}





