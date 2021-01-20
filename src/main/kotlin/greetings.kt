
fun greetings(name: String?): String {
    return if (name == null) "Hello, my friend" else "Hello, $name"
}