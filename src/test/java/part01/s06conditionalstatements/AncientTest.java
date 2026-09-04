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
 * @see part01.s06conditionalstatements.Ancient
 */
class AncientTest {

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
    public void testAncientBefore2015() {
        setInput("2013\n");
        Ancient.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a year:"), "Missing prompt 'Give a year:'");
        assertTrue(output.contains("Ancient history!"), "Expected 'Ancient history!' for year 2013");
    }

    @Test
    public void testNotAncientAt2015() {
        setInput("2015\n");
        Ancient.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a year:"), "Missing prompt 'Give a year:'");
        assertFalse(output.contains("Ancient history!"), "Should not print 'Ancient history!' for year 2015");
    }

    @Test
    public void testNotAncientAfter2015() {
        setInput("2017\n");
        Ancient.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a year:"), "Missing prompt 'Give a year:'");
        assertFalse(output.contains("Ancient history!"), "Should not print 'Ancient history!' for year 2017");
    }
}
