package exerciciosGerais.exercicio3

data class Pessoa(val nome: String, val salario: Double, val vendas: Double)
class CalcularSalario {

    fun lerInformacoes(): Pessoa {
        var nome: String
        while (true) {
            print("Digite o nome do vendedor: ")
            nome = readln()
            if (nome==""){
                continue
            }
            break
        }

        print("Digite o salário fixo do vendedor: ")
        var salarioFixo = readLine()?.toDoubleOrNull() ?: 0.0
        if (salarioFixo<0){
            salarioFixo=0.0
        }

        print("Digite o total de vendas efetuadas no mês em reais: ")
        var totalVendas = readLine()?.toDoubleOrNull() ?: 0.0
        if (totalVendas<0){
            totalVendas=0.0
        }

        return Pessoa (nome,salarioFixo, totalVendas)
    }

    fun calcularSalarioFinal(funcionario: Pessoa) {
        val comissao = funcionario.vendas * 0.15
        println("Nome do vendedor: ${funcionario.nome}")
        println("Salário fixo: R$ ${funcionario.salario}")
        println("Salário final: R$ ${funcionario.salario+comissao}")
    }
}