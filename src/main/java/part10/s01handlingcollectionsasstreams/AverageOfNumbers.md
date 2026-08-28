# Average of Numbers

**Exercise:** `part10-Part10_01.AverageOfNumbers`
**Package:** `part10.s01handlingcollectionsasstreams`

## Spec

Implement a program, which reads user input. If the user input is "end", the program stops reading input. The rest of the input is numbers. When the user input is "end", the program prints the average of all of the numbers.

Implement calculating the average using a stream!

Input numbers, type "end" to stop.
**2**
**4**
**6**
**end**
average of the numbers: 4.0

Input numbers, type "end" to stop.
**-1**
**1**
**2**
**end**
average of the numbers: 0.6666666666666666

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `2`<br>2. `4`<br>3. `6`<br>4. `end`<br>5. `-1`<br>6. `1`<br>7. `2`<br>8. `end` | `Input numbers, type "end" to stop.`<br>**`2`**<br>**`4`**<br>**`6`**<br>**`end`**<br>`average of the numbers: 4.0`<br>`Input numbers, type "end" to stop.`<br>**`-1`**<br>**`1`**<br>**`2`**<br>**`end`**<br>`average of the numbers: 0.6666666666666666` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s01handlingcollectionsasstreams.AverageOfNumbersTest"
```
