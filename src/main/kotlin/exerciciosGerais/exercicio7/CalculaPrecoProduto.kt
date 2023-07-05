package exerciciosGerais.exercicio7

class CalculaPrecoProduto {
    fun calculaPrecoProduto(){
        print("Digite o preço de custo do produto: ")
        val precoCusto = readLine()?.toDoubleOrNull() ?: 0.0
        print("Digite o percentual de acréscimo (em porcentagem): ")
        val percentual = readLine()?.toDoubleOrNull() ?: 0.0
        val acrescimo = precoCusto*(percentual/100)
        println("O valor do produto é: R$ ${precoCusto+acrescimo}")

    }
}