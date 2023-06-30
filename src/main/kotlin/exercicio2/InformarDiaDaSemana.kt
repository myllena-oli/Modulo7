package exercicio2

class InformarDiaDaSemana {
    fun recebeDiaDaSemana(): Int {
        println("Digite um número de 1 a 7: ")
        return confereInputInt()

    }

    fun forneceDiaDaSemana(numero: Int){
         val dia = when(numero){
            1 -> "Domingo"
            2 -> "Segunda-feira"
            3 -> "Terça-feira"
            4 -> "Quarta-feira"
            5 -> "Quinta-feira"
            6 -> "Sexta-feira"
            else -> "Sábado"
        }
        println(dia)
    }

    private fun confereInputInt(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
                if(numero<1||numero>7){
                    println("Entrada inválida. Por favor, digite um número de 1 a 7.")
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