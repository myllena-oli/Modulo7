package exercicio12

import java.time.LocalDate

class LinhaDoTempo {
    fun linhaDoTempo(){
        print("Digite o ano em que você nasceu: ")
        val ano = confereInput()
        val dataHoje = LocalDate.now()
        val anoAtual = dataHoje.year
        var contador = 1

        println("No ano $ano você nasceu.")

        for(i in ano+1 .. anoAtual){
            if (i==anoAtual){
                println("Nesse ano, você fez ou fará $contador anos.")
            }else {
                println("No ano $i você fez $contador ano(s).")
                contador++
            }
        }

    }
    private fun confereInput(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número inteiro.")
                continue
            }
            return numero
        }
    }
}