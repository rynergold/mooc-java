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
 * @see part01.s06conditionalstatements.Positivity
 */
class PositivityTest {

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
    public void testPositiveNumber() {
        setInput("5\n");
        Positivity.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertTrue(output.contains("The number is positive."), "Expected 'The number is positive.' for input 5");
    }

    @Test
    public void testNegativeNumber() {
        setInput("-2\n");
        Positivity.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertTrue(output.contains("The number is not positive."), "Expected 'The number is not positive.' for input -2");
    }

    @Test
    public void testZero() {
        setInput("0\n");
        Positivity.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertTrue(output.contains("The number is not positive."), "Expected 'The number is not positive.' for input 0");
    }
}
