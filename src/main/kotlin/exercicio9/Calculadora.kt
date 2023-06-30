package exercicio9

class Calculadora {

    fun somar(numero1: Double, numero2: Double) {
        val resultado = numero1 + numero2
        println("A soma é: $resultado")
    }

    fun subtrair(numero1: Double, numero2: Double) {
        val resultado = numero1 - numero2
        println("A subtração é: $resultado")
    }

    fun multiplicar(numero1: Double, numero2: Double) {
        val resultado = numero1 * numero2
        println("A multiplicação é: $resultado")
    }

    fun dividir(numero1: Double, numero2: Double) {
        if (numero2 != 0.0) {
            val resultado = numero1 / numero2
            println("A divisão é: $resultado")
        } else {
            println("Não é possível dividir por zero")
        }
    }

}