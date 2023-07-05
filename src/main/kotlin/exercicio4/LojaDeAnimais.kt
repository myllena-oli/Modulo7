package exercicio4

import java.lang.NumberFormatException

data class Animais(var gato: Int, var cachorro: Int)

class LojaDeAnimais {
    fun lerQuantidade(): Int {
        println("Quantos animais há na loja? ")
        return confereInputInt()
    }

    fun tipoAnimal(quantidade: Int): Animais {
        var animais = Animais(0, 0)
        println("Para cada animal, digite 1 se for gato, ou 2, se for cachorro: ")
        for (i in 1..quantidade) {
            while (true) {
                print("Digite o tipo do animal $i:")
                val animal = confereInputInt()

                when (animal) {
                    1 -> {
                        animais.gato++
                        break
                    }

                    2 -> {
                        animais.cachorro++
                        break
                    }

                    else -> {
                        println("Entrada inválida. Por favor, digite 1 se for gato, ou 2, se for cachorro:")
                    }
                }
            }
        }
        return animais
    }

    fun exibeContagem(animais: Animais){
        println("Há ${animais.gato} gato(s) e ${animais.cachorro} cachorro(s).")
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