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
 * @see part01.s06conditionalstatements.DateValidator
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
    public void testValidLeapDay() {
        setInput("29\n2\n2020\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid date"), "Feb 29, 2020 is valid in a leap year");
    }

    @Test
    public void testInvalidLeapDayCommonYear() {
        setInput("29\n2\n2021\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "Feb 29, 2021 is invalid in a common year");
    }

    @Test
    public void testInvalidAprilThirtyOne() {
        setInput("31\n4\n2022\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "April only has 30 days");
    }

    @Test
    public void testValidStandardDate() {
        setInput("15\n8\n1995\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid date"), "August 15, 1995 is a valid date");
    }

    @Test
    public void testInvalidMonth() {
        setInput("10\n13\n2022\n");
        DateValidator.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid date"), "Month 13 is invalid");
    }
}
