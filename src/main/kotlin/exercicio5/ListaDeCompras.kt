package exercicio5

class ListaDeCompras {
    fun recebeQuantidade(): Int {
        println("Quantos itens deseja adicionar na lista: ")
        return confereInputInt()

    }

    fun preencheLista(quantidade: Int) {
        val lista = mutableListOf<String>()
        for (i in 0 until quantidade) {
            while (true) {

                println("Digite o ${i + 1}º produto:")
                val produto = readln()
                if (produto == "") {
                    println("Produto não pode ser vazio.")
                    continue
                }
                lista.add(produto)
                break
            }
        }
        if(quantidade==0){
            println("Obrigada por usar o sistema!")
        }
        else{
            exibirLista(lista)
        }
    }

    private fun exibirLista(lista: List<String>) {
        println("Lista de Compras:")
        for (produto in lista) {
            println(produto)
        }
    }


    private fun confereInputInt(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
                if (numero < 0) {
                    println("Entrada inválida. Por favor, digite um número positivo.")
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