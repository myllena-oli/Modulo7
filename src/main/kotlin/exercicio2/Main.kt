package exercicio2

fun main (){
    val vetor = VetorComDobros().montaVetor(VetorComDobros().recebeValor())
    for (valor in vetor){
        print("$valor ")
    }
}