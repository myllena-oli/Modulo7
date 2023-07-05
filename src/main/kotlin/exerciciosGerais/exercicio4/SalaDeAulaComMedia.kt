package exerciciosGerais.exercicio4

class SalaDeAulaComMedia {
    fun recebeInformacoesERealizaCalculos() {
        print("Digite a quantidade de alunos: ")
        val quantidade = readLine()?.toIntOrNull() ?: 0
        val nomes = Array(quantidade) { "" }
        for (i in 0 until quantidade) {
            while (true) {
                print("Digite o nome do aluno ${i + 1}: ")
                nomes[i] = readLine().toString()
                if (nomes[i] == "") {
                    continue
                }
                break
            }
        }
        val notas = Array(quantidade) { DoubleArray(3) }
        for (i in 0 until quantidade) {
            println("Digite as notas do aluno ${nomes[i]}:")
            for (j in 0 until 3) {
                print("Nota ${j + 1}: ")
                notas[i][j] = readLine()?.toDoubleOrNull() ?: 0.0
            }
        }
        val medias = DoubleArray(notas.size)
        for (i in notas.indices) {
            val notas = notas[i]
            val soma = notas.sum()
            val media = soma / notas.size
            medias[i] = media
        }
        if (quantidade == 0) {
            println("Obrigado por usar o programa!")

        } else {
            println("BOLETIM")
            for (i in nomes.indices) {
                println("Aluno: ${nomes[i]}")
                println("Média: ${medias[i]}")
                println()
            }
        }
    }
}