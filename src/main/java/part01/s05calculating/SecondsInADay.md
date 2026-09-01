# Seconds in a Day

**Exercise:** `part01-Part01_16.SecondsInADay`  
**Package:** `part01.s05calculating`

## Spec

Write a program that asks the user for the number of days. After that, the program prints the number of seconds in the given number of days.

- Prompt: `"How many days would you like to convert to seconds?"`
- The program reads an integer from the user.
- The program calculates and prints the number of seconds in those days.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1</pre> | <pre>How many days would you like to convert to seconds?<br>86400</pre> |
| <pre>3</pre> | <pre>How many days would you like to convert to seconds?<br>259200</pre> |
| <pre>7</pre> | <pre>How many days would you like to convert to seconds?<br>604800</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.SecondsInADayTest"
```
