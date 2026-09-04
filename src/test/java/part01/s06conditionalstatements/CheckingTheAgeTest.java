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
 * @see part01.s06conditionalstatements.CheckingTheAge
 */
class CheckingTheAgeTest {

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
    public void testValidAgeNormal() {
        setInput("10\n");
        CheckingTheAge.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("How old are you?"), "Missing prompt 'How old are you?'");
        assertTrue(output.contains("OK"), "Expected 'OK' for age 10");
    }

    @Test
    public void testValidAgeFiftyFive() {
        setInput("55\n");
        CheckingTheAge.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("OK"), "Expected 'OK' for age 55");
    }

    @Test
    public void testBoundaryZeroAndOneHundredTwenty() {
        setInput("0\n");
        CheckingTheAge.main(new String[]{});
        assertTrue(outContent.toString().contains("OK"), "Age 0 should be OK");

        outContent.reset();
        setInput("120\n");
        CheckingTheAge.main(new String[]{});
        assertTrue(outContent.toString().contains("OK"), "Age 120 should be OK");
    }

    @Test
    public void testNegativeAge() {
        setInput("-3\n");
        CheckingTheAge.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Impossible!"), "Expected 'Impossible!' for age -3");
    }

    @Test
    public void testTooHighAge() {
        setInput("150\n");
        CheckingTheAge.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Impossible!"), "Expected 'Impossible!' for age 150");
    }
}
