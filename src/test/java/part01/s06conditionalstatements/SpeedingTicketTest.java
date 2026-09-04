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
 * @see part01.s06conditionalstatements.SpeedingTicket
 */
class SpeedingTicketTest {

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
    public void testSpeedingTicketOver120() {
        setInput("135\n");
        SpeedingTicket.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give speed:"), "Missing prompt 'Give speed:'");
        assertTrue(output.contains("Speeding ticket!"), "Expected 'Speeding ticket!' for speed 135");
    }

    @Test
    public void testNoTicketAt120() {
        setInput("120\n");
        SpeedingTicket.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give speed:"), "Missing prompt 'Give speed:'");
        assertFalse(output.contains("Speeding ticket!"), "Should not print 'Speeding ticket!' for speed 120");
    }

    @Test
    public void testNoTicketUnder120() {
        setInput("15\n");
        SpeedingTicket.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give speed:"), "Missing prompt 'Give speed:'");
        assertFalse(output.contains("Speeding ticket!"), "Should not print 'Speeding ticket!' for speed 15");
    }
}
