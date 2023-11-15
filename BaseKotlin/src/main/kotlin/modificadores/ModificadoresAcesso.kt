package modificadores

open class Animal {
    private var name = "Alvaro"
    protected var ano = 2018
    internal var tipo = "Mamifero"
    var pats = 4
}

class Dog: Animal(){
    fun descobrirIdade(){
        println("A idade é " + (2023 - ano))
    }
}


fun main() {
    val animal = Dog()
    animal.descobrirIdade()
    println(animal.tipo)
    println(animal.pats)
}
