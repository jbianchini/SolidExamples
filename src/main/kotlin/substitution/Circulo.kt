package substitution

class Circulo(val radio: Double) : Figura() {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}