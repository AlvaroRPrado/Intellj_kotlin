package classes

open class Veiculo(
    open var cor: String,
    open var ano: Int,
    open var modelo: String) {

    fun acelerar() {
        println("Acelerando o $modelo")
    }
}

class Carro3(
    override var cor: String,
    override var ano: Int,
    override var modelo: String): Veiculo(cor, ano, modelo){
    init {
        println("Construindo: $modelo")
    }
    fun abrirPorta(){
        println("Fechando a porta do uno $modelo")
    }

}



    class Caminhao(
        override var cor: String,
        override var ano: Int,
        override var modelo: String,
        var CapacidadeCarga: Long): Veiculo(cor, ano, modelo){


    }

fun main() {

    val uno = Carro3("Vermelho", 2022, "MM22")
    println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
    uno.abrirPorta()
    uno.acelerar()
    println("")

    val scania = Caminhao("Vermelho", 2022, "S2500", 20000 )
    println("Scania de cor: ${scania.cor} " +
            "ano: ${scania.ano} modelo: ${scania.modelo}" +
            " com capacide de carga: ${scania.CapacidadeCarga} ")
    scania.acelerar()

}