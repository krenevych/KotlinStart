package lab02

fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun transformString(text: String, action: (String) -> String): String {
    return action(text)
}

fun main() {

    val transformString = transformString("Hello, World!") { it + it }
    println(transformString)
//    transformString("Hello, World!", {
//        text : String -> text.uppercase()
//    })


//    println("Hello!")
    val funcLambda = { it: String ->
        println("Calling lambda")
        it.uppercase()
    }

    val res = funcLambda("Hello World!")
    val res2 = funcLambda("Hello World! - 2")

//    println(uppercaseString("hello"))
    // HELLO
    println("Finish: $res, $res2")
}