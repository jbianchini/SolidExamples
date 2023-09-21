package substitution

class Cuadrado(val lado: Double) : Figura() {
    override fun calcularArea(): Double {
        return lado * lado
    }
}