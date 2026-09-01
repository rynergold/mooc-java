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
 * @see part01.s05calculating.SumOfThreeNumbers
 */
class SumOfThreeNumbersTest {

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
    public void testSumOfEightThreeThree() {
        setInput("8\n3\n3\n");
        SumOfThreeNumbers.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("Give the third number:"), "Missing prompt 3");
        assertTrue(output.contains("The sum of the numbers is 14"), "Sum of 8, 3, 3 should be 14");
    }

    @Test
    public void testSumWithNegativeAndPositive() {
        setInput("3\n-1\n2\n");
        SumOfThreeNumbers.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The sum of the numbers is 4"), "Sum of 3, -1, 2 should be 4");
    }
}
