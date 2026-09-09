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
 * @see part01.s06conditionalstatements.logic.exercises.BankWithdrawal
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

    private void assertResult(String output, String expectedMessage) {
        assertTrue(output.contains("Enter current balance:"), "Must display 'Enter current balance:' prompt");
        assertTrue(output.contains("Enter withdrawal amount:"), "Must display 'Enter withdrawal amount:' prompt");
        List<String> lines = output.lines()
                .map(String::trim)
                .filter(l -> !l.isEmpty() && !l.startsWith("Enter current balance") && !l.startsWith("Enter withdrawal amount"))
                .toList();
        assertEquals(1, lines.size(), "Should print exactly one result line, but found: " + lines);
        assertEquals(expectedMessage, lines.get(0), "Expected status message: " + expectedMessage);
    }

    @Test
    public void testValidPartialWithdrawal() {
        setInput("500\n200\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Withdrawal successful. Remaining balance: 300");
    }

    @Test
    public void testValidExactBalanceWithdrawal() {
        setInput("500\n500\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Withdrawal successful. Remaining balance: 0");
    }

    @Test
    public void testValidMinimumPositiveWithdrawal() {
        setInput("500\n1\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Withdrawal successful. Remaining balance: 499");
    }

    @Test
    public void testInvalidImmediateAmountExceedsBalance() {
        setInput("500\n501\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Invalid withdrawal");
    }

    @Test
    public void testInvalidLargeAmountExceedsBalance() {
        setInput("500\n600\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Invalid withdrawal");
    }

    @Test
    public void testInvalidZeroAmount() {
        setInput("500\n0\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Invalid withdrawal");
    }

    @Test
    public void testInvalidImmediateNegativeAmount() {
        setInput("500\n-1\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Invalid withdrawal");
    }

    @Test
    public void testInvalidNegativeAmount() {
        setInput("500\n-50\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Invalid withdrawal");
    }

    @Test
    public void testZeroBalanceCannotWithdrawOne() {
        setInput("0\n1\n");
        BankWithdrawal.main(new String[]{});

        assertResult(outContent.toString(), "Invalid withdrawal");
    }
}
