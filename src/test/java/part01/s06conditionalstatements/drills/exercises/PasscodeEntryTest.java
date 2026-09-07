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
 * @see part01.s06conditionalstatements.drills.exercises.PasscodeEntry
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
        setInput("1234\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Access granted"), "1234 should be granted access");
        assertFalse(output.contains("Invalid PIN"), "Valid PIN must not print 'Invalid PIN'");
    }

    @Test
    public void testValidPinBoundaries() {
        setInput("1000\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Access granted"), "1000 is inclusive lower bound");
        assertFalse(output.contains("Invalid PIN"), "Valid PIN must not print 'Invalid PIN'");
    }

    @Test
    public void testInvalidPinTooShort() {
        setInput("999\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid PIN"), "999 is too short to be 4-digit");
        assertFalse(output.contains("Access granted"), "Invalid PIN must not grant access");
    }

    @Test
    public void testInvalidPinTooLong() {
        setInput("10000\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid PIN"), "10000 is too long to be 4-digit");
        assertFalse(output.contains("Access granted"), "Invalid PIN must not grant access");
    }

    @Test
    public void testInvalidPinNegative() {
        setInput("-500\n");
        PasscodeEntry.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid PIN"), "Negative numbers cannot be valid 4-digit PINs");
        assertFalse(output.contains("Access granted"), "Invalid PIN must not grant access");
    }
}
