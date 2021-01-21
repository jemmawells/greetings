fun greetings(name: String?): String {

    val nameUpperCase = name?.toUpperCase()

    return when (name) {
        null -> "Hello, my friend"
        nameUpperCase -> "HELLO, $name!"
        else -> "Hello, $name"
    }
}