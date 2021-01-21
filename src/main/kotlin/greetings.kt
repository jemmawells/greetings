fun greetings(name: String?): String {

    val nameUpperCase = name?.toUpperCase()

    if (name == null) return "Hello, my friend"
    if (name == nameUpperCase) return "HELLO, $name!"
    else return "Hello, $name"
}