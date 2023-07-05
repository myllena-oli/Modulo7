package exercicio5

class Saudacao {

    fun lerNomeUsuario(): String {
        var nome: String
        while (true) {
            print("Digite seu primeiro nome: ")
            nome = readln()
            if (nome == "") {
                continue
            }
            break
        }

        return nome.split(" ")[0]
    }
    fun exibirSaudacao(nome: String) {
        println("Olá, $nome! Seja bem-vinda(o)!")
    }

}