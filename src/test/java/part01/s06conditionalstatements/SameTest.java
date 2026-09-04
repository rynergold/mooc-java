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
 * @see part01.s06conditionalstatements.Same
 */
class SameTest {

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
    public void testIdenticalStrings() {
        setInput("hello\nhello\n");
        Same.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Enter the first string:"), "Missing prompt 1");
        assertTrue(output.contains("Enter the second string:"), "Missing prompt 2");
        assertTrue(output.contains("Same"), "Expected 'Same' for identical strings");
    }

    @Test
    public void testDifferentStrings() {
        setInput("hello\nworld\n");
        Same.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Enter the first string:"), "Missing prompt 1");
        assertTrue(output.contains("Enter the second string:"), "Missing prompt 2");
        assertTrue(output.contains("Different"), "Expected 'Different' for different strings");
    }

    @Test
    public void testCaseDifference() {
        setInput("Case\ncase\n");
        Same.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Different"), "String comparison should be case-sensitive");
    }
}
