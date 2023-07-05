package exerciciosFuncoes.exercicio3

class CalculoIMC {
    fun calculoIMC(peso: Double, altura: Double) {
        val imc = peso / (altura * altura)

        val classificacao = when{
            imc < 18.5 -> "Magreza"
            imc < 24.9 -> "Normal"
            imc < 29.9 -> "Sobrepeso"
            imc < 39.9 -> "Obesidade"
            else -> "Obesidade Grave"
        }
        println(classificacao)
    }
}
