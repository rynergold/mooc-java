<div align="right">
  <b>Difficulty:</b> ✪ (1/7)
</div>

# Positive Check

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪ (1/7)  
**Package:** `part01.s06conditionalstatements.drills.exercises`

## Spec

Write a program that prompts the user for an integer and reports whether the number is positive.

- Prompt: `"Give a number:"`
- If the integer is strictly greater than `0`, print `"The number is positive"`
- Otherwise (if `0` or negative), print `"The number is not positive"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `5` | <pre>Give a number:<br>The number is positive</pre> |
| `0` | <pre>Give a number:<br>The number is not positive</pre> |
| `-3` | <pre>Give a number:<br>The number is not positive</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.drills.exercises.PositiveCheckTest"
```
