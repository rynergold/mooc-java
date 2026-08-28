package part01.s03readinginput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s03readinginput.Conversation
 */
class ConversationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void setInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testConversationFirstScenario() {
        setInput("Good thank you!\nWell, there's really nothing to tell.\n");
        Conversation.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Greetings! How are you doing?"), "Should ask 'Greetings! How are you doing?'");
        assertTrue(output.contains("Oh, how interesting. Tell me more!"), "Should ask 'Oh, how interesting. Tell me more!'");
        assertTrue(output.contains("Thanks for sharing!"), "Should print 'Thanks for sharing!'");
    }

    @Test
    public void testConversationSecondScenario() {
        setInput("Nice and dandy like cotton candy!\nJust went shopping.\n");
        Conversation.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Greetings! How are you doing?"), "Should ask 'Greetings! How are you doing?'");
        assertTrue(output.contains("Oh, how interesting. Tell me more!"), "Should ask 'Oh, how interesting. Tell me more!'");
        assertTrue(output.contains("Thanks for sharing!"), "Should print 'Thanks for sharing!'");
    }
}
