# Average of Two Numbers

**Exercise:** `part01-Part01_21.AverageOfTwoNumbers`  
**Package:** `part01.s05calculating`

## Spec

Write a program that asks the user for two integers and prints their average.

- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- Output: `"The average is "` followed by the calculated floating-point average (e.g. `5.0`).

> [!NOTE]
> Integer division in Java discards the decimal remainder (e.g. `3 / 2` evaluates to `1`). To get a floating-point result, at least one operand must be a floating-point number (e.g. `(double) first / second` or `1.0 * (first + second) / 2`).

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>8<br>2</pre> | <pre>Give the first number:<br>Give the second number:<br>The average is 5.0</pre> |
| <pre>9<br>2</pre> | <pre>Give the first number:<br>Give the second number:<br>The average is 4.5</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.AverageOfTwoNumbersTest"
```
