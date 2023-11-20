package collections
// O map e uma implementação baseada em chave-valor e apesar de não fazer parte
// diretamente da herarquia das collections, é considerada uma
fun main() {

    val map = hashMapOf("Chave" to 1, "Chave2" to 2, "chave3" to "Alvaro")
    map.put("Chave4", 4)
    map.remove("Chave2")

    for (chave in map.keys){
        println("$chave: ${map[chave]}")
    }
    println("")
    println(map.size)
    println(map.keys)
    map.clear()


    for (chave in map.keys){
        println("$chave: ${map[chave]}")
    }
    println("")
    println(map.size)
}