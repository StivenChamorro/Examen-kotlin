package org.example


abstract class FiguraGeometrica {

    abstract fun calcularArea(): Double
}

class Rectangulo(private val largo: Double, private val ancho: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return ancho * largo
    }
}

class Circulo(private val radio: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}
 fun main (){
     val rectangulo = Rectangulo(10.0, 5.0)
     println("El área del rectangulo es: ${rectangulo.calcularArea()}")

     val circulo = Circulo(10.0)
     println("El área del circulo es: ${circulo.calcularArea()}")
 }