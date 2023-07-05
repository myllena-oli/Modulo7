package exerciciosFuncoes.exercicio3

fun main() {

    var peso:Double
    var altura:Double

    while(true) {
        try {
            println("Qual o seu peso em quilos: ")
            peso = readln().toDouble()
        } catch (excecao: NumberFormatException) {
            println("O peso deve ser em quilos! ")
            continue
        }
        break
    }

        while(true) {

            try {
            println("Qual a sua altura em metros: ")
            altura = readln().toDouble()
        } catch (excecao: NumberFormatException) {
            println("A altura deve ser em metros! ")
            continue
        }
        break
    }
    CalculoIMC().calculoIMC(peso, altura)
}