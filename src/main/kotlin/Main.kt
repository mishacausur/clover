fun getGreeting(): String {
    return "Hello there"
}

fun sayHello(): Unit {
    println(getGreeting())
}
fun main() {
    println(getGreeting())
    sayHello()
}
