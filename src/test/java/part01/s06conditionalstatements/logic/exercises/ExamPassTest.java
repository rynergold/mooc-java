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
    public void testBothPassingNormal() {
        setInput("75\n80\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Passed"), "Both >= 50 should pass");
        assertFalse(output.contains("Failed"), "Passed exam must not print failed");
    }

    @Test
    public void testBothPassingExactBoundaries() {
        setInput("50\n50\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Passed"), "50 and 50 are inclusive pass marks");
        assertFalse(output.contains("Failed"), "Passed exam must not print failed");
    }

    @Test
    public void testTheoryFails() {
        setInput("45\n80\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Failed"), "Theory below 50 must fail");
        assertFalse(output.contains("Passed"), "Failed exam must not print passed");
    }

    @Test
    public void testPracticalFails() {
        setInput("75\n30\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Failed"), "Practical below 50 must fail");
        assertFalse(output.contains("Passed"), "Failed exam must not print passed");
    }

    @Test
    public void testBothFail() {
        setInput("40\n40\n");
        ExamPass.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Failed"), "Both below 50 must fail");
        assertFalse(output.contains("Passed"), "Failed exam must not print passed");
    }
}
