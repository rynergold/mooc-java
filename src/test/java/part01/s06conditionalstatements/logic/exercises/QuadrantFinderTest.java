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
 * @see part01.s06conditionalstatements.logic.exercises.QuadrantFinder
 */
class QuadrantFinderTest {

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
        assertTrue(output.contains("Enter x:"), "Must display 'Enter x:' prompt");
        assertTrue(output.contains("Enter y:"), "Must display 'Enter y:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter x") && !l.startsWith("Enter y"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one location line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected location: " + expectedMessage);
    }

    @Test
    public void testQuadrantOne() {
        setInput("3\n5\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Quadrant 1");
    }

    @Test
    public void testQuadrantTwo() {
        setInput("-4\n2\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Quadrant 2");
    }

    @Test
    public void testQuadrantThree() {
        setInput("-3\n-7\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Quadrant 3");
    }

    @Test
    public void testQuadrantFour() {
        setInput("4\n-1\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Quadrant 4");
    }

    @Test
    public void testOrigin() {
        setInput("0\n0\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Origin");
    }

    @Test
    public void testPositiveYAxis() {
        setInput("0\n5\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Axis");
    }

    @Test
    public void testNegativeYAxis() {
        setInput("0\n-7\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Axis");
    }

    @Test
    public void testPositiveXAxis() {
        setInput("8\n0\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Axis");
    }

    @Test
    public void testNegativeXAxis() {
        setInput("-9\n0\n");
        QuadrantFinder.main(new String[]{});

        assertResult(outContent.toString(), "Axis");
    }
}
