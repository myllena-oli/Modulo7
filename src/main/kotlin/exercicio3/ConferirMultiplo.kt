package exercicio3

class ConferirMultiplo {
    fun multiploDe5() {
        print("Digite um número: ")
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
        if(numero%5==0){
            println("$numero é múltiplo de 5.")
        }else{
            println("$numero não é múltiplo de 5.")
        }

    }
}