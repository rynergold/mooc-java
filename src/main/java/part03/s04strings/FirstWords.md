# First words

**Exercise:** `part03-Part03_28.FirstWords`
**Package:** `part03.s04strings`

## Spec

Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces ` `  and prints the first part of the string.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `one two three four`<br>2. `this is a very important message` | **`one two three four`**<br>`one`<br>**`this is a very important message`**<br>`this` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.FirstWordsTest"
```
