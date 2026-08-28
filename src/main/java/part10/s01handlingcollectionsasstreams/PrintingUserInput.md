# Printing User Input

**Exercise:** `part10-Part10_05.PrintingUserInput`
**Package:** `part10.s01handlingcollectionsasstreams`

## Spec

Write a program that reads the user's input as strings. When the user inputs an empty string (only presses enter), the input reading will be stopped and the program will print all the user inputs.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `first`<br>2. `second`<br>3. `war is peace: 1984` | **`first`**<br>**`second`**<br>**`war is peace: 1984`** |
| Program execution | `first`<br>`second`<br>`war is peace: 1984` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s01handlingcollectionsasstreams.PrintingUserInputTest"
```
