package exercicio10

class IndicaSucessor {
    fun indicaSucessor() {
        print("Digite um número inteiro: ")

        var numero: Int
        while (true) {
            try {
                numero = readln().toInt()
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número inteiro.")
                continue
            }
            break
        }
        val sucessor = numero + 1
        println("O sucessor é $sucessor")
    }
}
