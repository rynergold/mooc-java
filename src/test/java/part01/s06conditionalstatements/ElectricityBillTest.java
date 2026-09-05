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
 * @see part01.s06conditionalstatements.ElectricityBill
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

    @Test
    public void testFirstTier() {
        setInput("50\n");
        ElectricityBill.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Total bill: 10.0€") || output.contains("Total bill: 10€"), "50 kWh should cost 5.0 + 5.0 = 10.0€");
    }

    @Test
    public void testSecondTier() {
        setInput("150\n");
        ElectricityBill.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Total bill: 22.5€"), "150 kWh should cost 5.0 + 10.0 + 7.5 = 22.5€");
    }

    @Test
    public void testThirdTier() {
        setInput("250\n");
        ElectricityBill.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Total bill: 40.0€") || output.contains("Total bill: 40€"), "250 kWh should cost 5.0 + 10.0 + 15.0 + 10.0 = 40.0€");
    }
}
