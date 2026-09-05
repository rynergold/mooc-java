# Century and Year Type

**Category:** Logic Drill (Tier 3)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for a positive year, determines its century, and identifies whether the year is a leap year or a common year.

- Prompt: `"Enter year:"`
- Century Rule:
  - The 1st century spans years 1 through 100.
  - The 20th century spans years 1901 through 2000.
  - The 21st century spans years 2001 through 2100.
- Year Type Rule:
  - Leap year: Divisible by 4, except century years which must also be divisible by 400.
  - Common year: All other years.
- Output format: `"Century: X, Type: <Leap year / Common year>"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1984</pre> | <pre>Enter year:<br>Century: 20, Type: Leap year</pre> |
| <pre>1900</pre> | <pre>Enter year:<br>Century: 19, Type: Common year</pre> |
| <pre>2000</pre> | <pre>Enter year:<br>Century: 20, Type: Leap year</pre> |
| <pre>2023</pre> | <pre>Enter year:<br>Century: 21, Type: Common year</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.CenturyAndYearTypeTest"
```
