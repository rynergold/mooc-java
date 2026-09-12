package part01.s06conditionalstatements.logic.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter age:"), "Must display 'Enter age:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter age"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one price line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected price message: " + expectedMessage);
    }

    @Test
    public void testChildPriceUnderTwelve() {
        setInput("8\n");
        TicketPrice.main(new String[]{});

        assertResult(outContent.toString(), "Ticket price: 5 euros");
    }

    @Test
    public void testChildPriceImmediateUnderTwelve() {
        setInput("11\n");
        TicketPrice.main(new String[]{});

        assertResult(outContent.toString(), "Ticket price: 5 euros");
    }

    @Test
    public void testExactBoundaryTwelve() {
        setInput("12\n");
        TicketPrice.main(new String[]{});

        assertResult(outContent.toString(), "Ticket price: 10 euros");
    }

    @Test
    public void testImmediateOverTwelve() {
        setInput("13\n");
        TicketPrice.main(new String[]{});

        assertResult(outContent.toString(), "Ticket price: 10 euros");
    }

    @Test
    public void testAdultTwentyFive() {
        setInput("25\n");
        TicketPrice.main(new String[]{});

        assertResult(outContent.toString(), "Ticket price: 10 euros");
    }

    @Test
    public void testInfantZero() {
        setInput("0\n");
        TicketPrice.main(new String[]{});

        assertResult(outContent.toString(), "Ticket price: 5 euros");
    }
}
