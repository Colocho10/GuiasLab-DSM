class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Ingrese su nombre:")
        nombre = readln().toString()
        print("Ingrese su nota:")
        nota = readln().toInt()
    }

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun regular() {
        if (nota >= 4)
            println("$nombre se encuentra en REGULAR")
        else
            println("$nombre no está REGULAR")
    }
}

