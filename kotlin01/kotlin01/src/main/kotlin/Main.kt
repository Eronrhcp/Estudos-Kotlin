import java.util.concurrent.locks.Condition

//Comentários

/*
* comentários em multiplas linhas
*
* */
fun main(args: Array<String>) {
    val age = 26
    val pi : Float = 3.14F
    val e : Float = 2.71F
    var function: (Int, Int) -> Int = ::sum

    calculator(2,3,::sum)
}

typealias Operations = (Int, Int) -> Int

fun calculator(x: Int, y: Int, condition: (Int, Int) -> Int){
    println(condition(x, y))
}
fun repeticoes(){
    for(i in 0..10){
        println("o i é i=$i")
    }
}

fun printInt(number: Double){
    println("O valor de pi é $number")
}

fun sum(x: Int, y: Int): Int {
    val resultado = x + y
    return resultado
}
fun sub(x: Int, y: Int): Int {
    val resultado = x - y
    return resultado
}

fun deMaior(idade: Int){
    when(idade){
        in 0..18 -> println("é de menor")
        in 19..60 -> println("é de maior")
    }
}

/*
*  dados
*
*   val pi : Float = 3.14F

    println("O valor de pi é $pi")
 */