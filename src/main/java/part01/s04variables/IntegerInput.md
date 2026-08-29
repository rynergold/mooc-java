# Integer Input

**Exercise:** `part01-Part01_12.IntegerInput`  
**Package:** `part01.s04variables`

## Spec

Write a program that prompts the user with `"Give a number:"`, reads an integer using `Integer.valueOf(scanner.nextLine())`, and prints `"You gave the number "` followed by the integer value.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3</pre> | <pre>Give a number:<br>You gave the number 3</pre> |
| <pre>42</pre> | <pre>Give a number:<br>You gave the number 42</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s04variables.IntegerInputTest"
```
