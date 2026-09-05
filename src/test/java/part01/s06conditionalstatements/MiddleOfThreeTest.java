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
 * @see part01.s06conditionalstatements.MiddleOfThree
 */
class MiddleOfThreeTest {

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
    public void testMiddleValueFirst() {
        setInput("10\n5\n20\n");
        MiddleOfThree.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The middle number is: 10"), "Middle of 10, 5, 20 is 10");
    }

    @Test
    public void testMiddleValueSecond() {
        setInput("3\n7\n15\n");
        MiddleOfThree.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The middle number is: 7"), "Middle of 3, 7, 15 is 7");
    }

    @Test
    public void testMiddleValueThird() {
        setInput("20\n5\n12\n");
        MiddleOfThree.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The middle number is: 12"), "Middle of 20, 5, 12 is 12");
    }

    @Test
    public void testWithDuplicates() {
        setInput("5\n5\n2\n");
        MiddleOfThree.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The middle number is: 5"), "Middle of 5, 5, 2 is 5");
    }

    @Test
    public void testAllIdentical() {
        setInput("4\n4\n4\n");
        MiddleOfThree.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("The middle number is: 4"), "Middle of 4, 4, 4 is 4");
    }
}
