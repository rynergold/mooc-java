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
 * @see part01.s06conditionalstatements.drills.exercises.WorkingHours
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

    @Test
    public void testOpenMidday() {
        setInput("14\n");
        WorkingHours.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Office open"), "14:00 is within working hours");
        assertFalse(output.contains("Office closed"), "Must not report closed during open hours");
    }

    @Test
    public void testOpenBoundaries() {
        setInput("9\n");
        WorkingHours.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Office open"), "9:00 is inclusive opening time");
        assertFalse(output.contains("Office closed"), "Must not report closed at 9:00");
    }

    @Test
    public void testClosedBeforeNine() {
        setInput("8\n");
        WorkingHours.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Office closed"), "8:00 is before opening");
        assertFalse(output.contains("Office open"), "Must not report open before 9:00");
    }

    @Test
    public void testClosedAfterSeventeen() {
        setInput("18\n");
        WorkingHours.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Office closed"), "18:00 is after closing");
        assertFalse(output.contains("Office open"), "Must not report open after 17:00");
    }
}
