package fluxo


fun main() {

    val idade: Int = 15
    if (idade < 18){
        println("Não pode beber nem tirar carta")
    }else if (idade < 21){
        println("Não poode beber mas pode tirar carta")
    }else{
        println("Pode beber a vontade e tirar carta")
    }
    println("Controle de fluxo com if else")

    val string: String = if (idade < 18)"Menor de idade" else "Maior de idade"
    println(string)

    println("")
    val str: String = if (idade < 18) {
        println("Formas de fazer if e else")
        "Menor de idade"
    }else{
        "Maior de idade"
    }
    println(str)

}