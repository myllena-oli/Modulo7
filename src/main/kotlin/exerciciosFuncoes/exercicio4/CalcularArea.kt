package exerciciosFuncoes.exercicio4

class CalcularArea {

    fun areaRetangulo(): Double {
        while (true) {
            val area: Double
            try {

            print("Digite a base do retângulo: ")
            val base = readln().toDouble()
            print("Digite a altura do retângulo: ")
            val altura = readln().toDouble()
            area = base * altura

            } catch (excecao: NumberFormatException) {
                println("Informa um número! Vamos começar novamente... ")
                continue
            }
            return area
        }
    }
}