package exercicio6

class ConversorDinheiro {
    fun conversorDinheiro() {
        print("Digite o valor em dólar: ")
        val dolar = readln().toDouble()
        val reais = dolar*4.86

        println("O valor em reais é R$ $reais.")


    }
}