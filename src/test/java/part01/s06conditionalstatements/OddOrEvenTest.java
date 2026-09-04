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
 * @see part01.s06conditionalstatements.OddOrEven
 */
class OddOrEvenTest {

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
    public void testEvenPositiveNumber() {
        setInput("2\n");
        OddOrEven.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertTrue(output.contains("Number 2 is even."), "Expected 'Number 2 is even.'");
    }

    @Test
    public void testOddPositiveNumber() {
        setInput("7\n");
        OddOrEven.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give a number:"), "Missing prompt 'Give a number:'");
        assertTrue(output.contains("Number 7 is odd."), "Expected 'Number 7 is odd.'");
    }

    @Test
    public void testZeroIsEven() {
        setInput("0\n");
        OddOrEven.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Number 0 is even."), "Expected 'Number 0 is even.'");
    }

    @Test
    public void testNegativeEvenNumber() {
        setInput("-4\n");
        OddOrEven.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Number -4 is even."), "Expected 'Number -4 is even.'");
    }

    @Test
    public void testNegativeOddNumber() {
        setInput("-3\n");
        OddOrEven.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Number -3 is odd."), "Expected 'Number -3 is odd.'");
    }
}
