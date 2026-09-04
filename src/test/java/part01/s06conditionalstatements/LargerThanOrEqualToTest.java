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
 * @see part01.s06conditionalstatements.LargerThanOrEqualTo
 */
class LargerThanOrEqualToTest {

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
    public void testFirstIsGreater() {
        setInput("5\n3\n");
        LargerThanOrEqualTo.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("Greater number is: 5"), "Expected 'Greater number is: 5'");
    }

    @Test
    public void testSecondIsGreater() {
        setInput("5\n8\n");
        LargerThanOrEqualTo.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("Greater number is: 8"), "Expected 'Greater number is: 8'");
    }

    @Test
    public void testNumbersAreEqual() {
        setInput("5\n5\n");
        LargerThanOrEqualTo.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("The numbers are equal!"), "Expected 'The numbers are equal!'");
    }

    @Test
    public void testNegativeNumbers() {
        setInput("-5\n-2\n");
        LargerThanOrEqualTo.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Greater number is: -2"), "Expected 'Greater number is: -2'");
    }
}
