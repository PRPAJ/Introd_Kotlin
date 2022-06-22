package one.dio.collections

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    values.forEach {valor->
        println(valor)

    }
    println("------------------------------")
    for(valor in values){
        println(valor)
    }
    println("------------------------------")
    for (index in values.indices){
        println(values[index])

    }
    println("------ ordem crescente ------")
    values.sort()
    for (valor in values){
        println(valor)
    }
    println("----- ordem decrescente -----")
    values.sortDescending()
    for (valor in values){
        println(valor)
    }
}