package part01.s06conditionalstatements.logic.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.logic.exercises.ElectricityBill
 */
class ElectricityBillTest {

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

    private void assertSingleBillOutput(String output) {
        int count = output.split("Total bill:", -1).length - 1;
        assertEquals(1, count, "Should print 'Total bill:' exactly once, but printed " + count + " times");
    }

    @Test
    public void testFirstTier() {
        setInput("50\n");
        ElectricityBill.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Total bill: 10.0€") || output.contains("Total bill: 10€"), "50 kWh should cost 5.0 + 5.0 = 10.0€");
        assertFalse(output.contains("22.5"), "First tier must not report second tier total");
        assertFalse(output.contains("40"), "First tier must not report third tier total");
        assertSingleBillOutput(output);
    }

    @Test
    public void testSecondTier() {
        setInput("150\n");
        ElectricityBill.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Total bill: 22.5€"), "150 kWh should cost 5.0 + 10.0 + 7.5 = 22.5€");
        assertFalse(output.contains("10.0€") || output.contains("10€"), "Second tier must not report first tier total");
        assertFalse(output.contains("40"), "Second tier must not report third tier total");
        assertSingleBillOutput(output);
    }

    @Test
    public void testThirdTier() {
        setInput("250\n");
        ElectricityBill.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Total bill: 40.0€") || output.contains("Total bill: 40€"), "250 kWh should cost 5.0 + 10.0 + 15.0 + 10.0 = 40.0€");
        assertFalse(output.contains("10.0€") || output.contains("10€"), "Third tier must not report first tier total");
        assertFalse(output.contains("22.5"), "Third tier must not report second tier total");
        assertSingleBillOutput(output);
    }
}
