package part01.s06conditionalstatements.drills.exercises;

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
 * @see part01.s06conditionalstatements.drills.exercises.BankWithdrawal
 */
class BankWithdrawalTest {

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
    public void testValidPartialWithdrawal() {
        setInput("500\n200\n");
        BankWithdrawal.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Withdrawal successful. Remaining balance: 300"), "500 - 200 should leave 300");
        assertFalse(output.contains("Invalid withdrawal"), "Valid withdrawal should not print invalid");
    }

    @Test
    public void testValidExactBalanceWithdrawal() {
        setInput("500\n500\n");
        BankWithdrawal.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Withdrawal successful. Remaining balance: 0"), "500 - 500 should leave 0");
        assertFalse(output.contains("Invalid withdrawal"), "Valid withdrawal should not print invalid");
    }

    @Test
    public void testInvalidAmountExceedsBalance() {
        setInput("500\n600\n");
        BankWithdrawal.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid withdrawal"), "Amount > balance must be invalid");
        assertFalse(output.contains("Withdrawal successful"), "Invalid withdrawal must not report success");
    }

    @Test
    public void testInvalidZeroWithdrawal() {
        setInput("500\n0\n");
        BankWithdrawal.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid withdrawal"), "Amount of 0 must be invalid");
        assertFalse(output.contains("Withdrawal successful"), "Invalid withdrawal must not report success");
    }

    @Test
    public void testInvalidNegativeWithdrawal() {
        setInput("500\n-50\n");
        BankWithdrawal.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Invalid withdrawal"), "Negative amount must be invalid");
        assertFalse(output.contains("Withdrawal successful"), "Invalid withdrawal must not report success");
    }
}
