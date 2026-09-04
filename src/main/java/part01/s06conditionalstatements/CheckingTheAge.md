# Checking the Age

**Exercise:** `part01-Part01_35.CheckingTheAge`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user to input their age and checks whether or not it is possible (at least 0 and at most 120).

- Prompt: `"How old are you?"`
- Condition: If age is between `0` and `120` inclusive (`age >= 0 && age <= 120`), print `"OK"`
- Otherwise: print `"Impossible!"`
- Requirement: Use only a single `if`-statement (with an `else` branch) using logical operators.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>10</pre> | <pre>How old are you?<br>OK</pre> |
| <pre>55</pre> | <pre>How old are you?<br>OK</pre> |
| <pre>-3</pre> | <pre>How old are you?<br>Impossible!</pre> |
| <pre>150</pre> | <pre>How old are you?<br>Impossible!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.CheckingTheAgeTest"
```
