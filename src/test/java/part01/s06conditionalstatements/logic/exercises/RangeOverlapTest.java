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
 * @see part01.s06conditionalstatements.logic.exercises.RangeOverlap
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
        assertTrue(output.contains("Overlapping"), "[1, 5] and [3, 8] overlap in [3, 5]");
        assertFalse(output.contains("Disjoint"), "Overlapping ranges must not report Disjoint");
    }

    @Test
    public void testDisjoint() {
        setInput("1\n4\n6\n10\n");
        RangeOverlap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Disjoint"), "[1, 4] and [6, 10] do not overlap");
        assertFalse(output.contains("Overlapping"), "Disjoint ranges must not report Overlapping");
    }

    @Test
    public void testOverlappingEndpoint() {
        setInput("1\n5\n5\n10\n");
        RangeOverlap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Overlapping"), "Sharing endpoint 5 counts as overlapping");
        assertFalse(output.contains("Disjoint"), "Overlapping ranges must not report Disjoint");
    }

    @Test
    public void testContainedWithin() {
        setInput("2\n8\n4\n6\n");
        RangeOverlap.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Overlapping"), "[4, 6] inside [2, 8] is overlapping");
        assertFalse(output.contains("Disjoint"), "Overlapping ranges must not report Disjoint");
    }
}
