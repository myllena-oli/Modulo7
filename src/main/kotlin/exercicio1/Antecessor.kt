package exercicio1

class Antecessor {
    fun indicaAntecessor() {
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
        val antecessor = numero - 1
        println("O antecessor é $antecessor")
    }
}