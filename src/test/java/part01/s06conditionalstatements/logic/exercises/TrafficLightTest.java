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

    @Test
    public void testRed() {
        setInput("red\n");
        TrafficLight.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Stop"), "red light must print Stop");
        assertFalse(output.contains("Slow down"), "red light must not print Slow down");
        assertFalse(output.contains("Go"), "red light must not print Go");
        assertFalse(output.contains("Invalid color"), "red light must not print Invalid color");
    }

    @Test
    public void testYellow() {
        setInput("yellow\n");
        TrafficLight.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Slow down"), "yellow light must print Slow down");
        assertFalse(output.contains("Stop"), "yellow light must not print Stop");
        assertFalse(output.contains("Go"), "yellow light must not print Go");
        assertFalse(output.contains("Invalid color"), "yellow light must not print Invalid color");
    }

    @Test
    public void testGreen() {
        setInput("green\n");
        TrafficLight.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Go"), "green light must print Go");
        assertFalse(output.contains("Stop"), "green light must not print Stop");
        assertFalse(output.contains("Slow down"), "green light must not print Slow down");
        assertFalse(output.contains("Invalid color"), "green light must not print Invalid color");
    }

    @Test
    public void testInvalidColor() {
        setInput("purple\n");
        TrafficLight.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid color"), "unrecognized color must print Invalid color");
        assertFalse(output.contains("Stop"), "invalid color must not print Stop");
        assertFalse(output.contains("Slow down"), "invalid color must not print Slow down");
        assertFalse(output.contains("Go"), "invalid color must not print Go");
    }
}
