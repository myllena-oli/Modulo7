package exercicio7

import java.lang.NumberFormatException

class Escola {

    fun lerQuantidadeTurmas(): Int {
        println("Quantas turmas há na escola? ")
        return confereInputInt()
    }
    fun alunosPorTurma(quantidade:Int): IntArray {
        val turmas = IntArray(quantidade)
        for (i in 0 until quantidade){
            println("Há quantos alunos na sala ${i+1}?")
            turmas[i] = confereInputInt()
        }
        return turmas
    }
    fun mediaPorAluno(turmas:IntArray) {
        var mediaTurma = DoubleArray(turmas.size)
        for (i in turmas.indices) {
            val media = Array(turmas.size) { DoubleArray(turmas[i]) }
            for (j in 0 until turmas[i]) {
                println("Digite a media do aluno ${j + 1} da sala ${i+1}:")
                media[i][j] = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            }

            mediaTurma[i]=calcularMedia(media[i])

        }
        for (i in mediaTurma.indices) {
            println("A média da turma ${i + 1} é: ${mediaTurma[i]}")
        }
    }

    private fun calcularMedia(media: DoubleArray): Double {
        var soma = 0.0

        for (nota in media) {
            soma += nota
        }
        return soma / media.size
    }

    private fun confereInputInt(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
                if (numero < 0) {
                    println("O valor não pode ser negativo!")
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