package exercicio5

class ConferirPolaridade {
    fun conferirPolaridade() {
        print("Digite um número: ")
        val numero = readln().toInt()

        if(numero>0){
            println("O número é positivo.")
        }else if(numero<0){
            println("O número é negativo.")
        }else{
            println("O número é zero. Ou seja, é neutro.")
        }

    }
}