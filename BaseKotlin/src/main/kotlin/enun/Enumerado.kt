package enun

enum class Direcao{
    NORTE, SUL, LESTE, OESTE
}

class Bussola{
    var direcao: Direcao = Direcao.SUL
}

fun main() {
    val bussola = Bussola()
    println(bussola.direcao)
    println("")
    bussola.direcao = Direcao.NORTE
    println(bussola.direcao)
    println("")
    bussola.direcao = Direcao.LESTE
    println(bussola.direcao)
    println("")
    bussola.direcao = Direcao.OESTE
    println(bussola.direcao)
}