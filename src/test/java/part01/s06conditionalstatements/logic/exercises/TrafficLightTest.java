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
 * @see part01.s06conditionalstatements.logic.exercises.TrafficLight
 */
class TrafficLightTest {

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
        assertTrue(output.contains("Enter traffic light color:"), "Must display 'Enter traffic light color:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter traffic light color"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one command line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected command: " + expectedMessage);
    }

    @Test
    public void testRed() {
        setInput("red\n");
        TrafficLight.main(new String[]{});

        assertResult(outContent.toString(), "Stop");
    }

    @Test
    public void testYellow() {
        setInput("yellow\n");
        TrafficLight.main(new String[]{});

        assertResult(outContent.toString(), "Slow down");
    }

    @Test
    public void testGreen() {
        setInput("green\n");
        TrafficLight.main(new String[]{});

        assertResult(outContent.toString(), "Go");
    }

    @Test
    public void testInvalidColor() {
        setInput("purple\n");
        TrafficLight.main(new String[]{});

        assertResult(outContent.toString(), "Invalid color");
    }

    @Test
    public void testCaseSensitivity() {
        setInput("Red\n");
        TrafficLight.main(new String[]{});

        assertResult(outContent.toString(), "Invalid color");
    }

    @Test
    public void testEmptyInput() {
        setInput("\n");
        TrafficLight.main(new String[]{});

        assertResult(outContent.toString(), "Invalid color");
    }
}
