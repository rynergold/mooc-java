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
 * @see part01.s06conditionalstatements.logic.exercises.MiddleOfThree
 */
class MiddleOfThreeTest {

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

    private void assertResult(String output, int expectedMiddle) {
        assertTrue(output.contains("Enter first number:"), "Must display 'Enter first number:' prompt");
        assertTrue(output.contains("Enter second number:"), "Must display 'Enter second number:' prompt");
        assertTrue(output.contains("Enter third number:"), "Must display 'Enter third number:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter first") && !l.startsWith("Enter second") && !l.startsWith("Enter third"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one result line, but found: " + lines);
        assertEquals("The middle number is: " + expectedMiddle, lines.get(0), "Expected output with middle number " + expectedMiddle);
    }

    @Test
    public void testMiddleValueFirst() {
        setInput("10\n5\n20\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), 10);
    }

    @Test
    public void testMiddleValueSecond() {
        setInput("3\n7\n15\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), 7);
    }

    @Test
    public void testMiddleValueThird() {
        setInput("20\n5\n12\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), 12);
    }

    @Test
    public void testWithDuplicatesFirstAndSecond() {
        setInput("5\n5\n2\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), 5);
    }

    @Test
    public void testWithDuplicatesSecondAndThird() {
        setInput("2\n5\n5\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), 5);
    }

    @Test
    public void testWithDuplicatesFirstAndThird() {
        setInput("5\n2\n5\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), 5);
    }

    @Test
    public void testAllIdentical() {
        setInput("4\n4\n4\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), 4);
    }

    @Test
    public void testNegativeNumbers() {
        setInput("-10\n-5\n-20\n");
        MiddleOfThree.main(new String[]{});

        assertResult(outContent.toString(), -10);
    }
}
