package part01.s06conditionalstatements.logic.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.logic.exercises.PositiveCheck
 */
class PositiveCheckTest {

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
        setInput("8\n");
        PositiveCheck.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The number is positive"), "8 should be recognized as positive");
        assertFalse(output.contains("The number is not positive"), "8 should not print not positive");
    }

    @Test
    public void testZero() {
        setInput("0\n");
        PositiveCheck.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The number is not positive"), "0 is not positive");
    }

    @Test
    public void testNegativeNumber() {
        setInput("-4\n");
        PositiveCheck.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The number is not positive"), "-4 is not positive");
    }
}
