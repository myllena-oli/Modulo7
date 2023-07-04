package exercicio7

import kotlin.system.exitProcess

class SalaDeAula {
    data class Resultado(val valor1: DoubleArray, val valor2: Int)

    fun recebeQuantidade(): Int {
        println("Quantos alunos há na sala: ")
        return confereInputInt()
    }
    fun recebeNotas(quantidade: Int): Resultado {

        val notas = DoubleArray(quantidade)

        for (i in 0 until quantidade){

            println("Digite a nota do aluno ${i + 1}:")
            notas[i] = confereInputDouble()
        }

        return Resultado(notas, quantidade)
    }
    fun calculaMedia(valor:Resultado){
        var soma = 0.0
        for(itens in valor.valor1){
            soma += itens
        }
        val media = soma/valor.valor2
        println("A média é $media")

    }

    private fun confereInputDouble(): Double {
        while (true) {
            var numero: Double
            try {
                numero = readln().toDouble()
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número.")
                continue
            }
            return numero
        }
    }

    private fun confereInputInt(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
                if (numero == 0) {
                    println("Não há alunos para calcular a média.")
                    exitProcess(0)
                }
                if (numero < 0) {
                    println("Entrada inválida. Por favor, digite um número positivo.")
                    continue
                }
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número inteiro.")
                continue
            }
            return numero
        }
    }

}