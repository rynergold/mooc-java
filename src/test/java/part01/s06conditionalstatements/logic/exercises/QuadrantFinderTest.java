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

    @Test
    public void testQuadrantOne() {
        setInput("3\n5\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Quadrant 1"), "(3, 5) is in Quadrant 1");
        assertFalse(output.contains("Quadrant 2"), "Quadrant 1 must not print Quadrant 2");
        assertFalse(output.contains("Quadrant 3"), "Quadrant 1 must not print Quadrant 3");
        assertFalse(output.contains("Quadrant 4"), "Quadrant 1 must not print Quadrant 4");
        assertFalse(output.contains("Origin"), "Quadrant 1 must not print Origin");
        assertFalse(output.contains("Axis"), "Quadrant 1 must not print Axis");
    }

    @Test
    public void testQuadrantTwo() {
        setInput("-2\n4\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Quadrant 2"), "(-2, 4) is in Quadrant 2");
        assertFalse(output.contains("Quadrant 1"), "Quadrant 2 must not print Quadrant 1");
        assertFalse(output.contains("Quadrant 3"), "Quadrant 2 must not print Quadrant 3");
        assertFalse(output.contains("Quadrant 4"), "Quadrant 2 must not print Quadrant 4");
    }

    @Test
    public void testQuadrantThree() {
        setInput("-3\n-7\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Quadrant 3"), "(-3, -7) is in Quadrant 3");
        assertFalse(output.contains("Quadrant 1"), "Quadrant 3 must not print Quadrant 1");
        assertFalse(output.contains("Quadrant 2"), "Quadrant 3 must not print Quadrant 2");
        assertFalse(output.contains("Quadrant 4"), "Quadrant 3 must not print Quadrant 4");
    }

    @Test
    public void testQuadrantFour() {
        setInput("4\n-1\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Quadrant 4"), "(4, -1) is in Quadrant 4");
        assertFalse(output.contains("Quadrant 1"), "Quadrant 4 must not print Quadrant 1");
        assertFalse(output.contains("Quadrant 2"), "Quadrant 4 must not print Quadrant 2");
        assertFalse(output.contains("Quadrant 3"), "Quadrant 4 must not print Quadrant 3");
    }

    @Test
    public void testOrigin() {
        setInput("0\n0\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Origin"), "(0, 0) is the Origin");
        assertFalse(output.contains("Quadrant"), "Origin must not print Quadrant");
    }

    @Test
    public void testAxis() {
        setInput("0\n5\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Axis"), "(0, 5) lies on an Axis");
        assertFalse(output.contains("Quadrant"), "Axis point must not print Quadrant");
        assertFalse(output.contains("Origin"), "Axis point must not print Origin");
    }
}
