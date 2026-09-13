# Century and Year Type

**Category:** Logic Drill (Tier 3)  
**Difficulty:** ✪✪✪ (3/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program that prompts the user for a positive year, determines its century, and identifies whether the year is a leap year or a common year.

- Prompt: `"Enter year:"`
- Century Calculation:
  - The calendar starts at year 1 (there is no year 0). Each century spans exactly 100 years.
  - A century ends on a year ending in `00`. The next century starts on a year ending in `01`:
    - 1st century: years 1 through 100
    - 19th century: years 1801 through 1900 (1900 is the final year of the 19th century)
    - 20th century: years 1901 through 2000 (2000 is the final year of the 20th century)
    - 21st century: years 2001 through 2100 (2001 begins the 21st century)
  - Formula:
    - If the year ends in `00` (`year % 100 == 0`), the century is `year / 100`.
    - Otherwise, the century is `(year / 100) + 1`.
    - Or as a single expression: `(year - 1) / 100 + 1`.
- Leap Year Rules:
  - Divisible by 4: Leap year.
  - Exception for century years (`year % 100 == 0`): Must also be divisible by 400 to be a leap year (e.g. 1900 is a Common year; 2000 is a Leap year).
  - All other years: Common year.
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
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.CenturyAndYearTypeTest"
```
