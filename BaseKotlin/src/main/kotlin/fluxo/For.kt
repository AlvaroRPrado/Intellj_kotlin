package fluxo

fun main() {

    //Formas de fazer o for no kotlin
    for (item in 1..22){
        println("Meus itens $item")
    }
    println("")

    for (item in 22 downTo 12) println("for sem bloco $item")
}