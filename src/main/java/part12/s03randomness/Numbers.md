# Numbers

**Exercise:** `part12-Part12_06.Numbers`
**Package:** `part12.s03randomness`

## Spec

Write a program that prompts the user for how many random numbers should be generated and then prints the numbers. The printed numbers should be within the range `[0, 10]`.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| `4` | `How many random numbers should be printed?`<br>**`4`**<br>`9`<br>`1`<br>`4`<br>`3` |
| `8` | `How many random numbers should be printed?`<br>**`8`**<br>`9`<br>`6`<br>`0`<br>`9`<br>`10`<br>`7`<br>`3`<br>`3` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part12.s03randomness.NumbersTest"
```
