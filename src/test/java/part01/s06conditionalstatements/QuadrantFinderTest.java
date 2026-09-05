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
 * @see part01.s06conditionalstatements.QuadrantFinder
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
        assertTrue(output.contains("Quadrant 1"), "Positive x and y should be Quadrant 1");
    }

    @Test
    public void testQuadrantTwo() {
        setInput("-4\n2\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Quadrant 2"), "Negative x and positive y should be Quadrant 2");
    }

    @Test
    public void testQuadrantThree() {
        setInput("-2\n-8\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Quadrant 3"), "Negative x and negative y should be Quadrant 3");
    }

    @Test
    public void testQuadrantFour() {
        setInput("6\n-1\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Quadrant 4"), "Positive x and negative y should be Quadrant 4");
    }

    @Test
    public void testOrigin() {
        setInput("0\n0\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Origin"), "(0, 0) should be Origin");
    }

    @Test
    public void testAxis() {
        setInput("0\n-7\n");
        QuadrantFinder.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Axis"), "(0, -7) should be on an Axis");
    }
}
