package exercicio10

class SomaNumeros {
    fun somaNumeros(): String{
        var soma = 0
        var contador = 1
        do{
            soma += contador
            contador++
        }while (contador<=15)
        return "A soma é $soma."
    }
}