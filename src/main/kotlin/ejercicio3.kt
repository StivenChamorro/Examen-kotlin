package org.example

fun Int.duplicar(): Int {
    return this * 2
}

fun main() {
    val numero = 88
    val resultado = numero.duplicar()
    println("El doble de $numero es $resultado")
}