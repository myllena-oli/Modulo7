package exercicio6

class BandaMusical {

    fun listaMusicaBanda() {
        println("Digite o nome da banda:")
        val nome = confereInputString()
        var musicas = mutableListOf<String>()
        for(i in 1..3){
            println("Digite o nome da música $i:")
            val musica = confereInputString()
            musicas.add(musica)
        }
        println("Banda: $nome")
        println("Músicas:")
        for (musica in musicas) {
            println(musica)
        }
    }

    private fun confereInputString(): String {
        while (true) {
            val palavras = readln()
            if (palavras == "") {
                println("Esse campo não pode ser vazio!")
                continue
            }
            return palavras
        }

    }
}