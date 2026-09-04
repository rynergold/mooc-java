package part01.s06conditionalstatements;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.Adulthood
 */
class AdulthoodTest {

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
    public void testUnderEighteen() {
        setInput("12\n");
        Adulthood.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("How old are you?"), "Missing prompt 'How old are you?'");
        assertTrue(output.contains("You are not an adult"), "Expected 'You are not an adult' for age 12");
    }

    @Test
    public void testExactlyEighteen() {
        setInput("18\n");
        Adulthood.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("How old are you?"), "Missing prompt 'How old are you?'");
        assertTrue(output.contains("You are an adult"), "Expected 'You are an adult' for age 18");
    }

    @Test
    public void testOverEighteen() {
        setInput("32\n");
        Adulthood.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("How old are you?"), "Missing prompt 'How old are you?'");
        assertTrue(output.contains("You are an adult"), "Expected 'You are an adult' for age 32");
    }
}
