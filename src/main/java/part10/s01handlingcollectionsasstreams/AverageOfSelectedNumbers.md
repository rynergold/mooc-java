# Average of selected numbers

**Exercise:** `part10-Part10_02.AverageOfSelectedNumbers`
**Package:** `part10.s01handlingcollectionsasstreams`

## Spec

Implement a program, which reads user input. If the user input is "end", program stops reading input. The rest of the input is numbers.

Then user is asked if the program should print the average of all the positive numbers, or the average of all the negative numbers (n or p). If the user selects "n", the average of all the negative numbers is printed. Otherwise the average of all the positive numbers is printed.

Use streams to calculate the average and filter the numbers!

Print the average of the negative numbers or the positive numbers? (n/p)
**n**
Average of the negative numbers: -1.0

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `-1`<br>2. `1`<br>3. `2`<br>4. `end` | `Input numbers, type "end" to stop.`<br>**`-1`**<br>**`1`**<br>**`2`**<br>**`end`** |
| 1. `n`<br>2. `-1`<br>3. `1`<br>4. `2`<br>5. `end` | `Print the average of the negative numbers or the positive numbers? (n/p)`<br>**`n`**<br>`Average of the negative numbers: -1.0`<br>`Input numbers, type "end" to stop.`<br>**`-1`**<br>**`1`**<br>**`2`**<br>**`end`** |
| `p` | `Print the average of the negative numbers or the positive numbers? (n/p)`<br>**`p`**<br>`Average of the positive numbers: 1.5` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s01handlingcollectionsasstreams.AverageOfSelectedNumbersTest"
```
