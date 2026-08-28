# Checking the age

**Exercise:** `part01-Part01_35.CheckingTheAge`
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user to input their age and checks whether or not it is possible (at least 0 and at most 120). Only use a single `if`-command in your program.

How old are you? **10**
OK

How old are you? **55**
OK

How old are you? **-3**
Impossible!

How old are you? **150**
Impossible!

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `10`<br>2. `55`<br>3. `-3`<br>4. `150` | How old are you? **`10`**<br>`OK`<br>How old are you? **`55`**<br>`OK`<br>How old are you? **`-3`**<br>`Impossible!`<br>How old are you? **`150`**<br>`Impossible!` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.CheckingTheAgeTest"
```
