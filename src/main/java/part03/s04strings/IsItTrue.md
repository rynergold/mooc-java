# Is it true

**Exercise:** `part03-Part03_24.IsItTrue`
**Package:** `part03.s04strings`

## Spec

Write a program that asks the user for a string. If the user writes the string "true", the program prints "You got it right!", otherwise it prints "Try again!".

Give a string: **true**
You got it right!

Give a string: **trueish**
Try again!

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `true` | `Give a string:`<br>`You got it right!` |
| `trueish` | `Give a string:`<br>`Try again!` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.IsItTrueTest"
```
