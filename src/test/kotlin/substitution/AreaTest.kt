package substitution

import kotlin.test.Test
import kotlin.test.assertEquals

class AreaTest {

    val areaPrinter: AreaPrinter = AreaPrinter()

    @Test
    fun `imprimirArea, dado una figura, deberia devolver 0`(){
        val figura = Figura()

        assertEquals("Área: 0.0", areaPrinter.imprimirArea(figura))
    }

    @Test
    fun `imprimirArea, dado una cuadrado de lado 2, deberia devolver 4`(){
        val figura = Cuadrado(2.0)

        assertEquals("Área: 4.0", areaPrinter.imprimirArea(figura))
    }

    @Test
    fun `imprimirArea, dado una círculo de radio 2, deberia devolver 12,566370614359172`(){
        val figura = Circulo(2.0)

        assertEquals("Área: 12.566370614359172", areaPrinter.imprimirArea(figura))
    }
}