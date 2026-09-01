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
 * @see part01.s05calculating.SumOfTwoNumbers
 */
class SumOfTwoNumbersTest {

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
    public void testSumOfEightAndThree() {
        setInput("8\n3\n");
        SumOfTwoNumbers.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("The sum of the numbers is 11"), "Sum of 8 and 3 should be 11");
    }

    @Test
    public void testSumWithNegative() {
        setInput("3\n-1\n");
        SumOfTwoNumbers.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The sum of the numbers is 2"), "Sum of 3 and -1 should be 2");
    }
}
