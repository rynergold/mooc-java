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
 * @see part01.s06conditionalstatements.logic.exercises.WorkingHours
 */
class WorkingHoursTest {

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
        assertTrue(output.contains("Enter hour (0-23):"), "Must display 'Enter hour (0-23):' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter hour"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one status line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testOpenMidday() {
        setInput("14\n");
        WorkingHours.main(new String[]{});

        assertResult(outContent.toString(), "Office open");
    }

    @Test
    public void testOpenLowerBoundaryNine() {
        setInput("9\n");
        WorkingHours.main(new String[]{});

        assertResult(outContent.toString(), "Office open");
    }

    @Test
    public void testOpenUpperBoundarySeventeen() {
        setInput("17\n");
        WorkingHours.main(new String[]{});

        assertResult(outContent.toString(), "Office open");
    }

    @Test
    public void testClosedImmediateBeforeNine() {
        setInput("8\n");
        WorkingHours.main(new String[]{});

        assertResult(outContent.toString(), "Office closed");
    }

    @Test
    public void testClosedImmediateAfterSeventeen() {
        setInput("18\n");
        WorkingHours.main(new String[]{});

        assertResult(outContent.toString(), "Office closed");
    }

    @Test
    public void testClosedMidnightZero() {
        setInput("0\n");
        WorkingHours.main(new String[]{});

        assertResult(outContent.toString(), "Office closed");
    }

    @Test
    public void testClosedLateNightTwentyThree() {
        setInput("23\n");
        WorkingHours.main(new String[]{});

        assertResult(outContent.toString(), "Office closed");
    }
}
