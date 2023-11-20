package excecoes
//As class de exceção do kotlin são descendente da class THROWABLE e cada exceção
// tem uma mensagem se stacktrace de erros
fun main() {
  try {
      println("Digite um numero:")
      val numero: Int = readLine()!!.toInt()
      val divisao: Int = 100 / numero
      println("Resultado da divisão é: $divisao")
  }catch (e: Exception){
      println("Erro: ${e.message}")
  }finally {
      println("Programa finalizado!")
  }
}