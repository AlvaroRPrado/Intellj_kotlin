package arreios

fun main() {
    val array = arrayOf("GO", "PR", "SP")

    //alterando o valor do array
    array[2] = "BR"
    array[0] = "SP"
    array[1] = 11.toString()

    println(array[1])
    println("")

    val arrayMix = arrayOf("GO", 29, 40, "RJ")

    val arrayInteiros = intArrayOf(20,39, 22, 44, 54)

    //for pra imprimir os arrays
    for (inteiro in arrayInteiros) println("lista de array: $inteiro")

    println("")
    //for pra acessar o index
    for ((index, arrayMixado) in arrayMix.withIndex()){
        println("Index: $index - Mix $arrayMixado")
    }
    println("")

    //Somar os array
    val outrosEstados = arrayOf("MH", "TO", "RO")
    val todosEstados = array + outrosEstados
    for (soma in todosEstados) println("Resultado: $soma")
    println("")
    //As string por padrão é uma array
    val str = "Hoje tem é dia de festa"
    println("Pegando uma posição da string: " + str[5])


}