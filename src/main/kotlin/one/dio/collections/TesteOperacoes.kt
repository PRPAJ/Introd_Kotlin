package one.dio.collections

fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in salarios){
        println(salario)
    }
    println("----------------")
    println("O maior salário é ${salarios.max()}")
    println("O menor salário é ${salarios.min()}")
    println("A média salarial é ${salarios.average()}")
    println("----------------")
    val salariosMaiorQue2500 = salarios.filter{it>2500}
    salariosMaiorQue2500.forEach {println(it)}
}