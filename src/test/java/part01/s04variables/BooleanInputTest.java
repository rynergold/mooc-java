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
 * @see part01.s04variables.BooleanInput
 */
class BooleanInputTest {

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
    public void testBooleanInputFalse() {
        setInput("santa does not exist\n");
        BooleanInput.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Write something:"), "Should ask 'Write something:'");
        assertTrue(output.contains("True or false? false"), "Should print 'True or false? false'");
    }

    @Test
    public void testBooleanInputTrue() {
        setInput("TRUE\n");
        BooleanInput.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Write something:"), "Should ask 'Write something:'");
        assertTrue(output.contains("True or false? true"), "Should print 'True or false? true'");
    }
}
