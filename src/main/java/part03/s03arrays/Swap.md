# Swap

**Exercise:** `part03-Part03_18.Swap`
**Package:** `part03.s03arrays`

## Spec

The exercise template already contains a program, that creates an array and prints the values of the array twice. Modify the program to do following: After the first printing, the program should ask for two indices from the user. The values in these two indices should be swapped, and in the end the values of the array should be printed once again.

1
3
9
7
5

You can assume that the array contains the given indices.
Tip! You'll need an additional variable to store one of the values for a little while.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `1`<br>`3`<br>`5`<br>`7`<br>`9` |
| 1. `2`<br>2. `4` | `Give two indices to swap:`<br>**`2`**<br>**`4`** |
| Program execution | `1`<br>`3`<br>`9`<br>`7`<br>`5`<br>`1`<br>`3`<br>`5`<br>`7`<br>`9` |
| 1. `0`<br>2. `1` | `Give two indices to swap:`<br>**`0`**<br>**`1`** |
| Program execution | `3`<br>`1`<br>`5`<br>`7`<br>`9` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s03arrays.SwapTest"
```
