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
 * @see part01.s06conditionalstatements.RockPaperScissors
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
        assertTrue(output.contains("Player 1 wins!"), "Rock beats scissors");
    }

    @Test
    public void testPlayerTwoWins() {
        setInput("paper\nscissors\n");
        RockPaperScissors.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Player 2 wins!"), "Scissors beats paper");
    }

    @Test
    public void testTie() {
        setInput("rock\nrock\n");
        RockPaperScissors.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Tie!"), "Same moves result in a tie");
    }

    @Test
    public void testInvalidMove() {
        setInput("lizard\npaper\n");
        RockPaperScissors.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid move!"), "Unrecognized move should print 'Invalid move!'");
    }
}
