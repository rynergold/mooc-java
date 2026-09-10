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
 * @see part01.s06conditionalstatements.logic.exercises.RangeOverlap
 */
class RangeOverlapTest {

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
        assertTrue(output.contains("Enter start 1:"), "Must display 'Enter start 1:' prompt");
        assertTrue(output.contains("Enter end 1:"), "Must display 'Enter end 1:' prompt");
        assertTrue(output.contains("Enter start 2:"), "Must display 'Enter start 2:' prompt");
        assertTrue(output.contains("Enter end 2:"), "Must display 'Enter end 2:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter start") && !l.startsWith("Enter end"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one result line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testOverlappingInteriorRangeOneFirst() {
        setInput("1\n5\n3\n8\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testOverlappingInteriorRangeTwoFirst() {
        setInput("3\n8\n1\n5\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testDisjointRangeOneLeft() {
        setInput("1\n4\n6\n10\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Disjoint");
    }

    @Test
    public void testDisjointRangeTwoLeft() {
        setInput("6\n10\n1\n4\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Disjoint");
    }

    @Test
    public void testOverlappingEndpointRight() {
        setInput("1\n5\n5\n10\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testOverlappingEndpointLeft() {
        setInput("5\n10\n1\n5\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testRangeTwoContainedWithinRangeOne() {
        setInput("2\n8\n4\n6\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testRangeOneContainedWithinRangeTwo() {
        setInput("4\n6\n2\n8\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testSinglePointOverlap() {
        setInput("5\n5\n5\n5\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testNegativeNumbersOverlap() {
        setInput("-10\n-2\n-3\n4\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Overlapping");
    }

    @Test
    public void testNegativeNumbersDisjoint() {
        setInput("-10\n-5\n-4\n-1\n");
        RangeOverlap.main(new String[]{});

        assertResult(outContent.toString(), "Disjoint");
    }
}
