package dataClass

//Data class é uma classe que transporta dados

class Livro(
    val titulo: String,
    val autor: String,
    val ano: Int
){
//    override fun toString(): String {
//        return "Livro[titulo=$titulo]"
//    }
}

//data class vem com hash code e toSting implementado do java
data class DataLivro(
    val titulo: String,
    val autor: String,
    val ano: Int
)

fun main() {
    //class comum
    val livro = Livro("Promessa", "Alvaro", 2023)
    val livro2 = Livro("Promessa", "Alvaro", 2023)

    //com data class
    val dataLivro = DataLivro("Promessa", "Alvaro", 2023)
    val dataLivro2 = DataLivro("Promessa", "Alvaro", 2023)

    println(livro)//resultado
    println("Os livro são iguais? " + livro.equals(livro2))

    println(dataLivro)//resultado
    println("Os livro são iguais? " + dataLivro.equals(dataLivro2))
}