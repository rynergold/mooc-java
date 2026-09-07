package part01.s06conditionalstatements.drills.exercises;

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
 * @see part01.s06conditionalstatements.drills.exercises.ValidTriangle
 */
class ValidTriangleTest {

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
    public void testValidScaleneTriangle() {
        setInput("3\n4\n5\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid triangle"), "3, 4, 5 should be a valid triangle");
        assertFalse(output.contains("Invalid triangle"), "Valid triangle must not also print 'Invalid triangle'");
    }

    @Test
    public void testValidEquilateralTriangle() {
        setInput("5\n5\n5\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid triangle"), "5, 5, 5 should be a valid triangle");
        assertFalse(output.contains("Invalid triangle"), "Valid triangle must not also print 'Invalid triangle'");
    }

    @Test
    public void testInvalidSideThreeTooLong() {
        setInput("1\n2\n5\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "1, 2, 5 cannot form a triangle (1 + 2 <= 5)");
        assertFalse(output.contains("Valid triangle"), "Invalid triangle must not print 'Valid triangle'");
    }

    @Test
    public void testInvalidSideOneTooLong() {
        setInput("10\n3\n4\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "10, 3, 4 cannot form a triangle (3 + 4 <= 10)");
        assertFalse(output.contains("Valid triangle"), "Invalid triangle must not print 'Valid triangle'");
    }

    @Test
    public void testInvalidSideTwoTooLong() {
        setInput("3\n10\n4\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "3, 10, 4 cannot form a triangle (3 + 4 <= 10)");
        assertFalse(output.contains("Valid triangle"), "Invalid triangle must not print 'Valid triangle'");
    }

    @Test
    public void testDegenerateFlatLineEqualsSum() {
        setInput("2\n3\n5\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "2, 3, 5 forms a flat line (2 + 3 == 5), which is strictly invalid");
        assertFalse(output.contains("Valid triangle"), "Degenerate triangle must not print 'Valid triangle'");
    }

    @Test
    public void testZeroOrNegativeSides() {
        setInput("0\n4\n4\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "Sides must be strictly positive");
        assertFalse(output.contains("Valid triangle"), "Zero side must not print 'Valid triangle'");
    }

    @Test
    public void testNegativeSide() {
        setInput("-2\n4\n4\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "Negative side must be invalid");
        assertFalse(output.contains("Valid triangle"), "Negative side must not print 'Valid triangle'");
    }

    @Test
    public void testOutputPrintedExactlyOnce() {
        setInput("0\n4\n4\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        int count = output.split("Invalid triangle", -1).length - 1;
        assertTrue(count == 1, "Should print 'Invalid triangle' exactly once, but printed " + count + " times. Check if you have duplicate prints or side-effects in helper methods.");
    }
}
