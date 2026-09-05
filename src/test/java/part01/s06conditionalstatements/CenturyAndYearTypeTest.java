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
 * @see part01.s06conditionalstatements.CenturyAndYearType
 */
class CenturyAndYearTypeTest {

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
    public void testTwentiethCenturyLeapYear() {
        setInput("1984\n");
        CenturyAndYearType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Century: 20"), "1984 should be in the 20th century");
        assertTrue(output.contains("Type: Leap year"), "1984 is a leap year");
    }

    @Test
    public void testNineteenthCenturyCommonYear() {
        setInput("1900\n");
        CenturyAndYearType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Century: 19"), "1900 is the last year of the 19th century");
        assertTrue(output.contains("Type: Common year"), "1900 is not a leap year (divisible by 100, not 400)");
    }

    @Test
    public void testTwentiethCenturyEndLeapYear() {
        setInput("2000\n");
        CenturyAndYearType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Century: 20"), "2000 is the last year of the 20th century");
        assertTrue(output.contains("Type: Leap year"), "2000 is a leap year (divisible by 400)");
    }

    @Test
    public void testTwentyFirstCenturyCommonYear() {
        setInput("2023\n");
        CenturyAndYearType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Century: 21"), "2023 is in the 21st century");
        assertTrue(output.contains("Type: Common year"), "2023 is a common year");
    }
}
