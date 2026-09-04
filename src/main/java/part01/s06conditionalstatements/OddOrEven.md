# Odd or Even

**Exercise:** `part01-Part01_32.OddOrEven`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for a number and informs them whether it is even or odd.

- Prompt: `"Give a number:"`
- If even: print `"Number " + number + " is even."`
- If odd: print `"Number " + number + " is odd."`

> [!TIP]
> The remainder operator (`%`) calculates the remainder after integer division. A number is even if `number % 2 == 0`. Note that in Java, `%` preserves the sign of the dividend, but `number % 2 == 0` evaluates correctly for both positive and negative even integers.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>2</pre> | <pre>Give a number:<br>Number 2 is even.</pre> |
| <pre>7</pre> | <pre>Give a number:<br>Number 7 is odd.</pre> |
| <pre>-4</pre> | <pre>Give a number:<br>Number -4 is even.</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.OddOrEvenTest"
```
