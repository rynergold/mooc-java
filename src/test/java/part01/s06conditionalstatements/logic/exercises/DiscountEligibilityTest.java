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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter age:"), "Must display 'Enter age:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter age"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one status line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testYouthMidRange() {
        setInput("15\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Discount applied");
    }

    @Test
    public void testYouthBoundarySeventeen() {
        setInput("17\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Discount applied");
    }

    @Test
    public void testStandardPriceLowerBoundaryEighteen() {
        setInput("18\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Standard price");
    }

    @Test
    public void testStandardPriceMidRangeForty() {
        setInput("40\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Standard price");
    }

    @Test
    public void testStandardPriceUpperBoundarySixtyFour() {
        setInput("64\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Standard price");
    }

    @Test
    public void testSeniorBoundarySixtyFive() {
        setInput("65\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Discount applied");
    }

    @Test
    public void testSeniorSeventy() {
        setInput("70\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Discount applied");
    }

    @Test
    public void testInfantZero() {
        setInput("0\n");
        DiscountEligibility.main(new String[]{});

        assertResult(outContent.toString(), "Discount applied");
    }
}
