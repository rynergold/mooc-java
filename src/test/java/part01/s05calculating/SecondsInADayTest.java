package part01.s05calculating;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s05calculating.SecondsInADay
 */
class SecondsInADayTest {

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
    public void testOneDay() {
        setInput("1\n");
        SecondsInADay.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("How many days would you like to convert to seconds?"), "Missing prompt");
        assertTrue(output.contains("86400"), "1 day should be 86400 seconds");
    }

    @Test
    public void testThreeDays() {
        setInput("3\n");
        SecondsInADay.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("259200"), "3 days should be 259200 seconds");
    }

    @Test
    public void testSevenDays() {
        setInput("7\n");
        SecondsInADay.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("604800"), "7 days should be 604800 seconds");
    }
}
