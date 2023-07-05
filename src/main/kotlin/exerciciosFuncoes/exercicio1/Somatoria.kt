package exerciciosFuncoes.exercicio1

class Somatoria {

    fun recebeNumero(): Int {
        println("Digite o número:")
        val numero = confereInput()
        return numero
    }

    fun somatoria(numero:Int) {

        var soma = 0

        for (i in 1..numero) {
            soma +=i
        }
        println("A soma é $soma")
    }
    private fun confereInput(): Int {
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