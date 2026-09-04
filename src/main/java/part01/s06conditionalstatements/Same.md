# Same

**Exercise:** `part01-Part01_34.Same`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for two strings. If the strings are identical, the program prints `"Same"`. Otherwise, it prints `"Different"`.

- First prompt: `"Enter the first string:"`
- Second prompt: `"Enter the second string:"`
- If the strings are identical: print `"Same"`
- Otherwise: print `"Different"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>hello<br>hello</pre> | <pre>Enter the first string:<br>Enter the second string:<br>Same</pre> |
| <pre>hello<br>world</pre> | <pre>Enter the first string:<br>Enter the second string:<br>Different</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.SameTest"
```
