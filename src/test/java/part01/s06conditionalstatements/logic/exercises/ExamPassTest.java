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
 * @see part01.s06conditionalstatements.logic.exercises.ExamPass
 */
class ExamPassTest {

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
    public void testPassedBothRequirementsMet() {
        setInput("75\n85\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Exam passed"), "Score 75 and 85% attendance meets requirements");
        assertFalse(output.contains("Exam failed"), "Passing student must not report failed");
    }

    @Test
    public void testPassedExactBoundaries() {
        setInput("60\n75\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Exam passed"), "Score 60 and 75% attendance are exact minimum thresholds");
        assertFalse(output.contains("Exam failed"), "Passing student must not report failed");
    }

    @Test
    public void testFailedLowScore() {
        setInput("59\n85\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Exam failed"), "Score 59 is below minimum 60");
        assertFalse(output.contains("Exam passed"), "Failing student must not report passed");
    }

    @Test
    public void testFailedLowAttendance() {
        setInput("80\n74\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Exam failed"), "Attendance 74% is below minimum 75%");
        assertFalse(output.contains("Exam passed"), "Failing student must not report passed");
    }

    @Test
    public void testFailedBothLow() {
        setInput("40\n50\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Exam failed"), "Failing both score and attendance must fail");
        assertFalse(output.contains("Exam passed"), "Failing student must not report passed");
    }
}
