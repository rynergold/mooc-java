package part01.s04variables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s04variables.DifferentTypesOfInput
 */
class DifferentTypesOfInputTest {

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
    public void testDifferentTypesFirstScenario() {
        setInput("bye-bye\n11\n4.2\ntrue\n");
        DifferentTypesOfInput.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a string:"), "Missing prompt 1");
        assertTrue(output.contains("Give an integer:"), "Missing prompt 2");
        assertTrue(output.contains("Give a double:"), "Missing prompt 3");
        assertTrue(output.contains("Give a boolean:"), "Missing prompt 4");
        assertTrue(output.contains("You gave the string bye-bye"), "String output missing");
        assertTrue(output.contains("You gave the integer 11"), "Integer output missing");
        assertTrue(output.contains("You gave the double 4.2"), "Double output missing");
        assertTrue(output.contains("You gave the boolean true"), "Boolean output missing");
    }

    @Test
    public void testDifferentTypesSecondScenario() {
        setInput("Oops!\n-4\n3200.1\nfalse\n");
        DifferentTypesOfInput.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("You gave the string Oops!"), "String output missing");
        assertTrue(output.contains("You gave the integer -4"), "Integer output missing");
        assertTrue(output.contains("You gave the double 3200.1"), "Double output missing");
        assertTrue(output.contains("You gave the boolean false"), "Boolean output missing");
    }
}
