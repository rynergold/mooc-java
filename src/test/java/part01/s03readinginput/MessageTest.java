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
 * @see part01.s03readinginput.Message
 */
class MessageTest {

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
    public void testMessageWithBye() {
        setInput("Bye\n");
        Message.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Write a message:"), "Should prompt with 'Write a message:'");
        assertTrue(output.contains("Bye"), "Should print the user's message 'Bye'");
    }

    @Test
    public void testMessageWithOnceUponATime() {
        setInput("Once upon a time...\n");
        Message.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Write a message:"), "Should prompt with 'Write a message:'");
        assertTrue(output.contains("Once upon a time..."), "Should print the user's message 'Once upon a time...'");
    }
}
