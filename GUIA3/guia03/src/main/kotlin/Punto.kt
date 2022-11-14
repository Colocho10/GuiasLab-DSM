class Punto {
    var x: Int = 0
    var y: Int = 0

    fun inicializar() {
        print("Ingrese el valor de X:")
        x = readln().toInt()
        print("Ingrese el valor de Y:")
        y = readln().toInt()
    }

    fun cuadrante(){

        if (x > 0 && y > 0) {
            print("$x y $y se encuentran en el primer cuadrante")
        }

        else if (x < 0 && y > 0){
            print("$x y $y se encuentran en el segundo cuadrante")
        }

        else if (x < 0 && y < 0){
            print("$x y $y se encuentran en el tercer cuadrante")
        }

        else if (x > 0 && y < 0){
            print("$x y $y se encuentran en el cuarto cuadrante")
        }
        else{
            print("El punto se encuentran en un eje.")
        }
    }
}

fun main (parametros: Array<String>) {
    val valor1 = Punto()
    valor1.inicializar()
    valor1.cuadrante()
}