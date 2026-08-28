# Average of positive numbers

**Exercise:** `part08-Part08_02.AverageOfPositiveNumbers`
**Package:** `part08.s01recap`

## Spec

Write a program that asks user for input until the user inputs 0.
After this, the program prints the average of the positive numbers (numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the average"

Below a few examples of the program's output

**3**
**5**
**1**
**-3**
**0**
3.0

**0**
Cannot calculate the average

**-3**
**1**
**0**
1.0

**1**
**1**
**0**
1.0

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `3`<br>2. `5`<br>3. `1`<br>4. `-3`<br>5. `0`<br>6. `0`<br>7. `-3`<br>8. `1`<br>9. `0`<br>10. `1`<br>11. `1`<br>12. `0` | **`3`**<br>**`5`**<br>**`1`**<br>**`-3`**<br>**`0`**<br>`3.0`<br>**`0`**<br>`Cannot calculate the average`<br>**`-3`**<br>**`1`**<br>**`0`**<br>`1.0`<br>**`1`**<br>**`1`**<br>**`0`**<br>`1.0` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part08.s01recap.Part08AverageOfPositiveNumbersTest"
```
