# Only these numbers

**Exercise:** `part03-Part03_08.OnlyTheseNumbers`
**Package:** `part03.s02lists`

## Spec

The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

Expand the program to ask for a start and end indices once it has finished asking for numbers. After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive). You may assume that the user gives indices that match some numbers in the list.

**72**
**2**
**8**
**11**
**-1**
From where? **1**
To where? **2**
2
8

**72**
**2**
**8**
**11**
**-1**
From where? **0**
To where? **2**
72
2
8

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `72`<br>2. `2`<br>3. `8`<br>4. `11`<br>5. `-1`<br>6. `1`<br>7. `2`<br>8. `72`<br>9. `2`<br>10. `8`<br>11. `11`<br>12. `-1`<br>13. `0`<br>14. `2` | From where?<br>To where?<br>`2`<br>`8`<br>From where?<br>To where?<br>`72`<br>`2`<br>`8` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.OnlyTheseNumbersTest"
```
