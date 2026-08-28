# Index of

**Exercise:** `part03-Part03_10.IndexOf`
**Package:** `part03.s02lists`

## Spec

The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list. If the number is not found, the program should not print anything.

Search for? **2**
2 is at index 1

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `72`<br>2. `2`<br>3. `8`<br>4. `8`<br>5. `11`<br>6. `-1` | **`72`**<br>**`2`**<br>**`8`**<br>**`8`**<br>**`11`**<br>**`-1`** |
| 1. `2`<br>2. `72`<br>3. `2`<br>4. `8`<br>5. `8`<br>6. `11`<br>7. `-1` | Search for? **`2`**<br>`2 is at index 1`<br>**`72`**<br>**`2`**<br>**`8`**<br>**`8`**<br>**`11`**<br>**`-1`** |
| `8` | Search for? **`8`**<br>`8 is at index 2`<br>`8 is at index 3` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.IndexOfTest"
```
