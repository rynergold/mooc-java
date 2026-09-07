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
 * @see part01.s06conditionalstatements.drills.exercises.ValidScore
 */
class ValidScoreTest {

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
    public void testValidNormalScore() {
        setInput("75\n");
        ValidScore.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid score"), "75 is within 0 to 100");
        assertFalse(output.contains("Invalid score"), "Valid score must not print 'Invalid score'");
    }

    @Test
    public void testValidLowerBoundaryZero() {
        setInput("0\n");
        ValidScore.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid score"), "0 is inclusive boundary");
        assertFalse(output.contains("Invalid score"), "Valid score must not print 'Invalid score'");
    }

    @Test
    public void testValidUpperBoundaryHundred() {
        setInput("100\n");
        ValidScore.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid score"), "100 is inclusive boundary");
        assertFalse(output.contains("Invalid score"), "Valid score must not print 'Invalid score'");
    }

    @Test
    public void testInvalidNegative() {
        setInput("-5\n");
        ValidScore.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid score"), "-5 is below zero");
        assertFalse(output.contains("Valid score"), "Invalid score must not print 'Valid score'");
    }

    @Test
    public void testInvalidOverHundred() {
        setInput("101\n");
        ValidScore.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid score"), "101 is above 100");
        assertFalse(output.contains("Valid score"), "Invalid score must not print 'Valid score'");
    }
}
