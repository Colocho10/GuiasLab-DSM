fun main(parametro: Array<String>) {
    print("Ingrese el primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    print("Ingrese el tercer valor:")
    val valor3 = readLine()!!.toInt()


     val suma = valor1 + valor2

    if (valor3 == suma){
        print("$suma es igual a la suma de los primeros valores")
    }

        else
            print("$suma no es igual a la suma de los  dos primeros valores")
}

