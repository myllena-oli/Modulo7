package exercicio3

import java.lang.NumberFormatException

class CaixaDeSupermercado {

    fun lerQuantidade(): Int {
        println("Quantos produtos o cliente comprou? ")
        return confereInputInt()
    }
    fun totalCompra(quantidade:Int): Double {
        var soma = 0.0
        for (i in 1 .. quantidade){
            print("Digite o preço do produto $i:")
            val preco = confereInputDouble()
            soma += preco
        }
        return soma
    }


    private fun confereInputDouble(): Double {
        while (true) {
            var numero: Double
            try {
                numero = readln().toDouble()
                if(numero<0){
                    println("O preço não pode ser negativo!")
                    continue
                }
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número válido.")
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
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número inteiro.")
                continue
            }
            return numero
        }
    }
}