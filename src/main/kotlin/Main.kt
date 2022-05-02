fun sayHello(item: String) {
    val msg = "Hello $item"
    println(msg)
}
fun main() {
    sayHello("Misha")
    saySay("Hola","OMG")
}

fun saySay(greeting: String, item: String) = println("$greeting $item")