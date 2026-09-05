# Orwell

**Exercise:** `part01-Part01_26.Orwell`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for an integer and prints `"Orwell"` if the number is exactly 1984.

- Prompt: `"Give a number:"`
- If the number is equal to 1984: print `"Orwell"`
- Otherwise: do not print anything further.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1983</pre> | <pre>Give a number:</pre> |
| <pre>1984</pre> | <pre>Give a number:<br>Orwell</pre> |
| <pre>2024</pre> | <pre>Give a number:</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.OrwellTest"
```
