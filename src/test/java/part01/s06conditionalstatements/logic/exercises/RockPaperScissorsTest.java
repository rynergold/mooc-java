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

    @Test
    public void testPlayerOneWins() {
        setInput("rock\nscissors\n");
        RockPaperScissors.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Player 1 wins!"), "rock beats scissors");
        assertFalse(output.contains("Player 2 wins!"), "P1 win must not print P2 wins");
        assertFalse(output.contains("Tie!"), "P1 win must not print Tie");
        assertFalse(output.contains("Invalid move!"), "P1 win must not print Invalid move");
    }

    @Test
    public void testPlayerTwoWins() {
        setInput("paper\nscissors\n");
        RockPaperScissors.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Player 2 wins!"), "scissors beats paper");
        assertFalse(output.contains("Player 1 wins!"), "P2 win must not print P1 wins");
        assertFalse(output.contains("Tie!"), "P2 win must not print Tie");
        assertFalse(output.contains("Invalid move!"), "P2 win must not print Invalid move");
    }

    @Test
    public void testTie() {
        setInput("rock\nrock\n");
        RockPaperScissors.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tie!"), "Same moves result in a tie");
        assertFalse(output.contains("Player 1 wins!"), "Tie must not print P1 wins");
        assertFalse(output.contains("Player 2 wins!"), "Tie must not print P2 wins");
        assertFalse(output.contains("Invalid move!"), "Tie must not print Invalid move");
    }

    @Test
    public void testInvalidMove() {
        setInput("dynamite\nrock\n");
        RockPaperScissors.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid move!"), "Unrecognized move should print 'Invalid move!'");
        assertFalse(output.contains("Player 1 wins!"), "Invalid move must not print P1 wins");
        assertFalse(output.contains("Player 2 wins!"), "Invalid move must not print P2 wins");
        assertFalse(output.contains("Tie!"), "Invalid move must not print Tie");
    }
}
