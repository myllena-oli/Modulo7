package exercicio8

class TrocaVariaveis {
    fun trocaVariaveis(){
        print("Digite o valor de x: ")
        var x = readln().toDouble()
        print("Digite o valor de y: ")
        var y = readln().toDouble()

        val troca = x
        x = y
        y = troca

        println("O valor de x é $x e o valor de y é $y.")

    }
}