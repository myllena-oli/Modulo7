package exercicio8

fun main() {
    val resultado = SerieFibonacci().calculoFibonacci(SerieFibonacci().recebeNumero())

    println("Fib(${resultado.valor1}) = ${resultado.valor2}")

}