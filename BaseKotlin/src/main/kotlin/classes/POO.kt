package classes

class Carro(){
    var cor: String = "Vermelho"
    var ano: Int = 2022
    var modelo: String = "Fox"
}

fun main() {
    val  uno = Carro()
    uno.cor = "Branco"
    uno.ano = 2023
    uno.modelo = "MM22"
    println("Meu caro é uno de cor:" + uno.cor)
    println(uno.ano)
    println(uno.modelo)
    //formas contatenar
    println("")
    println("Meu uno é de cor  "+uno.cor +" ano "+ uno.ano +" modelo "+ uno.modelo)
}