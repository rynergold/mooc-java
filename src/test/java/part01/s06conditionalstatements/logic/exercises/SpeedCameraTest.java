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
 * @see part01.s06conditionalstatements.logic.exercises.SpeedCamera
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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter vehicle speed:"), "Must display 'Enter vehicle speed:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter vehicle speed"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one status line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testLegalMidRangeSpeed() {
        setInput("65\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed normal");
    }

    @Test
    public void testLegalLowerBoundaryForty() {
        setInput("40\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed normal");
    }

    @Test
    public void testLegalUpperBoundaryHundred() {
        setInput("100\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed normal");
    }

    @Test
    public void testLegalInteriorLowBoundaryFortyOne() {
        setInput("41\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed normal");
    }

    @Test
    public void testLegalInteriorHighBoundaryNinetyNine() {
        setInput("99\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed normal");
    }

    @Test
    public void testViolationImmediateBelowForty() {
        setInput("39\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed violation");
    }

    @Test
    public void testViolationImmediateAboveHundred() {
        setInput("101\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed violation");
    }

    @Test
    public void testViolationFarBelowForty() {
        setInput("15\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed violation");
    }

    @Test
    public void testViolationFarAboveHundred() {
        setInput("160\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed violation");
    }

    @Test
    public void testViolationZeroSpeed() {
        setInput("0\n");
        SpeedCamera.main(new String[]{});

        assertResult(outContent.toString(), "Speed violation");
    }
}
