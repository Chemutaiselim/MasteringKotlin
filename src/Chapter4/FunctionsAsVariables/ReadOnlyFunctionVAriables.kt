package Chapter4.FunctionsAsVariables
val greetingProvider: () -> String = { "Hello" }
fun main(args: Array<String>) {
    var greeting = greetingProvider() // invoke with parentheses
    greeting = greetingProvider.invoke() // use the invoke method
}