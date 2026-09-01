# Multiplication Formula

**Exercise:** `part01-Part01_20.MultiplicationFormula`  
**Package:** `part01.s05calculating`

## Spec

Create a program that multiplies the values stored in two integer variables. In the beginning, the user is asked to give two integers that are to be multiplied. The program then prints the formula that describes the multiplication of the numbers.

- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- Output: `first + " * " + second + " = " + (first * second)`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>2<br>8</pre> | <pre>Give the first number:<br>Give the second number:<br>2 * 8 = 16</pre> |
| <pre>277<br>111</pre> | <pre>Give the first number:<br>Give the second number:<br>277 * 111 = 30747</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.MultiplicationFormulaTest"
```
