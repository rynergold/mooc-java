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
 * @see part01.s06conditionalstatements.logic.exercises.TriangleType
 */
class TriangleTypeTest {

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
        assertTrue(output.contains("Enter side 1:"), "Must display 'Enter side 1:' prompt");
        assertTrue(output.contains("Enter side 2:"), "Must display 'Enter side 2:' prompt");
        assertTrue(output.contains("Enter side 3:"), "Must display 'Enter side 3:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter side"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one result line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected classification: " + expectedMessage);
    }

    @Test
    public void testEquilateral() {
        setInput("5\n5\n5\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Equilateral");
    }

    @Test
    public void testIsoscelesSidesOneAndTwoEqual() {
        setInput("5\n5\n8\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Isosceles");
    }

    @Test
    public void testIsoscelesSidesOneAndThreeEqual() {
        setInput("5\n8\n5\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Isosceles");
    }

    @Test
    public void testIsoscelesSidesTwoAndThreeEqual() {
        setInput("8\n5\n5\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Isosceles");
    }

    @Test
    public void testScalene() {
        setInput("3\n4\n5\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Scalene");
    }

    @Test
    public void testNotATriangleTooLong() {
        setInput("1\n2\n10\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Not a triangle");
    }

    @Test
    public void testNotATriangleDegenerateFlatLine() {
        setInput("2\n3\n5\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Not a triangle");
    }

    @Test
    public void testNotATriangleZeroSide() {
        setInput("0\n5\n5\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Not a triangle");
    }

    @Test
    public void testNotATriangleNegativeSide() {
        setInput("-2\n4\n4\n");
        TriangleType.main(new String[]{});

        assertResult(outContent.toString(), "Not a triangle");
    }
}
