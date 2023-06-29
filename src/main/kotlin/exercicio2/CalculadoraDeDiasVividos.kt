package exercicio2

import java.time.LocalDate
import kotlin.time.Duration.Companion.days

class CalculadoraDeDiasVividos {
    fun calculadoraDias() {
        print("Digite a idade em anos: ")
        val idade = confereInput()
        val dias = idade * 365

        println("Você viveu aproximadamente $dias dias, desconsiderando anos bissextos. ")
        while (true) {
            println("Deseja saber o resultado exato?\n1 - Sim\n2 - Não")
            val opcao = confereInput()
            if (opcao == 1) {
                calculadoraDiasVersao2()
                break
            } else if (opcao == 2) {
                break
            } else {
                print("Entrada inválida.")
            }
        }
    }

    fun calculadoraDiasVersao2() {

        print("Digite o dia em que você nasceu: ")
        val dia = confereInput()
        print("Digite o mês em que você nasceu: ")
        val mes = confereInput()
        print("Digite o ano em que você nasceu: ")
        val ano = confereInput()


        val dataHoje = LocalDate.now()

        val nascimento = LocalDate.of(ano, mes, dia)

        val resultado = nascimento.datesUntil(dataHoje)


        val total = resultado.count().days.inWholeDays

        println("Você viveu exatamente $total dias!")
    }

    fun confereInput(): Int {
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
