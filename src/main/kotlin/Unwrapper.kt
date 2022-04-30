var name = "Misha"
var greeating: String? = null
fun greeating() {
// when

    when (greeating) {
        null -> println("Hi")
        else -> println("greeating")
    }
    println(name)

// variable
    greeating = "Hello"
    val greatingToPrint = if (greeating != null) greeating else "Hi"
    println(greatingToPrint)
    println(name)

// when as a variable
    val greatingToPrint1 = when (greeating) {
        null -> "Hi"
        else -> greeating
    }
}