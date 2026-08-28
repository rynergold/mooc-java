# Number of Strings

**Exercise:** `part04-Part04_21.NumberOfStrings`
**Package:** `part04.s03filesandreadingdata`

## Spec

Write a program that reads strings from the user until the user inputs the string "end". At that point, the program should print how many strings have been read. The string "end" should not be included in the number strings read. You can find some examples below of how the program works.

**I**
**have**
**a**
**feeling**
**that**
**I**
**have**
**written**
**this**
**wrong**
**before**
**end**
11

**end**
0

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `I`<br>2. `have`<br>3. `a`<br>4. `feeling`<br>5. `that`<br>6. `I`<br>7. `have`<br>8. `written`<br>9. `this`<br>10. `wrong`<br>11. `before`<br>12. `end`<br>13. `end` | **`I`**<br>**`have`**<br>**`a`**<br>**`feeling`**<br>**`that`**<br>**`I`**<br>**`have`**<br>**`written`**<br>**`this`**<br>**`wrong`**<br>**`before`**<br>**`end`**<br>`11`<br>**`end`**<br>`0` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s03filesandreadingdata.NumberOfStringsTest"
```
