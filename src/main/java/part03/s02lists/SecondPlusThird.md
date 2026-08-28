# Second plus third

**Exercise:** `part03-Part03_02.SecondPlusThird`
**Package:** `part03.s02lists`

## Spec

In the exercise template there is a program that reads integers from the user and adds them to a list. This ends when the user enters 0. The program then prints the first value on the list.

Modify the program so that instead of the first value, the program prints the sum of the second and third numbers. The program is allowed to malfunction if there are fewer than three entries on the list, so you don't need to prepare for such an event at all.

**1**
**3**
**5**
**7**
**0**
8

**2**
**3**
**4**
**0**
7

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `1`<br>2. `3`<br>3. `5`<br>4. `7`<br>5. `0`<br>6. `2`<br>7. `3`<br>8. `4`<br>9. `0` | `8`<br>`7` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.SecondPlusThirdTest"
```
