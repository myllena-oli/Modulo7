package exercicio10

import java.lang.NumberFormatException

class InformaSeValoresSaoIguais {
    fun informaSeValoresSaoIguais(){
        println("Digite o valor de x:")
        val x = confereInputDouble()
        println("Digite o valor de y:")
        val y = confereInputDouble()
        if (x==y) {
            println("Os valores x e y são iguais.")
        } else {
            println("Os valores x e y são diferentes.")
        }

    }

    private fun confereInputDouble(): Double {
        while (true) {
            var numero: Double
            try {
                numero = readln().toDouble()
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número válido.")
                continue
            }
            return numero
        }
    }
}