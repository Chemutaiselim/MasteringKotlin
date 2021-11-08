package Chapter4.FunctionsAsVariables

/*
The lambda syntax is used to assign greetingProvider as a function
That returns the literal string hello
 */
val greetingProvider: () -> String = { "Hello" }

fun main(args: Array<String>) {
    var greeting = greetingProvider()
    /*
    greetingProvider will be run twice,
    The first invocation is done by adding parentheses.
     */
    greeting = greetingProvider.invoke()
    // use the invoke method
}