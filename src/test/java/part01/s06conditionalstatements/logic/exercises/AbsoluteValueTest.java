package part01.s06conditionalstatements.logic.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.logic.exercises.AbsoluteValue
 */
class AbsoluteValueTest {

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
    public void testNegativeNumber() {
        setInput("-7\n");
        AbsoluteValue.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("7"), "-7 absolute value should be 7");
    }

    @Test
    public void testPositiveNumber() {
        setInput("14\n");
        AbsoluteValue.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("14"), "14 absolute value should remain 14");
    }

    @Test
    public void testZero() {
        setInput("0\n");
        AbsoluteValue.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("0"), "0 absolute value should be 0");
    }
}
