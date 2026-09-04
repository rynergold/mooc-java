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
 * @see part01.s06conditionalstatements.CheckYourIndentation
 */
class CheckYourIndentationTest {

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
    public void testSameNumbers() {
        setInput("5\n5\n");
        CheckYourIndentation.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("Same!"), "Should print 'Same!' when numbers are equal");
    }

    @Test
    public void testFirstLarger() {
        setInput("7\n3\n");
        CheckYourIndentation.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("The first was larger than the second!"), "Should print that first was larger");
    }

    @Test
    public void testSecondLarger() {
        setInput("2\n9\n");
        CheckYourIndentation.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give the first number:"), "Missing prompt 1");
        assertTrue(output.contains("Give the second number:"), "Missing prompt 2");
        assertTrue(output.contains("The second was larger than the first!"), "Should print that second was larger");
    }
}
