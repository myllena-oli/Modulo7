package exercicio4

class VerificaParidade {
    fun recebeNumeros(): MutableList<Int> {
        val lista = mutableListOf<Int>()
        for(i in 1 .. 10){
            println("Digite o $i º número: ")
            val numero = confereInputInt()
            lista.add(numero)
        }
        return lista
    }
    fun imprimePares(lista:MutableList<Int>){
        println("Pares:")
        for (numero in lista) {
            if (numero % 2 == 0) {
                println(numero)
            }
        }
    }



    private fun confereInputInt(): Int {
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