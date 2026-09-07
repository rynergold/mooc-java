package part01.s06conditionalstatements.logic.exercises;

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
 * @see part01.s06conditionalstatements.logic.exercises.TicketPrice
 */
class TicketPriceTest {

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
    public void testChildPriceUnderTwelve() {
        setInput("8\n");
        TicketPrice.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Ticket price: 5 euros"), "under 12 should pay 5 euros");
        assertFalse(output.contains("Ticket price: 10 euros"), "child should not pay standard price");
    }

    @Test
    public void testBoundaryTwelve() {
        setInput("12\n");
        TicketPrice.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Ticket price: 10 euros"), "age 12 is standard price");
        assertFalse(output.contains("Ticket price: 5 euros"), "age 12 must not pay child price");
    }

    @Test
    public void testAdult() {
        setInput("25\n");
        TicketPrice.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Ticket price: 10 euros"), "adult should pay 10 euros");
        assertFalse(output.contains("Ticket price: 5 euros"), "adult must not pay child price");
    }
}
