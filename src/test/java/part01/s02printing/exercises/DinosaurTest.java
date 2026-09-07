package part01.s02printing.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DinosaurTest {

    // 1. The Bucket
    private final ByteArrayOutputStream outputBucket = new ByteArrayOutputStream();
    private final PrintStream originalConsole = System.out;

    // 2. Intercept before the test
    @BeforeEach
    public void rerouteConsoleToBucket() {
        System.setOut(new PrintStream(outputBucket));
    }

    // 3. Restore after the test
    @AfterEach
    public void restoreConsole() {
        System.setOut(originalConsole);
    }

    // 4. The actual test
    @Test
    public void testPrintsDinosaurCorrectly() {
        // Trigger the user's code
        Dinosaur.main(new String[]{});

        // The expected string. Notice the \n representing the end of a println statement.
        String expectedOutput = 
                "Once upon a time\n" +
                "there was\n" +
                "a dinosaur\n";

        // Assert that the bucket contains EXACTLY the expected string
        assertEquals(expectedOutput, outputBucket.toString());
    }
}
