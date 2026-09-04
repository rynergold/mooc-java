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
 * @see part01.s06conditionalstatements.Password
 */
class PasswordTest {

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
    public void testCorrectPassword() {
        setInput("Caput Draconis\n");
        Password.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Password?"), "Missing prompt 'Password?'");
        assertTrue(output.contains("Welcome!"), "Expected 'Welcome!' for correct password");
    }

    @Test
    public void testIncorrectPassword() {
        setInput("Wattlebird\n");
        Password.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Password?"), "Missing prompt 'Password?'");
        assertTrue(output.contains("Off with you!"), "Expected 'Off with you!' for wrong password");
    }

    @Test
    public void testCaseSensitivity() {
        setInput("caput draconis\n");
        Password.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Off with you!"), "Password check must be case sensitive");
    }
}
