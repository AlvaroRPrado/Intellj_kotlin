package collections

// O set não permite elementos duplicados, e cria uma coleção
// que utiliza uma tabela hash para armazenamento

// MutableSet<T>  <- Java.util.HashSet<T>
fun main() {

    val set = hashSetOf(1, 2, 5, 5, 60, 60, 90)
    set.remove(1)
    set.add(200)

    for (item in set){
        println(item)
    }
    println("")
    println(set.size)
    println(set.isEmpty())
    println(set.clear())
    println("")
    println(set.size)
   println(set.isEmpty())
}


