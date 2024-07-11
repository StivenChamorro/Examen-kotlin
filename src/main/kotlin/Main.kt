package org.example

fun sumarPares(numeros: Array<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        if (numero % 2 == 0) {
            suma += numero
        }
    }
    return suma
}

fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    val resultado = sumarPares(numeros)
    println("la suma de los numeros pares es: $resultado")
}

