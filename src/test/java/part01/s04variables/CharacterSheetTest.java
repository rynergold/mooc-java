package part01.s04variables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s04variables.CharacterSheet
 */
class CharacterSheetTest {

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
    public void testCharacterSheetAdaLovelace() {
        setInput("Ada Lovelace\n42\n999.75\ntrue\nGrand Architect\n");
        CharacterSheet.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Enter character name:"), "Should prompt for character name");
        assertTrue(output.contains("Enter character level:"), "Should prompt for character level");
        assertTrue(output.contains("Enter gold coins:"), "Should prompt for gold coins");
        assertTrue(output.contains("Is in active guild? (true/false):"), "Should prompt for guild status");
        assertTrue(output.contains("Enter earned title:"), "Should prompt for earned title");
        assertTrue(output.contains("=== CHARACTER PROFILE ==="), "Profile header missing");
        assertTrue(output.contains("Name: Ada Lovelace"), "Name line missing or mismatched");
        assertTrue(output.contains("Full Title: Ada Lovelace the Grand Architect"), "Full Title line missing or mismatched");
        assertTrue(output.contains("Level: 42"), "Level line missing or mismatched");
        assertTrue(output.contains("Purse: 999.75 gold"), "Purse line missing or mismatched");
        assertTrue(output.contains("Guild Member: true"), "Guild Member line missing or mismatched");
    }

    @Test
    public void testCharacterSheetSirFluffy() {
        setInput("Sir Fluffy\n7\n12.5\nFALSE\nBrave Duck\n");
        CharacterSheet.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Enter character name:"), "Should prompt for character name");
        assertTrue(output.contains("Enter character level:"), "Should prompt for character level");
        assertTrue(output.contains("Enter gold coins:"), "Should prompt for gold coins");
        assertTrue(output.contains("Is in active guild? (true/false):"), "Should prompt for guild status");
        assertTrue(output.contains("Enter earned title:"), "Should prompt for earned title");
        assertTrue(output.contains("=== CHARACTER PROFILE ==="), "Profile header missing");
        assertTrue(output.contains("Name: Sir Fluffy"), "Name line missing or mismatched");
        assertTrue(output.contains("Full Title: Sir Fluffy the Brave Duck"), "Full Title line missing or mismatched");
        assertTrue(output.contains("Level: 7"), "Level line missing or mismatched");
        assertTrue(output.contains("Purse: 12.5 gold"), "Purse line missing or mismatched");
        assertTrue(output.contains("Guild Member: false"), "Guild Member line missing or mismatched");
    }
}
