import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val indication = "Hello, Welcome to the calculator\nplease continue selecting an option"
    println(indication)
    val message = "1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir"
    println(message)
    var option = readln().toInt()
    if(option in 5..0){
        
    }
    println("Ingrese el primer valor")
    var valor1 = readln().toDouble()
    println("Ingrese el segundo valor")
    var valor2 = readln().toDouble()

    when(option){
        1 -> {
           var resultado = valor1 + valor2
            println(resultado)
        }
        else -> {
            println("Ingrese una opcion valida")
        }
    }
}