<div align="right">
  <b>Difficulty:</b> ✪ (1/7)
</div>

# Positivity

**Exercise:** `part01-Part01_28.Positivity`  
**Difficulty:** ✪ (1/7)  
**Package:** `part01.s06conditionalstatements.exercises`

## Spec

Write a program that prompts the user for an integer and informs the user whether or not it is positive (greater than zero).

- Prompt: `"Give a number:"`
- If the number is positive (greater than zero): print `"The number is positive."`
- Otherwise: print `"The number is not positive."`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>5</pre> | <pre>Give a number:<br>The number is positive.</pre> |
| <pre>-2</pre> | <pre>Give a number:<br>The number is not positive.</pre> |
| <pre>0</pre> | <pre>Give a number:<br>The number is not positive.</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.exercises.PositivityTest"
```
