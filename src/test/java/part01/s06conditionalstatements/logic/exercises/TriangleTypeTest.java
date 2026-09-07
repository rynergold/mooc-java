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
 * @see part01.s06conditionalstatements.logic.exercises.TriangleType
 */
class TriangleTypeTest {

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
    public void testEquilateral() {
        setInput("5\n5\n5\n");
        TriangleType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Equilateral"), "5, 5, 5 should be Equilateral");
        assertFalse(output.contains("Isosceles"), "Equilateral must not report Isosceles");
        assertFalse(output.contains("Scalene"), "Equilateral must not report Scalene");
        assertFalse(output.contains("Not a triangle"), "Equilateral must not report Not a triangle");
    }

    @Test
    public void testIsosceles() {
        setInput("5\n5\n8\n");
        TriangleType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Isosceles"), "5, 5, 8 should be Isosceles");
        assertFalse(output.contains("Equilateral"), "Isosceles must not report Equilateral");
        assertFalse(output.contains("Scalene"), "Isosceles must not report Scalene");
        assertFalse(output.contains("Not a triangle"), "Isosceles must not report Not a triangle");
    }

    @Test
    public void testScalene() {
        setInput("3\n4\n5\n");
        TriangleType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Scalene"), "3, 4, 5 should be Scalene");
        assertFalse(output.contains("Equilateral"), "Scalene must not report Equilateral");
        assertFalse(output.contains("Isosceles"), "Scalene must not report Isosceles");
        assertFalse(output.contains("Not a triangle"), "Scalene must not report Not a triangle");
    }

    @Test
    public void testNotATriangle() {
        setInput("1\n2\n10\n");
        TriangleType.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Not a triangle"), "1, 2, 10 cannot form a triangle");
        assertFalse(output.contains("Equilateral"), "Not a triangle must not report Equilateral");
        assertFalse(output.contains("Isosceles"), "Not a triangle must not report Isosceles");
        assertFalse(output.contains("Scalene"), "Not a triangle must not report Scalene");
    }
}
