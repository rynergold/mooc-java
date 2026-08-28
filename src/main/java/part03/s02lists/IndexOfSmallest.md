# Index of smallest

**Exercise:** `part03-Part03_11.IndexOfSmallest`
**Package:** `part03.s02lists`

## Spec

Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

Smallest number: 2
Found at index: 1

**72**
**44**
**8**
**8**
**11**
**9999**

Hint: combine the programs you wrote for the exercises "Greatest number in the list" and "Index of the requested number". First find the smallest number, and then find the index of that number.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `72`<br>2. `2`<br>3. `8`<br>4. `8`<br>5. `11`<br>6. `9999` | **`72`**<br>**`2`**<br>**`8`**<br>**`8`**<br>**`11`**<br>**`9999`** |
| 1. `72`<br>2. `44`<br>3. `8`<br>4. `8`<br>5. `11`<br>6. `9999` | `Smallest number: 2`<br>`Found at index: 1`<br>**`72`**<br>**`44`**<br>**`8`**<br>**`8`**<br>**`11`**<br>**`9999`** |
| Program execution | `Smallest number: 8`<br>`Found at index: 2`<br>`Found at index: 3` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.IndexOfSmallestTest"
```
