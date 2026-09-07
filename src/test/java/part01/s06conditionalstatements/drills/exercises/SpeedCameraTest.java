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
 * @see part01.s06conditionalstatements.drills.exercises.SpeedCamera
 */
class SpeedCameraTest {

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
    public void testLegalNormalSpeed() {
        setInput("65\n");
        SpeedCamera.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Speed normal"), "65 is within [40, 100]");
        assertFalse(output.contains("Speed violation"), "Legal speed must not report violation");
    }

    @Test
    public void testLegalBoundaries() {
        setInput("40\n");
        SpeedCamera.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Speed normal"), "40 is inclusive minimum");
        assertFalse(output.contains("Speed violation"), "Legal speed must not report violation");
    }

    @Test
    public void testViolationTooSlow() {
        setInput("35\n");
        SpeedCamera.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Speed violation"), "35 is below minimum 40");
        assertFalse(output.contains("Speed normal"), "Too slow is a violation");
    }

    @Test
    public void testViolationTooFast() {
        setInput("120\n");
        SpeedCamera.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Speed violation"), "120 exceeds maximum 100");
        assertFalse(output.contains("Speed normal"), "Too fast is a violation");
    }
}
