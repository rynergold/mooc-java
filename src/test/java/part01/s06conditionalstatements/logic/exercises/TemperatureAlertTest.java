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
 * @see part01.s06conditionalstatements.logic.exercises.TemperatureAlert
 */
class TemperatureAlertTest {

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
        assertTrue(output.contains("Enter temperature:"), "Program must display the prompt 'Enter temperature:'");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter temperature"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one status line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testTemperatureNormalMidRange() {
        setInput("5\n");
        TemperatureAlert.main(new String[]{});

        assertResult(outContent.toString(), "Temperature normal");
    }

    @Test
    public void testTemperatureNormalLowerBoundaryTwo() {
        setInput("2\n");
        TemperatureAlert.main(new String[]{});

        assertResult(outContent.toString(), "Temperature normal");
    }

    @Test
    public void testTemperatureNormalUpperBoundaryEight() {
        setInput("8\n");
        TemperatureAlert.main(new String[]{});

        assertResult(outContent.toString(), "Temperature normal");
    }

    @Test
    public void testTemperatureAlarmImmediateTooCold() {
        setInput("1\n");
        TemperatureAlert.main(new String[]{});

        assertResult(outContent.toString(), "Temperature alarm!");
    }

    @Test
    public void testTemperatureAlarmImmediateTooWarm() {
        setInput("9\n");
        TemperatureAlert.main(new String[]{});

        assertResult(outContent.toString(), "Temperature alarm!");
    }

    @Test
    public void testTemperatureAlarmSubZero() {
        setInput("-3\n");
        TemperatureAlert.main(new String[]{});

        assertResult(outContent.toString(), "Temperature alarm!");
    }

    @Test
    public void testTemperatureAlarmExtremeHigh() {
        setInput("45\n");
        TemperatureAlert.main(new String[]{});

        assertResult(outContent.toString(), "Temperature alarm!");
    }
}
