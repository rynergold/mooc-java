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
 * @see part01.s03readinginput.MessageThreeTimes
 */
class MessageThreeTimesTest {

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
    public void testMessageThreeTimesWithHi() {
        setInput("Hi\n");
        MessageThreeTimes.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Write a message:"), "Should prompt with 'Write a message:'");
        
        // Count occurrences of Hi
        int firstIndex = output.indexOf("Hi");
        assertTrue(firstIndex != -1, "Should contain 'Hi'");
        int secondIndex = output.indexOf("Hi", firstIndex + 2);
        assertTrue(secondIndex != -1, "Should contain 'Hi' a second time");
        int thirdIndex = output.indexOf("Hi", secondIndex + 2);
        assertTrue(thirdIndex != -1, "Should contain 'Hi' a third time");
    }

    @Test
    public void testMessageThreeTimesWithOnceUponATime() {
        setInput("Once upon a time...\n");
        MessageThreeTimes.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Write a message:"), "Should prompt with 'Write a message:'");
        
        int count = output.split("Once upon a time\\.\\.\\.", -1).length - 1;
        assertTrue(count >= 3, "Should print 'Once upon a time...' 3 times");
    }
}
