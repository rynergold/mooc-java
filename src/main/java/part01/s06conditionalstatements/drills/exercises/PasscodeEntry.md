<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Passcode Entry

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.drills.exercises`

## Spec

Write a program that prompts the user for a 4-digit integer PIN.

- Prompt: `"Enter 4-digit PIN:"`
- Rule: A PIN is valid if and only if it is between `1000` and `9999` inclusive.
- Output:
  - If valid: `"Access granted"`
  - If invalid: `"Invalid PIN"`

Practice writing this with a guard clause (rejecting bad inputs early).

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `1234` | <pre>Enter 4-digit PIN:<br>Access granted</pre> |
| `999` | <pre>Enter 4-digit PIN:<br>Invalid PIN</pre> |
| `10000` | <pre>Enter 4-digit PIN:<br>Invalid PIN</pre> |
| `-500` | <pre>Enter 4-digit PIN:<br>Invalid PIN</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.drills.exercises.PasscodeEntryTest"
```
