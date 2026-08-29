package part01.s04variables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s04variables.DoubleInput
 */
class DoubleInputTest {

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
    public void testDoubleInputPi() {
        setInput("3.14\n");
        DoubleInput.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Should ask 'Give a number:'");
        assertTrue(output.contains("You gave the number 3.14"), "Should print 'You gave the number 3.14'");
    }

    @Test
    public void testDoubleInputEuler() {
        setInput("2.718\n");
        DoubleInput.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Should ask 'Give a number:'");
        assertTrue(output.contains("You gave the number 2.718"), "Should print 'You gave the number 2.718'");
    }
}
