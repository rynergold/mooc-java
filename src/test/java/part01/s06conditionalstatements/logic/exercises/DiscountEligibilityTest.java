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
    public void testYouthDiscount() {
        setInput("15\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Discount applied"), "Under 18 qualifies for youth discount");
        assertFalse(output.contains("Standard price"), "Discount recipient must not pay standard");
    }

    @Test
    public void testSeniorDiscount() {
        setInput("65\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Discount applied"), "65 qualifies for senior discount");
        assertFalse(output.contains("Standard price"), "Discount recipient must not pay standard");
    }

    @Test
    public void testStandardAdultPrice() {
        setInput("18\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Standard price"), "18 pays standard price");
        assertFalse(output.contains("Discount applied"), "Adult must not get discount");
    }

    @Test
    public void testStandardMiddleAgePrice() {
        setInput("40\n");
        DiscountEligibility.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Standard price"), "40 pays standard price");
        assertFalse(output.contains("Discount applied"), "Adult must not get discount");
    }
}
