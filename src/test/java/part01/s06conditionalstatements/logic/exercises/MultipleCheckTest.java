package part01.s06conditionalstatements.logic.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.logic.exercises.MultipleCheck
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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter first number:"), "Must display 'Enter first number:' prompt");
        assertTrue(output.contains("Enter second number:"), "Must display 'Enter second number:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter first number") && !l.startsWith("Enter second number"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one result line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testFirstIsMultipleOfSecond() {
        setInput("12\n4\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Multiples");
    }

    @Test
    public void testSecondIsMultipleOfFirst() {
        setInput("3\n15\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Multiples");
    }

    @Test
    public void testNotMultiples() {
        setInput("7\n5\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Not multiples");
    }

    @Test
    public void testSameNumbers() {
        setInput("6\n6\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Multiples");
    }

    @Test
    public void testDivisibleByOne() {
        setInput("9\n1\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Multiples");
    }

    @Test
    public void testOneDivisibleByNumber() {
        setInput("1\n9\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Multiples");
    }

    @Test
    public void testAnotherNonMultiple() {
        setInput("13\n2\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Not multiples");
    }

    @Test
    public void testZeroAsSecondNumberDoesNotCrash() {
        setInput("5\n0\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Multiples");
    }

    @Test
    public void testZeroAsFirstNumberDoesNotCrash() {
        setInput("0\n5\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Multiples");
    }

    @Test
    public void testBothZeroDoesNotCrash() {
        setInput("0\n0\n");
        MultipleCheck.main(new String[]{});

        assertResult(outContent.toString(), "Not multiples");
    }
}
