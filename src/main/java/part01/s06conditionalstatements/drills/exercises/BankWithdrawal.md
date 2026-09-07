<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Bank Withdrawal

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.drills.exercises`

## Spec

Write a program that simulates an ATM withdrawal with validation.

- Prompts:
  - `"Enter current balance:"`
  - `"Enter withdrawal amount:"`
- Rules:
  - The withdrawal amount must be strictly greater than `0`.
  - The withdrawal amount must not exceed the current balance.
- Output:
  - If either condition fails: print `"Invalid withdrawal"`
  - Otherwise: deduct the amount and print `"Withdrawal successful. Remaining balance: <remaining>"`

Practice implementing this using a guard clause with De Morgan's Law.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>500<br>200</pre> | <pre>Enter current balance:<br>Enter withdrawal amount:<br>Withdrawal successful. Remaining balance: 300</pre> |
| <pre>500<br>500</pre> | <pre>Enter current balance:<br>Enter withdrawal amount:<br>Withdrawal successful. Remaining balance: 0</pre> |
| <pre>500<br>600</pre> | <pre>Enter current balance:<br>Enter withdrawal amount:<br>Invalid withdrawal</pre> |
| <pre>500<br>0</pre> | <pre>Enter current balance:<br>Enter withdrawal amount:<br>Invalid withdrawal</pre> |
| <pre>500<br>-50</pre> | <pre>Enter current balance:<br>Enter withdrawal amount:<br>Invalid withdrawal</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.drills.exercises.BankWithdrawalTest"
```
