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
 * @see part01.s06conditionalstatements.logic.exercises.DateValidator
 */
class DateValidatorTest {

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
    public void testValidStandardDate() {
        setInput("15\n5\n2023\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid date"), "May 15, 2023 should be valid");
        assertFalse(output.contains("Invalid date"), "Valid date must not report 'Invalid date'");
    }

    @Test
    public void testValidLeapDay() {
        setInput("29\n2\n2024\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid date"), "Feb 29 on leap year 2024 is valid");
        assertFalse(output.contains("Invalid date"), "Valid leap day must not report 'Invalid date'");
    }

    @Test
    public void testInvalidLeapDayCommonYear() {
        setInput("29\n2\n2023\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "Feb 29 on common year 2023 is invalid");
        assertFalse(output.replace("Invalid date", "").contains("Valid date"), "Invalid date must not also print 'Valid date'");
    }

    @Test
    public void testInvalidAprilThirtyOne() {
        setInput("31\n4\n2023\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "April has only 30 days");
        assertFalse(output.replace("Invalid date", "").contains("Valid date"), "Invalid date must not also print 'Valid date'");
    }

    @Test
    public void testInvalidMonth() {
        setInput("1\n13\n2023\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "Month 13 is invalid");
        assertFalse(output.replace("Invalid date", "").contains("Valid date"), "Invalid date must not also print 'Valid date'");
    }

    @Test
    public void testValidCenturyLeapDay() {
        setInput("29\n2\n2000\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid date"), "Year 2000 is divisible by 400, so Feb 29 is valid");
        assertFalse(output.contains("Invalid date"), "Valid date must not report 'Invalid date'");
    }

    @Test
    public void testInvalidCenturyCommonDay() {
        setInput("29\n2\n1900\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "Year 1900 is divisible by 100 but not 400, so Feb 29 is invalid");
        assertFalse(output.replace("Invalid date", "").contains("Valid date"), "Invalid date must not also print 'Valid date'");
    }

    @Test
    public void testInvalidDayZero() {
        setInput("0\n5\n2023\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "Day 0 is invalid");
        assertFalse(output.replace("Invalid date", "").contains("Valid date"), "Invalid date must not also print 'Valid date'");
    }

    @Test
    public void testInvalidYearZero() {
        setInput("15\n5\n0\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "Year 0 is invalid (years must be strictly positive)");
        assertFalse(output.replace("Invalid date", "").contains("Valid date"), "Invalid date must not also print 'Valid date'");
    }

    @Test
    public void testValidDecemberThirtyOne() {
        setInput("31\n12\n2023\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid date"), "December 31 is valid");
        assertFalse(output.contains("Invalid date"), "Valid date must not report 'Invalid date'");
    }
}
