package part01.s05calculating;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s05calculating.SimpleCalculator
 */
class SimpleCalculatorTest {

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
    public void testSimpleCalculatorEightAndTwo() {
        setInput("8\n2\n");
        SimpleCalculator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("8 + 2 = 10"), "Addition formula incorrect");
        assertTrue(output.contains("8 - 2 = 6"), "Subtraction formula incorrect");
        assertTrue(output.contains("8 * 2 = 16"), "Multiplication formula incorrect");
        assertTrue(output.contains("8 / 2 = 4.0"), "Division formula incorrect (expected 4.0)");
    }

    @Test
    public void testSimpleCalculatorNineAndTwo() {
        setInput("9\n2\n");
        SimpleCalculator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("9 + 2 = 11"), "Addition formula incorrect");
        assertTrue(output.contains("9 - 2 = 7"), "Subtraction formula incorrect");
        assertTrue(output.contains("9 * 2 = 18"), "Multiplication formula incorrect");
        assertTrue(output.contains("9 / 2 = 4.5"), "Division formula incorrect (expected 4.5)");
    }
}
