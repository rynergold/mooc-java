<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Valid Score

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program that prompts the user for an integer score and determines whether it falls within the valid range `[0, 100]`.

- Prompt: `"Enter score:"`
- Rule: A score is valid if and only if it is between `0` and `100` inclusive.
- Output:
  - If valid: print `"Valid score"`
  - If invalid: print `"Invalid score"`

Practice writing this with a guard clause (using De Morgan's Law to exit early if out of bounds).

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `75` | <pre>Enter score:<br>Valid score</pre> |
| `0` | <pre>Enter score:<br>Valid score</pre> |
| `100` | <pre>Enter score:<br>Valid score</pre> |
| `101` | <pre>Enter score:<br>Invalid score</pre> |
| `-5` | <pre>Enter score:<br>Invalid score</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.ValidScoreTest"
```
