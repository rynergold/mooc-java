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
 * @see part01.s06conditionalstatements.ValidTriangle
 */
class ValidTriangleTest {

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
    public void testValidTriangle() {
        setInput("3\n4\n5\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Valid triangle"), "3, 4, 5 should form a valid triangle");
    }

    @Test
    public void testInvalidTriangleTooLong() {
        setInput("1\n2\n5\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "1, 2, 5 cannot form a triangle (1 + 2 <= 5)");
    }

    @Test
    public void testZeroOrNegativeSides() {
        setInput("0\n4\n4\n");
        ValidTriangle.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid triangle"), "Sides must be strictly positive");
    }
}
