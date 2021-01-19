import org.junit.jupiter.api.Test
import assertk.assertThat
import assertk.assertions.isEqualTo

internal class GreetingsKtTest {

    @Test
    fun `Greeting should say Hello, Bob`(){

        assertThat(greetings("Bob")).isEqualTo("Hello, Bob")
    }

    @Test
    fun `Greeting should say Hello, my friend when no name is given`(){

        assertThat(greetings(null)).isEqualTo("Hello, my friend")
    }

}