package org.example

class Producto(val nombre: String, val precio: Double) {
    fun mostrarPrecioConIVA() {
        val precioConIVA = precio * 1.16
        println("El precio del producto $nombre con IVA es: $precioConIVA")
    }
}

fun main() {
    val producto1 = Producto("Laptop", 1500.0)
    val producto2 = Producto("Teléfono", 900000.0)

    producto1.mostrarPrecioConIVA()
    producto2.mostrarPrecioConIVA()
}