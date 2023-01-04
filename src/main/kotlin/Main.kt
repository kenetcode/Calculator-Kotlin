import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var valor1 : Double
    var valor2 : Double
    var resultado : Double

    val indication = "Hello, Welcome to the calculator\nplease continue selecting an option"
    println(indication)

    val message = "1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir"
    println(message)
    var option = readln().toInt()

    when(option){
        1 -> {
            println("Ingrese el primer valor")
            valor1 = readln().toDouble()

            println("Ingrese el segundo valor")
            valor2 = readln().toDouble()

            resultado = valor1 + valor2
            println("El valor de la suma de $valor1 + $valor2 = $resultado")
        }
        else -> {
            println("Ingrese una opcion valida")
        }
    }
}