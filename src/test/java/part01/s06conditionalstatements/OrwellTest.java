package part01.s06conditionalstatements;

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
 * @see part01.s06conditionalstatements.Orwell
 */
class OrwellTest {

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
    public void testOrwellAt1984() {
        setInput("1984\n");
        Orwell.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertTrue(output.contains("Orwell"), "Expected 'Orwell' for input 1984");
    }

    @Test
    public void testNoOrwellAt1983() {
        setInput("1983\n");
        Orwell.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertFalse(output.contains("Orwell"), "Should not print 'Orwell' for input 1983");
    }

    @Test
    public void testNoOrwellOtherYear() {
        setInput("2025\n");
        Orwell.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertFalse(output.contains("Orwell"), "Should not print 'Orwell' for input 2025");
    }
}
