package exercicio11

class MediaNumeros {

    fun mediaNumeros() {
        var media = 0.0
        for (i in 1..15) {
            println("Digite o ${i}º número:")
            val numero = confereInputDouble()
            media +=numero
        }
        println("A média é ${media/15}")
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