# Average of Three Numbers

**Exercise:** `part01-Part01_22.AverageOfThreeNumbers`  
**Package:** `part01.s05calculating`

## Spec

Write a program that asks the user for three integers and prints their average.

- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- Third prompt: `"Give the third number:"`
- Output: `"The average is "` followed by the calculated floating-point average.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>8<br>2<br>3</pre> | <pre>Give the first number:<br>Give the second number:<br>Give the third number:<br>The average is 4.333333333333333</pre> |
| <pre>9<br>5<br>-1</pre> | <pre>Give the first number:<br>Give the second number:<br>Give the third number:<br>The average is 4.333333333333333</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.AverageOfThreeNumbersTest"
```
