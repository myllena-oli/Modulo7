package exercicio8

class DividirNome {
    fun lerNomeUsuario(): List<String> {
        var nome: String
        while (true) {
            print("Digite seu nome: ")
            nome = readln()
            if (nome == "") {
                continue
            }
            break
        }

        return nome.split(" ")
    }
    fun exibirNome(nomeCompleto: List<String>) {
        for(nome in nomeCompleto)
        println(nome)
    }
}