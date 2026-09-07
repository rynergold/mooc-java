package part01.s06conditionalstatements.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.exercises.GradesAndPoints
 */
class GradesAndPointsTest {

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

    private void assertSingleGradeOutput(String output) {
        int count = output.split("Grade:", -1).length - 1;
        assertEquals(1, count, "Should print 'Grade:' exactly once, but found " + count);
    }

    @Test
    public void testFailedGrade() {
        setInput("37\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give points [0-100]:"), "Missing prompt 'Give points [0-100]:'");
        assertTrue(output.contains("Grade: failed"), "Expected 'Grade: failed' for points 37");
        assertFalse(output.contains("Grade: impossible!"), "Must not print impossible for 37");
        assertFalse(output.contains("Grade: 1"), "Must not print 1 for 37");
        assertSingleGradeOutput(output);
    }

    @Test
    public void testGradeThree() {
        setInput("76\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: 3"), "Expected 'Grade: 3' for points 76");
        assertFalse(output.contains("Grade: failed"), "Must not print failed for 76");
        assertFalse(output.contains("Grade: 4"), "Must not print 4 for 76");
        assertSingleGradeOutput(output);
    }

    @Test
    public void testGradeFive() {
        setInput("95\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: 5"), "Expected 'Grade: 5' for points 95");
        assertFalse(output.contains("Grade: failed"), "Must not print failed for 95");
        assertFalse(output.contains("Grade: incredible!"), "Must not print incredible for 95");
        assertSingleGradeOutput(output);
    }

    @Test
    public void testNegativePoints() {
        setInput("-3\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: impossible!"), "Expected 'Grade: impossible!' for negative points");
        assertFalse(output.contains("Grade: failed"), "Must not print failed for negative points");
        assertSingleGradeOutput(output);
    }

    @Test
    public void testIncrediblePoints() {
        setInput("105\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: incredible!"), "Expected 'Grade: incredible!' for points > 100");
        assertFalse(output.contains("Grade: 5"), "Must not print grade 5 for points > 100");
        assertSingleGradeOutput(output);
    }

    @Test
    public void testBoundaryZeroAndHundred() {
        setInput("0\n");
        GradesAndPoints.main(new String[]{});
        String output0 = outContent.toString();
        assertTrue(output0.contains("Grade: failed"), "0 points should be failed");
        assertSingleGradeOutput(output0);

        outContent.reset();
        setInput("100\n");
        GradesAndPoints.main(new String[]{});
        String output100 = outContent.toString();
        assertTrue(output100.contains("Grade: 5"), "100 points should be grade 5");
        assertSingleGradeOutput(output100);
    }
}
