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
 * @see part01.s06conditionalstatements.logic.exercises.DiscountEligibility
 */
class DiscountEligibilityTest {

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
    public void testTwentyPercentDiscount() {
        setInput("120\nyes\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Discount applied: 20%"), "Over 100 and member gets 20%");
        assertFalse(output.contains("10%"), "20% discount must not report 10%");
        assertFalse(output.contains("No discount"), "20% discount must not report No discount");
    }

    @Test
    public void testTenPercentDiscountAmountOnly() {
        setInput("150\nno\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Discount applied: 10%"), "Over 100 but non-member gets 10%");
        assertFalse(output.contains("20%"), "10% discount must not report 20%");
        assertFalse(output.contains("No discount"), "10% discount must not report No discount");
    }

    @Test
    public void testTenPercentDiscountMemberOnly() {
        setInput("50\nyes\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Discount applied: 10%"), "Under 100 but member gets 10%");
        assertFalse(output.contains("20%"), "10% discount must not report 20%");
        assertFalse(output.contains("No discount"), "10% discount must not report No discount");
    }

    @Test
    public void testNoDiscount() {
        setInput("50\nno\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("No discount"), "Under 100 and non-member gets no discount");
        assertFalse(output.contains("Discount applied:"), "No discount must not report a discount applied");
    }
}
