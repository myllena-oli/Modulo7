package exerciciosGerais.exercicio2

class MostraMenorNumero {
    fun recebeDados() {
        var quantidade: Int
        while (true) {
            try {
                println("Quantos números deseja digitar: ")
                quantidade = readln().toInt()
                if (quantidade <= 0) {
                    throw NumberFormatException()
                }
            } catch (excecao: NumberFormatException) {
                println("Informa um número inteiro maior que zero. ")
                continue
            }
            break
        }
        val numeros = DoubleArray(quantidade)

        for (i in 0 until quantidade) {
            while (true) {
                try {
                    print("Digite o número ${i + 1}: ")
                    numeros[i] = readln().toDouble()
                } catch (excecao: NumberFormatException) {
                    println("Informa um número! ")
                    continue
                }
                break
            }
        }

        mostraMenorNumero(numeros)
    }

    fun mostraMenorNumero(numeros: DoubleArray) {

        println("O menor número é ${numeros.min()}")
    }
}