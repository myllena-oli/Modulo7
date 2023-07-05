package exerciciosFuncoes.exercicio2

class RetornaFrase {

    fun lerNome(): String {
        var nome: String
        while (true) {
            println("Digite o nome: ")
            nome = readln()
            if (nome.isBlank()){
                println("O nome não pode ser vazio.")
                continue
            }
            return nome
        }
    }
}