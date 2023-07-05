package exerciciosGerais.exercicio1

class Menu {
    data class Numeros(val primeiro: Double, val segundo: Double)
    lateinit var valores: Numeros

    fun recebeNumeros(numeros: EntradaDados.Numeros) {
        this.valores = Numeros(numeros.numero1,numeros.numero2)
        val opcao = EntradaDados().lerOpcao()
        menu(opcao)
    }

    private fun menu(escolha: Int){

        when (escolha) {
            1 -> Calculadora().somar(valores.primeiro, valores.segundo)
            2 -> Calculadora().subtrair(valores.primeiro, valores.segundo)
            3 -> Calculadora().multiplicar(valores.primeiro, valores.segundo)
            4 -> Calculadora().dividir(valores.primeiro, valores.segundo)
            else -> println("Opção inválida")

        }

    }

}