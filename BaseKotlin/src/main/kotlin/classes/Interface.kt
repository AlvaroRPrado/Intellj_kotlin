package classes

interface Dirigivel{
    fun acelerar(velocidade: Long)
}

interface Carga{
    fun carregar(quantidade: Int)
}
open class Veiculo2(
    open var cor: String,
    open var ano: Int,
    open var modelo: String) {

}

class Carro4(
    override var cor: String,
    override var ano: Int,
    override var modelo: String): Veiculo(cor, ano, modelo), Dirigivel{
    init {
        println("Construindo: $modelo")
    }
    fun abrirPorta(){
        println("Fechando a porta do uno $modelo")
    }

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade km/h")
    }

}



class Caminhao2(
    override var cor: String,
    override var ano: Int,
    override var modelo: String,
    var CapacidadeCarga: Long): Veiculo(cor, ano, modelo), Dirigivel, Carga{
    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade km/h")

    }

    override fun carregar(quantidade: Int) {
        println("Carregado caminhão com $quantidade tomeladas")
    }
}

fun main() {

    val uno: Dirigivel = Carro4("Vermelho", 2022, "MM22")
   // println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
   // uno.abrirPorta()
    uno.acelerar(200)
    println("")

    val scania = Caminhao2("Vermelho", 2022, "S2500", 20000 )
    println("Scania de cor: ${scania.cor} " +
            "ano: ${scania.ano} modelo: ${scania.modelo}" +
            " com capacide de carga: ${scania.CapacidadeCarga} ")
    scania.acelerar(90)
    scania.carregar(20)


}