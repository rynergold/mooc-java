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
 * @see part01.s06conditionalstatements.TimeDifference
 */
class TimeDifferenceTest {

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
    public void testSameDayDuration() {
        setInput("9\n30\n11\n45\n");
        TimeDifference.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Duration: 2 hours and 15 minutes"), "9:30 to 11:45 should be 2 hours and 15 minutes");
    }

    @Test
    public void testOvernightDuration() {
        setInput("22\n50\n1\n20\n");
        TimeDifference.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Duration: 2 hours and 30 minutes"), "22:50 to 01:20 should be 2 hours and 30 minutes");
    }

    @Test
    public void testZeroDuration() {
        setInput("14\n15\n14\n15\n");
        TimeDifference.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Duration: 0 hours and 0 minutes"), "Identical times should be 0 hours and 0 minutes");
    }
}
