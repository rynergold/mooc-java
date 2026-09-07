package part01.s06conditionalstatements.drills.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.drills.exercises.ClockWrap12
 */
class ClockWrap12Test {

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
    public void testMidnight() {
        setInput("0\n");
        ClockWrap12.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("12 AM"), "hour 0 should be 12 AM");
    }

    @Test
    public void testMorning() {
        setInput("9\n");
        ClockWrap12.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("9 AM"), "hour 9 should be 9 AM");
    }

    @Test
    public void testNoon() {
        setInput("12\n");
        ClockWrap12.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("12 PM"), "hour 12 should be 12 PM");
    }

    @Test
    public void testAfternoon() {
        setInput("17\n");
        ClockWrap12.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("5 PM"), "hour 17 should be 5 PM");
    }
}
