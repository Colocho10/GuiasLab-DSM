import java.util.*

class Club {
    private val socio1: Socio
    private val socio2: Socio
    private val socio3: Socio
    private val teclado: Scanner

    init {
        teclado = Scanner(System.`in`)
        socio1 = Socio(teclado)
        socio2 = Socio(teclado)
        socio3 = Socio(teclado)
    }

    fun mayorAntiguedad() {
        print("Socio con mayor antiguedad:")
        if (socio1.retornarAntiguedad() > socio2.retornarAntiguedad() &&
            socio1.retornarAntiguedad() > socio3.retornarAntiguedad()
        ) {
            socio1.imprimir()
        } else {
            if (socio2.retornarAntiguedad() > socio3.retornarAntiguedad()) {
                socio2.imprimir()
            } else {
                socio3.imprimir()
            }
        }
    }
}
    fun main(ar: Array<String>) {
            val club1 = Club()
            club1.mayorAntiguedad()
        }