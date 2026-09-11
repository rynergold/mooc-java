package part01.s06conditionalstatements.logic.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter 4-digit PIN:"), "Must display 'Enter 4-digit PIN:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter 4-digit PIN"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one status line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testValidPinNormal() {
        setInput("4567\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Access granted");
    }

    @Test
    public void testValidLowerBoundaryThousand() {
        setInput("1000\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Access granted");
    }

    @Test
    public void testValidUpperBoundaryNineNineNineNine() {
        setInput("9999\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Access granted");
    }

    @Test
    public void testValidInteriorLowBoundaryThousandOne() {
        setInput("1001\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Access granted");
    }

    @Test
    public void testInvalidImmediateBelowThousand() {
        setInput("999\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Invalid PIN");
    }

    @Test
    public void testInvalidImmediateAboveNineNineNineNine() {
        setInput("10000\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Invalid PIN");
    }

    @Test
    public void testInvalidNegativePin() {
        setInput("-500\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Invalid PIN");
    }

    @Test
    public void testInvalidZeroPin() {
        setInput("0\n");
        PasscodeEntry.main(new String[]{});

        assertResult(outContent.toString(), "Invalid PIN");
    }
}
