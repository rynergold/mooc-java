package part01.s02printing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @see part01.s02printing.AdaLovelace
 */
class AdaLovelaceTest {
    
    /* 
     * 1. THE BUCKET (ByteArrayOutputStream)
     * System.out normally prints text to your screen. To test output, we replace 
     * the screen with a stream in memory (a bucket). 
     * This bucket catches everything your program prints.
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    /*
     * We save the original console stream here. We need it to restore normal 
     * printing after the test finishes.
     */
    private final PrintStream originalOut = System.out;

    /*
     * 2. @BeforeEach (The Setup)
     * JUnit runs methods marked with @BeforeEach right before every test.
     * Here, we redirect System.out to point to our bucket instead of the screen.
     */
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /*
     * 3. @AfterEach (The Teardown)
     * JUnit runs methods marked with @AfterEach right after every test.
     * We restore System.out to the original console. If we forget this, 
     * IntelliJ stops showing output in the Run tool window.
     */
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    
    /*
     * 4. @Test (The Execution)
     * JUnit runs methods marked with @Test as individual test cases.
     */
    @Test
    public void testMainPrintsAdaLovelace() {
        // Trigger your program. It prints to our bucket.
        AdaLovelace.main(new String[]{});

        // Read the bucket's contents.
        String actualOutput = outContent.toString();

        // Assert checks if the actual output matches exactly what we expect.
        // Note: System.out.println adds a newline character (\n) at the end.
        assertEquals("Ada Lovelace\n", actualOutput);
    }
}
