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
 * @see part01.s06conditionalstatements.GiftTax
 */
class GiftTaxTest {

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
    public void testNoTaxUnderFiveThousand() {
        setInput("3500\n");
        GiftTax.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Value of the gift?"), "Missing prompt 'Value of the gift?'");
        assertTrue(output.contains("No tax!"), "Expected 'No tax!' for gift of 3500");
    }

    @Test
    public void testTaxAtLowerLimitFiveThousand() {
        setInput("5000\n");
        GiftTax.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tax: 100.0") || output.contains("Tax: 100"), "Expected tax of 100.0 for 5000");
    }

    @Test
    public void testTaxBracketOne() {
        setInput("6000\n");
        GiftTax.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tax: 180.0") || output.contains("Tax: 180"), "Expected tax of 180.0 for 6000");
    }

    @Test
    public void testTaxBracketTwo() {
        setInput("27500\n");
        GiftTax.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tax: 1950.0") || output.contains("Tax: 1950"), "Expected tax of 1950.0 for 27500");
    }

    @Test
    public void testTaxBracketThree() {
        setInput("75000\n");
        GiftTax.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tax: 7100.0") || output.contains("Tax: 7100"), "Expected tax of 7100.0 for 75000");
    }
}
