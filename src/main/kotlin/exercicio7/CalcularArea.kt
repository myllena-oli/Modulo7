package exercicio7

class CalcularArea {

    fun areaRetangulo() {
        print("Digite a base do retângulo: ")
        val base = readln().toDouble()
        print("Digite a altura do retângulo: ")
        val altura = readln().toDouble()
        val area = base * altura
        print("A area do retângulo é: $area ")
    }
}