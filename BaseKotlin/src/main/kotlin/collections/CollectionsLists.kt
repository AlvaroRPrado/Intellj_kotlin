package collections
//As lists são implementações de estrutura de dados parecidas com arrays
// mas com mais funções e podem ser multáveis
fun main() {
    val arrayList = arrayListOf("Alvaro", "Maria", "Valéria")
    arrayList.add("Pedro")

    println(arrayList)
    println(arrayList.size)

    arrayList.remove("Maria")

    println(arrayList.isEmpty())
    println(arrayList.contains("Alvaro"))
    println(arrayList.size)

    for (name in arrayList){
        println(name)
    }
}