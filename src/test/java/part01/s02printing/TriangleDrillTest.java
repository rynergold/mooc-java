package part01.s02printing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleDrillTest {

    private final ByteArrayOutputStream outputBucket = new ByteArrayOutputStream();
    private final PrintStream originalConsole = System.out;

    @BeforeEach
    public void rerouteConsoleToBucket() {
        System.setOut(new PrintStream(outputBucket));
    }

    @AfterEach
    public void restoreConsole() {
        System.setOut(originalConsole);
    }

    @Test
    public void testPrintsTriangleCorrectly() {
        TriangleDrill.main(new String[]{});

        String expectedOutput = 
                "  *\n" +
                " ***\n" +
                "*****\n";

        assertEquals(expectedOutput, outputBucket.toString(), 
            "The output did not match! Check your spaces carefully.");
    }
}
