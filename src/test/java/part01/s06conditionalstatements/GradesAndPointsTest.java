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
 * @see part01.s06conditionalstatements.GradesAndPoints
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

    @Test
    public void testFailedGrade() {
        setInput("37\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give points [0-100]:"), "Missing prompt 'Give points [0-100]:'");
        assertTrue(output.contains("Grade: failed"), "Expected 'Grade: failed' for points 37");
    }

    @Test
    public void testGradeThree() {
        setInput("76\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: 3"), "Expected 'Grade: 3' for points 76");
    }

    @Test
    public void testGradeFive() {
        setInput("95\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: 5"), "Expected 'Grade: 5' for points 95");
    }

    @Test
    public void testNegativePoints() {
        setInput("-3\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: impossible!"), "Expected 'Grade: impossible!' for negative points");
    }

    @Test
    public void testIncrediblePoints() {
        setInput("105\n");
        GradesAndPoints.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Grade: incredible!"), "Expected 'Grade: incredible!' for points > 100");
    }

    @Test
    public void testBoundaryZeroAndHundred() {
        setInput("0\n");
        GradesAndPoints.main(new String[]{});
        assertTrue(outContent.toString().contains("Grade: failed"), "0 points should be failed");

        outContent.reset();
        setInput("100\n");
        GradesAndPoints.main(new String[]{});
        assertTrue(outContent.toString().contains("Grade: 5"), "100 points should be grade 5");
    }
}
