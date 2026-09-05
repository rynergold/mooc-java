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
 * @see part01.s06conditionalstatements.CinemaTicket
 */
class CinemaTicketTest {

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
    public void testChildFree() {
        setInput("4\nSaturday\n");
        CinemaTicket.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Price: 0€"), "Children under 5 should be free (0€)");
    }

    @Test
    public void testRegularStandardDay() {
        setInput("25\nFriday\n");
        CinemaTicket.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Price: 12€"), "Regular patrons on standard days pay 12€");
    }

    @Test
    public void testRegularWednesdayDiscount() {
        setInput("25\nWednesday\n");
        CinemaTicket.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Price: 9€"), "Regular patrons on Wednesday pay 9€");
    }

    @Test
    public void testSeniorPrice() {
        setInput("70\nWednesday\n");
        CinemaTicket.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Price: 8€"), "Seniors pay 8€ regardless of discount day");
    }
}
