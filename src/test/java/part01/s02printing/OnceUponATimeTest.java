package part01.s02printing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OnceUponATimeTest {

    /*
     * ---------------------------------------------------------
     * THE SETUP: CREATING A "BUCKET"
     * ---------------------------------------------------------
     * Since this program prints to the screen (System.out), we can't 
     * easily check its result. We have to temporarily reroute the 
     * output stream into a memory "bucket" so we can read it in code.
     */
    private final ByteArrayOutputStream outputBucket = new ByteArrayOutputStream();
    private final PrintStream originalConsole = System.out;

    @BeforeEach
    public void rerouteConsoleToBucket() {
        // This runs BEFORE every test. It tells Java: 
        // "Instead of printing to the screen, print into my bucket."
        System.setOut(new PrintStream(outputBucket));
    }

    @AfterEach
    public void restoreConsole() {
        // This runs AFTER every test. We MUST restore the original console
        // so that IntelliJ can print things normally again.
        System.setOut(originalConsole);
    }

    /*
     * ---------------------------------------------------------
     * THE TEST
     * ---------------------------------------------------------
     * Now that the setup is done, we can write the actual test.
     */
    @Test
    public void testPrintsStoryCorrectly() {
        
        // STEP 1: TRIGGER THE CODE
        // We run your main method exactly as if you clicked the green Run button.
        // Because of our setup, everything it prints will land in our bucket.
        OnceUponATime.main(new String[]{});

        // STEP 2: DEFINE EXACTLY WHAT WE EXPECT
        // System.out.println always adds a newline character (\n) at the end of every line.
        String expectedOutput = 
                "Once upon a time\n" +
                "there was\n" +
                "a program\n";

        // STEP 3: ASSERT THE RESULT
        // We look inside our bucket (outputBucket.toString()) and check if it exactly 
        // matches our expectedOutput. If it does, the test passes!
        assertEquals(expectedOutput, outputBucket.toString());
    }
}
