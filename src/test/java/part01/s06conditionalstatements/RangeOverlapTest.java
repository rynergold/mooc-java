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
 * @see part01.s06conditionalstatements.RangeOverlap
 */
class RangeOverlapTest {

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
    public void testOverlappingInterior() {
        setInput("1\n5\n3\n8\n");
        RangeOverlap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Overlapping"), "[1, 5] and [3, 8] overlap");
    }

    @Test
    public void testDisjoint() {
        setInput("1\n4\n5\n10\n");
        RangeOverlap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Disjoint"), "[1, 4] and [5, 10] are disjoint");
    }

    @Test
    public void testOverlappingEndpoint() {
        setInput("2\n6\n6\n9\n");
        RangeOverlap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Overlapping"), "[2, 6] and [6, 9] overlap at point 6");
    }

    @Test
    public void testContainedWithin() {
        setInput("2\n10\n4\n7\n");
        RangeOverlap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Overlapping"), "[4, 7] is contained within [2, 10]");
    }
}
