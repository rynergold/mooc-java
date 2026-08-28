# Checking the age

**Exercise:** `part01-Part01_35.CheckingTheAge`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user to input their age and checks whether or not it is possible (at least 0 and at most 120). Only use a single `if`-command in your program.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `10` | `How old are you?`<br>`OK` |
| `55` | `How old are you?`<br>`OK` |
| `-3` | `How old are you?`<br>`Impossible!` |
| `150` | `How old are you?`<br>`Impossible!` |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.CheckingTheAgeTest"
```
