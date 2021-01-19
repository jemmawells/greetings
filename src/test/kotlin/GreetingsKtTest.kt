import org.junit.jupiter.api.Test
import assertk.assertThat
import assertk.assertions.isEqualTo

internal class GreetingsKtTest {

    @Test
    fun `Greeting should say Hello, Bob`(){

        assertThat(greetings("Bob")).isEqualTo("Hello, Bob")
    }

}