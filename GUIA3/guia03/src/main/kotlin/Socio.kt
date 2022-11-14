import java.util.*

class Socio(teclado: Scanner) {
    private val nombre: String
    private val antiguedad: Int

    init {
        print("Ingrese el nombre del socio:")
        nombre = teclado.next()
        print("Ingrese la antiguedad:")
        antiguedad = teclado.nextInt()
    }

    fun imprimir() {
        println("$nombre tiene una antiguedad de $antiguedad")
    }

    fun retornarAntiguedad(): Int {
        return antiguedad
    }
}