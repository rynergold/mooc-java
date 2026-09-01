# Sum of Three Numbers

**Exercise:** `part01-Part01_18.SumOfThreeNumbers`  
**Package:** `part01.s05calculating`

## Spec

Write a program that asks the user for three numbers. After this, the program prints the sum of the numbers given by the user.

- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- Third prompt: `"Give the third number:"`
- Output: `"The sum of the numbers is "` followed by the sum.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>8<br>3<br>3</pre> | <pre>Give the first number:<br>Give the second number:<br>Give the third number:<br>The sum of the numbers is 14</pre> |
| <pre>3<br>-1<br>2</pre> | <pre>Give the first number:<br>Give the second number:<br>Give the third number:<br>The sum of the numbers is 4</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.SumOfThreeNumbersTest"
```
