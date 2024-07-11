package org.example

fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
    return operacion(numero)
}

fun cuadrado(numero: Int): Int {
    return numero * numero
}

fun multiplicar(numero:Int):Int{
    return numero * 2
}

fun main() {
    val numero = 10

    println(aplicarOperacion(5, ::cuadrado))
    println(aplicarOperacion(5, ::multiplicar))

}

