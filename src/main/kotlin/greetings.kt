fun greetings(name: String?): String {

    val nameUpperCase = name?.toUpperCase()

    return when (name) {
        null -> "Hello, my friend"
        nameUpperCase -> "HELLO, $name!"
        else -> "Hello, $name"
    }
}

fun greetings(names: List<String>): String {
    return "Hello, " + names[0] + " and " + names[1]
}