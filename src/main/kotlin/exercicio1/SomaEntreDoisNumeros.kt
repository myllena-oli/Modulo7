package exercicio1

import java.lang.NumberFormatException



data class Valores(val x: Int, val y: Int)
class SomaEntreDoisNumeros {

    fun recebeDoisNumeros(): Valores {

        println("Digite um valor para X:")
        val x = confereInputInt()
        println("Digite um valor para Y:")
        val y = confereInputInt()

        return Valores(x,y)
    }
    fun calculandoSomaExcetoMultiplosDe13(valores: Valores): Int {
        var soma=0
        for(i in valores.x ..valores.y){
            if(i%13!=0){
                soma+=i
            }
        }
        return soma
    }

    private fun confereInputInt(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número inteiro.")
                continue
            }
            return numero
        }
    }
}