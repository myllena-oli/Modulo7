package exercicio3

fun main(){
    val soma = CaixaDeSupermercado().totalCompra(CaixaDeSupermercado().lerQuantidade())
    println("O cliente deve pagar R$%.2f".format(soma))
}