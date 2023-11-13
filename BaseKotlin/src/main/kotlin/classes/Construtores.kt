package classes

class Carro2(var cor: String, var ano: Int, var modelo: String){

    //formas de iniciar o construtorer sem adicionar a var ou val no paramentro
    /* var cor: String
    var ano: Int
    var modelo: String
    init {
        this.cor = cor
        this.ano = ano
        this.modelo = modelo
    }*/
    init {
        println("Construindo: $modelo")
    }

    fun acelerar(){
        println("Acelerando o $modelo")
    }
}

fun main() {
    val  uno = Carro2("Vermelho", 2022, "MM22")

    println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
    uno.acelerar()
    println("")
    println("Meu uno é de cor  "+uno.cor +" ano "+ uno.ano +" modelo "+ uno.modelo)
    println("")

    val mercedes = Carro2("Branca", 2022, "M500")
    println("Minha mercedes e de cor: ${mercedes.cor}, ano: ${mercedes.ano}, modelo: ${mercedes.modelo}")
    mercedes.acelerar()
}