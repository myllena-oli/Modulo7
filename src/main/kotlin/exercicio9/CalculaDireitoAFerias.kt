package exercicio9

import java.lang.NumberFormatException

class CalculaDireitoAFerias {
    data class Funcionario(val nome: String, val tempoServico: Int)

    fun lerQuantidadeFuncionario(): Int {
        println("Quantos funcionários? ")
        return confereInputInt()
    }

    fun recebeInformacoes(quantidade: Int): Array<Funcionario> {
        val funcionarios = Array<Funcionario>(quantidade) { Funcionario("", 0) }
        var nome: String
        for (i in 1..quantidade) {
            while (true) {
                print("Digite o nome do funcionário $i: ")
                nome = readln()
                if (nome == "") {
                    continue
                }
                break
            }
            print("Digite o tempo de serviço em meses do funcionário $i: ")
            val meses = confereInputInt()

            funcionarios[i-1]=(Funcionario(nome, meses))
        }
        return funcionarios
    }

    fun mostraInformacoes(funcionarios: Array<Funcionario>) {
        var comFerias = 0
        var semFerias = 0
        for (funcionario in funcionarios) {
            if (funcionario.tempoServico < 12) {
                println("${funcionario.nome} não tem direito a férias.")
                semFerias++
            } else {
                println("${funcionario.nome} tem direito a férias.")
                comFerias++
            }
        }
        println("Temos $comFerias funcionário(s) com direito a férias, e $semFerias funcionário(s) sem direito a férias.")

    }

    private fun confereInputInt(): Int {
        while (true) {
            var numero: Int
            try {
                numero = readln().toInt()
                if (numero < 0) {
                    println("O valor não pode ser negativo!")
                    continue
                }
            } catch (excecao: NumberFormatException) {
                println("Entrada inválida. Por favor, digite um número inteiro.")
                continue
            }
            return numero
        }
    }
}