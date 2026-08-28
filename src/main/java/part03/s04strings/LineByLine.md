# Line by line

**Exercise:** `part03-Part03_26.LineByLine`
**Package:** `part03.s04strings`

## Spec

Write a program that reads strings from the user. If the input is empty, the program stops reading input and halts. For each non-empty input it splits the string input by whitespaces ` ` and prints each part of the string on a new line.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `once upon a time`<br>2. `a little program`<br>3. `halted` | **`once upon a time`**<br>`once`<br>`upon`<br>`a`<br>`time`<br>**`a little program`**<br>`a`<br>`little`<br>`program`<br>**`halted`**<br>`halted` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.LineByLineTest"
```
