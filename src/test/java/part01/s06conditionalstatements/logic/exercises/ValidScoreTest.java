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
 * @see part01.s06conditionalstatements.logic.exercises.ValidScore
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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter score:"), "Program must display the prompt 'Enter score:'");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter score"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one result line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testValidNormalScore() {
        setInput("75\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Valid score");
    }

    @Test
    public void testValidLowerBoundaryZero() {
        setInput("0\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Valid score");
    }

    @Test
    public void testValidBoundaryOne() {
        setInput("1\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Valid score");
    }

    @Test
    public void testValidBoundaryNinetyNine() {
        setInput("99\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Valid score");
    }

    @Test
    public void testValidUpperBoundaryHundred() {
        setInput("100\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Valid score");
    }

    @Test
    public void testInvalidImmediateNegativeOne() {
        setInput("-1\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Invalid score");
    }

    @Test
    public void testInvalidNegativeFive() {
        setInput("-5\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Invalid score");
    }

    @Test
    public void testInvalidLargeNegative() {
        setInput("-100\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Invalid score");
    }

    @Test
    public void testInvalidImmediateOverHundred() {
        setInput("101\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Invalid score");
    }

    @Test
    public void testInvalidLargeScore() {
        setInput("500\n");
        ValidScore.main(new String[]{});

        assertResult(outContent.toString(), "Invalid score");
    }
}
