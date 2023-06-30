package exercicio8

class SerieFibonacci {
    data class Resultado(val valor1: Int, val valor2: Int)

    fun recebeNumero(): Int {
        println("Digite um numero:")
        return confereInputInt()
    }

    fun calculoFibonacci(numero: Int): Resultado {
        if (numero <= 1) {
            return Resultado(numero, numero)
        }
        var primeiro = 0
        var segundo = 1
        var fib = 1
        for (i in 2..numero) {
            fib = primeiro + segundo
            primeiro = segundo
            segundo = fib
        }
        return Resultado(numero, fib)
    }


    private fun confereInputInt(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
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