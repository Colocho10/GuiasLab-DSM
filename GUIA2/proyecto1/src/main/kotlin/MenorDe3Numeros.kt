fun main(parametro: Array<String>) {
    print("Ingrese el primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    print("Ingrese el tercer valor:")
    val valor3 = readLine()!!.toInt()


    if (valor1 < valor2 && valor1 < valor3){
        print("El menor valor es $valor1")
    }

    else if(valor2 < valor1 && valor2 < valor3){
        print("El menor valor es $valor2")
    }

    else if (valor3 < valor1 && valor3 < valor2){
        print("El menor valor es $valor3")
    }

    else{
        print("Todos los números son iguales.")
    }
}

