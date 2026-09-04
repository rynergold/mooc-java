# Leap Year

**Exercise:** `part01-Part01_36.LeapYear`  
**Package:** `part01.s06conditionalstatements`

## Spec

A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

Write a program that reads a year from the user and checks whether or not it is a leap year.

- Prompt: `"Give a year:"`
- If leap year: print `"The year is a leap year."`
- Otherwise: print `"The year is not a leap year."`

> [!TIP]
> A year is a leap year if:
> `year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)`  
> Alternatively, you can structure this using an `if - else if - else` decision tree.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>2011</pre> | <pre>Give a year:<br>The year is not a leap year.</pre> |
| <pre>2012</pre> | <pre>Give a year:<br>The year is a leap year.</pre> |
| <pre>1800</pre> | <pre>Give a year:<br>The year is not a leap year.</pre> |
| <pre>2000</pre> | <pre>Give a year:<br>The year is a leap year.</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.LeapYearTest"
```
