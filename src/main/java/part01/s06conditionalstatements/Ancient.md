# Ancient

**Exercise:** `part01-Part01_27.Ancient`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for a year. If the user inputs a number that is smaller than 2015, the program prints `"Ancient history!"`.

- Prompt: `"Give a year:"`
- If year < 2015: print `"Ancient history!"`
- Otherwise: do not print anything further.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>2017</pre> | <pre>Give a year:</pre> |
| <pre>2013</pre> | <pre>Give a year:<br>Ancient history!</pre> |
| <pre>2015</pre> | <pre>Give a year:</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.AncientTest"
```
