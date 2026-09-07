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

    @Test
    public void testTemperatureNormalMidRange() {
        setInput("5\n");
        TemperatureAlert.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Temperature normal"), "5 is between 2 and 8");
        assertFalse(output.contains("Temperature alarm!"), "Normal temperature must not alarm");
    }

    @Test
    public void testTemperatureNormalBoundaries() {
        setInput("2\n");
        TemperatureAlert.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Temperature normal"), "2 is inclusive safe boundary");
        assertFalse(output.contains("Temperature alarm!"), "Normal temperature must not alarm");
    }

    @Test
    public void testTemperatureAlarmTooCold() {
        setInput("1\n");
        TemperatureAlert.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Temperature alarm!"), "1 is too cold");
        assertFalse(output.contains("Temperature normal"), "Alarm must not report normal");
    }

    @Test
    public void testTemperatureAlarmTooWarm() {
        setInput("9\n");
        TemperatureAlert.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Temperature alarm!"), "9 is too warm");
        assertFalse(output.contains("Temperature normal"), "Alarm must not report normal");
    }
}
