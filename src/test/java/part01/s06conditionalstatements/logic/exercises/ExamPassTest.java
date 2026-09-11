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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter theory score:"), "Must display 'Enter theory score:' prompt");
        assertTrue(output.contains("Enter practical score:"), "Must display 'Enter practical score:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter theory") && !l.startsWith("Enter practical"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one status line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testPassedBothHigh() {
        setInput("75\n80\n");
        ExamPass.main(new String[]{});

        assertResult(outContent.toString(), "Passed");
    }

    @Test
    public void testPassedExactBoundaries() {
        setInput("50\n50\n");
        ExamPass.main(new String[]{});

        assertResult(outContent.toString(), "Passed");
    }

    @Test
    public void testFailedTheoryBelowFifty() {
        setInput("49\n80\n");
        ExamPass.main(new String[]{});

        assertResult(outContent.toString(), "Failed");
    }

    @Test
    public void testFailedPracticalBelowFifty() {
        setInput("75\n49\n");
        ExamPass.main(new String[]{});

        assertResult(outContent.toString(), "Failed");
    }

    @Test
    public void testFailedBothBelowFifty() {
        setInput("40\n40\n");
        ExamPass.main(new String[]{});

        assertResult(outContent.toString(), "Failed");
    }

    @Test
    public void testFailedZeroScores() {
        setInput("0\n0\n");
        ExamPass.main(new String[]{});

        assertResult(outContent.toString(), "Failed");
    }

    @Test
    public void testPassedPerfectScores() {
        setInput("100\n100\n");
        ExamPass.main(new String[]{});

        assertResult(outContent.toString(), "Passed");
    }
}
