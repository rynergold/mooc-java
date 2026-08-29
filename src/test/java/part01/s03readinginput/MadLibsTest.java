package part01.s03readinginput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s03readinginput.MadLibs
 */
class MadLibsTest {

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
    public void testMadLibsRubberDuck() {
        setInput("noisy\nrubber duck\ndebugged\nThe JVM ran out of memory!\n");
        MadLibs.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give an adjective:"), "Should ask for an adjective");
        assertTrue(output.contains("Give a noun:"), "Should ask for a noun");
        assertTrue(output.contains("Give a past-tense verb:"), "Should ask for a past-tense verb");
        assertTrue(output.contains("Give a quote or shout:"), "Should ask for a quote or shout");
        assertTrue(output.contains("--- Mad Libs Adventure ---"), "Header missing");
        assertTrue(output.contains("Today, a noisy rubber duck debugged into the server room."), "Adventure line 1 missing or mismatched");
        assertTrue(output.contains("It shouted: \"The JVM ran out of memory!\""), "Adventure line 2 missing or mismatched");
    }

    @Test
    public void testMadLibsJavaCompiler() {
        setInput("mysterious\nJava compiler\ncrashed\nNullPointerException strikes again!\n");
        MadLibs.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Give an adjective:"), "Should ask for an adjective");
        assertTrue(output.contains("Give a noun:"), "Should ask for a noun");
        assertTrue(output.contains("Give a past-tense verb:"), "Should ask for a past-tense verb");
        assertTrue(output.contains("Give a quote or shout:"), "Should ask for a quote or shout");
        assertTrue(output.contains("--- Mad Libs Adventure ---"), "Header missing");
        assertTrue(output.contains("Today, a mysterious Java compiler crashed into the server room."), "Adventure line 1 missing or mismatched");
        assertTrue(output.contains("It shouted: \"NullPointerException strikes again!\""), "Adventure line 2 missing or mismatched");
    }
}
