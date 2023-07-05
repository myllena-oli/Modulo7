package exerciciosGerais.exercicio6

class ConverteDinheiro {
    fun dolarParaReal(){
        println("Digite a cotação do dólar: ")
        var cotacao = readLine()?.toDoubleOrNull() ?: 4.0
        if (cotacao<0){
            cotacao=4.0
        }
        println("Digite a quantidade de dólares: ")
        var dolares = readLine()?.toDoubleOrNull() ?: 0.0
        if (dolares<0){
            dolares=0.0
        }
        val reais = cotacao*dolares
        println("O valor em reais é R$ $reais.")

    }
}