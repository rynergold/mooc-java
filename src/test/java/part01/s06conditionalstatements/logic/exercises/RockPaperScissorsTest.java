package part01.s06conditionalstatements.logic.exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s06conditionalstatements.logic.exercises.RockPaperScissors
 */
class RockPaperScissorsTest {

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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Player 1 move:"), "Must display 'Player 1 move:' prompt");
        assertTrue(output.contains("Player 2 move:"), "Must display 'Player 2 move:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Player 1 move") && !l.startsWith("Player 2 move"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one result line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected game result: " + expectedMessage);
    }

    @Test
    public void testPlayerOneRockBeatsScissors() {
        setInput("rock\nscissors\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Player 1 wins!");
    }

    @Test
    public void testPlayerOneScissorsBeatsPaper() {
        setInput("scissors\npaper\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Player 1 wins!");
    }

    @Test
    public void testPlayerOnePaperBeatsRock() {
        setInput("paper\nrock\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Player 1 wins!");
    }

    @Test
    public void testPlayerTwoRockBeatsScissors() {
        setInput("scissors\nrock\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Player 2 wins!");
    }

    @Test
    public void testPlayerTwoScissorsBeatsPaper() {
        setInput("paper\nscissors\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Player 2 wins!");
    }

    @Test
    public void testPlayerTwoPaperBeatsRock() {
        setInput("rock\npaper\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Player 2 wins!");
    }

    @Test
    public void testTieRock() {
        setInput("rock\nrock\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Tie!");
    }

    @Test
    public void testTiePaper() {
        setInput("paper\npaper\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Tie!");
    }

    @Test
    public void testTieScissors() {
        setInput("scissors\nscissors\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Tie!");
    }

    @Test
    public void testPlayerOneInvalidMove() {
        setInput("dynamite\nrock\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Invalid move!");
    }

    @Test
    public void testPlayerTwoInvalidMove() {
        setInput("rock\nlizard\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Invalid move!");
    }

    @Test
    public void testBothInvalidMoves() {
        setInput("fire\nwater\n");
        RockPaperScissors.main(new String[]{});

        assertResult(outContent.toString(), "Invalid move!");
    }
}
