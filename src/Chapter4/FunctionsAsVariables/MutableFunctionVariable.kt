package Chapter4.FunctionsAsVariables

var greetingsProvider: () -> String = { "Herro" }//Var makes the function mutable

fun main(args: Array<String>) {
    println(greetingsProvider())//To print Herro
    greetingsProvider = { "*Hello" }//The return value can be changed from Hello To Hey
    println(greetingsProvider())//To Print Hello
}