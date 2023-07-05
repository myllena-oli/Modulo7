package exerciciosGerais.exercicio1

class EntradaDados {
    data class Numeros(val numero1: Double, val numero2: Double)

    fun receberNumeros(): Numeros {
        print("Digite o primeiro número:")
        val numero1 = confereInputDouble()
        print("Digite o segundo número:")
        val numero2 = confereInputDouble()
        val numeros = Numeros(numero1, numero2)
        Menu().recebeNumeros(numeros)
        return numeros
    }
    fun lerOpcao(): Int {
        exibirMenu()

        println("Digite a opção desejada: ")
        return confereInputInt()
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

    private fun exibirMenu() {
        println("Menu:")
        println("1) Somar os números")
        println("2) Subtrair os números")
        println("3) Multiplicar os números")
        println("4) Dividir os números")
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
}