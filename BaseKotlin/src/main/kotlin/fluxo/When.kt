package fluxo

fun main() {
    val option: Int = 10

    when(option){
        1 -> println("Trabalhando com when, vendo suas variações")
        2 -> println("Catão de credito")
        3 -> println("Internet banking")
        else -> {
            println("Nenhuma opção encotrada")
        }
    }
    println("")
    println("Colocando o WHEN dentro de uma variavel")
    println("")

    var optionSel = when (option){
        1 -> "Conta corrente"
        2 -> "Cartão de credito"
        3 -> "Internet banking"
        else-> {
            println("Nenhuma opção encontrada")
            "Eita o bagulho é louco"
        }

    }

    println("Opção selecionada: $option - $optionSel" )
}