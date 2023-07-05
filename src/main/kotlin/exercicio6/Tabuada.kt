package exercicio6

class Tabuada {
    fun tabuada(){
        for (i in 1 ..9){
            println("\nTabuada do $i")
            for(j in 1 .. 10){
                println("$i x $j = ${i*j}")
            }
        }
    }
}