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
 * @see part01.s06conditionalstatements.logic.exercises.PasscodeEntry
 */
class PasscodeEntryTest {

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
    public void testValidPinNormal() {
        setInput("4567\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Access granted"), "4567 is a valid 4-digit PIN");
        assertFalse(output.contains("Access denied"), "Valid PIN must not report Access denied");
    }

    @Test
    public void testValidPinBoundaries() {
        setInput("1000\n");
        PasscodeEntry.main(new String[]{});
        String out1 = outContent.toString();
        assertTrue(out1.contains("Access granted"), "1000 is lowest 4-digit PIN");
        assertFalse(out1.contains("Access denied"), "1000 must not report Access denied");

        outContent.reset();
        setInput("9999\n");
        PasscodeEntry.main(new String[]{});
        String out2 = outContent.toString();
        assertTrue(out2.contains("Access granted"), "9999 is highest 4-digit PIN");
        assertFalse(out2.contains("Access denied"), "9999 must not report Access denied");
    }

    @Test
    public void testInvalidPinTooShort() {
        setInput("999\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Access denied"), "999 has fewer than 4 digits");
        assertFalse(output.contains("Access granted"), "Invalid PIN must not report Access granted");
    }

    @Test
    public void testInvalidPinTooLong() {
        setInput("10000\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Access denied"), "10000 has more than 4 digits");
        assertFalse(output.contains("Access granted"), "Invalid PIN must not report Access granted");
    }

    @Test
    public void testInvalidPinNegative() {
        setInput("-1000\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Access denied"), "Negative number is not a valid PIN");
        assertFalse(output.contains("Access granted"), "Negative PIN must not report Access granted");
    }
}
