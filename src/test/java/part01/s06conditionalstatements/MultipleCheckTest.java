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
 * @see part01.s06conditionalstatements.MultipleCheck
 */
class MultipleCheckTest {

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
    public void testFirstIsMultipleOfSecond() {
        setInput("12\n4\n");
        MultipleCheck.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Multiples"), "12 is a multiple of 4");
    }

    @Test
    public void testSecondIsMultipleOfFirst() {
        setInput("3\n15\n");
        MultipleCheck.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Multiples"), "15 is a multiple of 3");
    }

    @Test
    public void testNotMultiples() {
        setInput("7\n5\n");
        MultipleCheck.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Not multiples"), "7 and 5 are not multiples");
    }
}
