/* Desafio Sequencia Logica
author: Renan Carvalho
Desafio DIO Kotlin

Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na
execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos,
todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.

 */
 fun main(){
    var i = 1
    var numero = 0
    var a:Int
    var b:Int
    var c: Int
    var d: Int

    println("Digite o numero:  ")
    numero = readLine()!!.toInt()

     while (i<=numero) {
         a = i*i
         b= i*i*i           //referente a primeira linha

         print(i)
         print(" "+a)
         print(" "+b)
         println("") //  println para pular linha

         c = a + 1
         d = b + 1
         print(i)
         print(" "+c)
         print(" "+d)
         println("") //  println para pular linha
         i++         //   incrementa +1 no i
     }
}



