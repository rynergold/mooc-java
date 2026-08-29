package part01.s04variables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s04variables.VariousVariables
 */
class VariousVariablesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testVariousVariablesOutputs() {
        VariousVariables.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Chicken:\n9000"), "Should print 9000 chickens");
        assertTrue(output.contains("Bacon (kg):\n0.1"), "Should print 0.1 kg bacon");
        assertTrue(output.contains("Tractor:\nZetor"), "Should print Tractor: Zetor");
        assertTrue(output.contains("And finally, a summary:\n9000\n0.1\nZetor"), "Summary missing or mismatched");
    }
}
