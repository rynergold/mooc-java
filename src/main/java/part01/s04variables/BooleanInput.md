# Boolean Input

**Exercise:** `part01-Part01_14.BooleanInput`  
**Package:** `part01.s04variables`

## Spec

Write a program that prompts the user with `"Write something:"`, reads a boolean value using `Boolean.valueOf(scanner.nextLine())`, and prints `"True or false? "` followed by the parsed boolean.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>santa does not exist</pre> | <pre>Write something:<br>True or false? false</pre> |
| <pre>TRUE</pre> | <pre>Write something:<br>True or false? true</pre> |
| <pre>true</pre> | <pre>Write something:<br>True or false? true</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s04variables.BooleanInputTest"
```
