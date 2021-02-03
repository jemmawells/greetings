fun greetings(name: String?): String {

    val nameUpperCase = name?.toUpperCase()

    return when (name) {
        null -> "Hello, my friend"
        nameUpperCase -> "HELLO, $name!"
        else -> "Hello, $name"
    }
}

fun greetings(names: List<String>): String {

    val lastNameString = " and ${names[names.size -1]}"

    return names.dropLast(1).joinToString(prefix = "Hello, ", postfix = lastNameString)
}