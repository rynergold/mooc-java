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
 * @see part01.s03readinginput.Greeting
 */
class GreetingTest {

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
    public void testGreetingAda() {
        setInput("Ada\n");
        Greeting.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("What's your name?"), "Should prompt 'What's your name?'");
        assertTrue(output.contains("Hi Ada"), "Should print 'Hi Ada'");
    }

    @Test
    public void testGreetingLily() {
        setInput("Lily\n");
        Greeting.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("What's your name?"), "Should prompt 'What's your name?'");
        assertTrue(output.contains("Hi Lily"), "Should print 'Hi Lily'");
    }
}
