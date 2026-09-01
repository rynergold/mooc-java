# Simple Calculator

**Exercise:** `part01-Part01_23.SimpleCalculator`  
**Package:** `part01.s05calculating`

## Spec

Write a program that asks the user for two numbers and prints their sum, difference, product, and quotient.

- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- Prints:
  1. `first + " + " + second + " = " + (first + second)`
  2. `first + " - " + second + " = " + (first - second)`
  3. `first + " * " + second + " = " + (first * second)`
  4. `first + " / " + second + " = " + ((double) first / second)`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>8<br>2</pre> | <pre>Give the first number:<br>Give the second number:<br>8 + 2 = 10<br>8 - 2 = 6<br>8 * 2 = 16<br>8 / 2 = 4.0</pre> |
| <pre>9<br>2</pre> | <pre>Give the first number:<br>Give the second number:<br>9 + 2 = 11<br>9 - 2 = 7<br>9 * 2 = 18<br>9 / 2 = 4.5</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.SimpleCalculatorTest"
```
