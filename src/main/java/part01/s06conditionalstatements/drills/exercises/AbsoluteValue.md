<div align="right">
  <b>Difficulty:</b> ✪ (1/7)
</div>

# Absolute Value

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪ (1/7)  
**Package:** `part01.s06conditionalstatements.drills.exercises`

## Spec

Write a program that prompts the user for an integer and prints its absolute value.

The absolute value of a number is its non-negative distance from zero:
- If the input is negative ($n < 0$), multiply it by $-1$ (or negate it).
- If the input is zero or positive, leave it unchanged.

- Prompt: `"Give a number:"`
- Output: Print the resulting integer.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `-5` | <pre>Give a number:<br>5</pre> |
| `12` | <pre>Give a number:<br>12</pre> |
| `0` | <pre>Give a number:<br>0</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.drills.exercises.AbsoluteValueTest"
```
