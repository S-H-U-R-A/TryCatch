import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

data class PersonaKt(val nombre: String, val edad: Int)

fun esNUmero(dato: Any?) = dato is Int || dato is Int?

fun fail(mensaje: String): Nothing{
    throw  IllegalArgumentException(mensaje)
}

fun main(args: Array<String>) {
    /*println("Ingresa cualquier cosa")

    val num: Any? = try {
        readLine()?.toInt()
    }catch (e: NumberFormatException){
        "No es un entero"
    }

    println("Variable")
    println(num)
    println("Funcion")
    println(esNUmero(num))*/

    //Creando excepcion propia
    /*var name = ""
    val persona: PersonaKt? = null
    try {
        name = persona?.nombre ?: throw  IllegalArgumentException("Nombre requerido")
    }catch (e: IllegalArgumentException){
        println(e)
        println(name)
    }*/

    var name = ""
    val persona: PersonaKt? = null
    try {
        name = persona?.nombre ?: fail("Nombre requerido")
    }catch (e: IllegalArgumentException){
        println(e)
        println(name)
    }


}