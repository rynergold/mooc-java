# Addition Formula

**Exercise:** `part01-Part01_19.AdditionFormula`  
**Package:** `part01.s05calculating`

## Spec

Create a program that can be used to add two integers together. In the beginning, the user is asked to give two integers that are to be summed. The program then prints the formula that describes the addition of the numbers.

- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- Output: `first + " + " + second + " = " + (first + second)`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>5<br>4</pre> | <pre>Give the first number:<br>Give the second number:<br>5 + 4 = 9</pre> |
| <pre>73457<br>12888</pre> | <pre>Give the first number:<br>Give the second number:<br>73457 + 12888 = 86345</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.AdditionFormulaTest"
```
