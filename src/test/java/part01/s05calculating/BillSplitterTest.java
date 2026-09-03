package part01.s05calculating;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s05calculating.BillSplitter
 */
class BillSplitterTest {

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
    public void testEightyDollarBillFourPeople() {
        setInput("80.0\n15\n4\n");
        BillSplitter.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Enter food bill:"), "Missing prompt 1");
        assertTrue(output.contains("Enter tip percentage (e.g. 15 for 15%):"), "Missing prompt 2");
        assertTrue(output.contains("Enter number of people splitting:"), "Missing prompt 3");
        assertTrue(output.contains("Tip amount: 12.0"), "Expected tip amount of 12.0");
        assertTrue(output.contains("Total bill: 92.0"), "Expected total bill of 92.0");
        assertTrue(output.contains("Each person pays: 23.0"), "Expected each person pays 23.0");
    }

    @Test
    public void testFiftyDollarBillTwoPeople() {
        setInput("50.0\n10\n2\n");
        BillSplitter.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tip amount: 5.0"), "Expected tip amount of 5.0");
        assertTrue(output.contains("Total bill: 55.0"), "Expected total bill of 55.0");
        assertTrue(output.contains("Each person pays: 27.5"), "Expected each person pays 27.5");
    }

    @Test
    public void testHundredDollarBillFivePeople() {
        setInput("100.0\n20\n5\n");
        BillSplitter.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tip amount: 20.0"), "Expected tip amount of 20.0");
        assertTrue(output.contains("Total bill: 120.0"), "Expected total bill of 120.0");
        assertTrue(output.contains("Each person pays: 24.0"), "Expected each person pays 24.0");
    }
}
