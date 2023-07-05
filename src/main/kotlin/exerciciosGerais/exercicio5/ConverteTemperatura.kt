package exerciciosGerais.exercicio5

class ConverteTemperatura {
    fun converteTemperatura(){
        print("Digite a temperatura em graus Celsius: ")
        val celsius = readLine()?.toDoubleOrNull() ?: 0.0
        val fahrenheit = (9 * celsius + 160) / 5
        println("A temperatura convertida é $fahrenheit")
    }

}