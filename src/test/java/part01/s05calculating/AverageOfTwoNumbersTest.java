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
 * @see part01.s05calculating.AverageOfTwoNumbers
 */
class AverageOfTwoNumbersTest {

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
    public void testAverageOfEightAndTwo() {
        setInput("8\n2\n");
        AverageOfTwoNumbers.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("The average is 5.0"), "Average of 8 and 2 should be 5.0");
    }

    @Test
    public void testAverageOfNineAndTwo() {
        setInput("9\n2\n");
        AverageOfTwoNumbers.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The average is 4.5"), "Average of 9 and 2 should be 4.5");
    }
}
