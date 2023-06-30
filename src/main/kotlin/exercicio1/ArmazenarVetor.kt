package exercicio1

class ArmazenarVetor {

    fun armazenarVetor(): IntArray {
        val vetor = IntArray(5)

        for(i in 0 until 5){
            println("Digite o ${i+1}º número: ")
            vetor[i] = confereInputInt()
        }
        return vetor
    }


    fun somaValores(vetor:IntArray): Int {
        var soma = 0
        for(itens in vetor){
            soma += itens
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