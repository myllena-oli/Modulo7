package exercicio2

import java.lang.NumberFormatException

class VetorComDobros {
    fun recebeValor(): Int {
        print("Digite um valor inteiro: ")
        val valor = confereInputInt()
        return valor
    }
    fun montaVetor(valor: Int): IntArray {
        var vetor = IntArray(10)
        vetor[0]=valor
        for(i in 1 until 10){
            vetor[i]=(vetor[i-1]*2)
        }
        return vetor
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