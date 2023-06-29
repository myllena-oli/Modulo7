package exercicio4

class ConferirClima {
    fun conferirClima() {
        print("Digite a temperatura em graus Celsius: ")
        val temperatura : Double = readln().toDouble()

        val clima: String = when{
            temperatura <= 18 -> "o clima é frio"
            temperatura > 19 && temperatura <= 23 -> "o clima é agradável"
            temperatura > 24 && temperatura <= 35 -> "o clima é quente"
            else -> "o clima é muito quente"
        }
        println(clima)
//
//        print("Digite a temperatura em graus Celsius: ")
//        val temperatura2 : Int = readln().toInt()
//
//        val clima2: String = when{
//            temperatura2 <= 18 -> "o clima é frio"
//            temperatura2 in 19 .. 23 -> "o clima é agradável"
//            temperatura2 in 24 .. 35 -> "o clima é quente"
//            else -> "o clima é muito quente"
//        }
//        println(clima2)

    }
}