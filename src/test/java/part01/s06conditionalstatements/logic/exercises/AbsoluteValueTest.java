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
import static org.junit.jupiter.api.Assertions.assertFalse;
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

    private void assertSingleResult(String output, int expected) {
        assertTrue(output.contains("Give a number:"), "Must display the prompt 'Give a number:'");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Give a number"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one number, but found: " + lines);
        assertEquals(String.valueOf(expected), lines.get(0), "Expected absolute value of " + expected);
        if (expected > 0) {
            assertFalse(lines.get(0).startsWith("-"), "Absolute value cannot be negative");
        }
    }

    @Test
    public void testNegativeNumber() {
        setInput("-7\n");
        AbsoluteValue.main(new String[]{});

        assertSingleResult(outContent.toString(), 7);
    }

    @Test
    public void testPositiveNumber() {
        setInput("14\n");
        AbsoluteValue.main(new String[]{});

        assertSingleResult(outContent.toString(), 14);
    }

    @Test
    public void testZero() {
        setInput("0\n");
        AbsoluteValue.main(new String[]{});

        assertSingleResult(outContent.toString(), 0);
    }

    @Test
    public void testBoundaryNegativeOne() {
        setInput("-1\n");
        AbsoluteValue.main(new String[]{});

        assertSingleResult(outContent.toString(), 1);
    }

    @Test
    public void testBoundaryPositiveOne() {
        setInput("1\n");
        AbsoluteValue.main(new String[]{});

        assertSingleResult(outContent.toString(), 1);
    }

    @Test
    public void testLargeNegativeNumber() {
        setInput("-125\n");
        AbsoluteValue.main(new String[]{});

        assertSingleResult(outContent.toString(), 125);
    }

    @Test
    public void testLargePositiveNumber() {
        setInput("250\n");
        AbsoluteValue.main(new String[]{});

        assertSingleResult(outContent.toString(), 250);
    }
}
