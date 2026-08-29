# Double Input

**Exercise:** `part01-Part01_13.DoubleInput`  
**Package:** `part01.s04variables`

## Spec

Write a program that prompts the user with `"Give a number:"`, reads a floating-point number using `Double.valueOf(scanner.nextLine())`, and prints `"You gave the number "` followed by the double value.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3.14</pre> | <pre>Give a number:<br>You gave the number 3.14</pre> |
| <pre>2.718</pre> | <pre>Give a number:<br>You gave the number 2.718</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s04variables.DoubleInputTest"
```
