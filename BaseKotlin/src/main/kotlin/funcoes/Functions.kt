package funcoes

import java.util.Date

fun main() {
    olaMundo()
    println(queHorasSao())
    val resultado = soma(21, 44)
    println(resultado)

    val result = variostTipo(23, 54, false)
    val result2 = variostTipo(3, 5, true)
    println(result)
    println(result2)

}

fun olaMundo(){
    println("Ola mundão")
}
fun queHorasSao(): Date {
    return Date()
}
fun soma(a: Int, b: Int): Int {
    return a + b
}
fun variostTipo(a: Int, b: Int, boolean: Boolean): Int{

    if (boolean)return a + b else return a - b
}