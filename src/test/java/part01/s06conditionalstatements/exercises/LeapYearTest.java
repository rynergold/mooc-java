package part01.s06conditionalstatements.exercises;

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
 * @see part01.s06conditionalstatements.exercises.LeapYear
 */
class LeapYearTest {

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
    public void testNonLeapYear() {
        setInput("2011\n");
        LeapYear.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a year:"), "Missing prompt 'Give a year:'");
        assertTrue(output.contains("The year is not a leap year."), "Expected 2011 to not be a leap year");
        assertFalse(output.replace("The year is not a leap year.", "").contains("The year is a leap year."), "Must not also print leap year for 2011");
    }

    @Test
    public void testStandardLeapYear() {
        setInput("2012\n");
        LeapYear.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The year is a leap year."), "Expected 2012 to be a leap year");
        assertFalse(output.contains("The year is not a leap year."), "Must not print not a leap year for 2012");
    }

    @Test
    public void testCenturyNotDivisibleBy400() {
        setInput("1800\n");
        LeapYear.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The year is not a leap year."), "Expected 1800 to not be a leap year");
        assertFalse(output.replace("The year is not a leap year.", "").contains("The year is a leap year."), "Must not also print leap year for 1800");
    }

    @Test
    public void testCenturyDivisibleBy400() {
        setInput("2000\n");
        LeapYear.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The year is a leap year."), "Expected 2000 to be a leap year");
        assertFalse(output.contains("The year is not a leap year."), "Must not print not a leap year for 2000");
    }
}
