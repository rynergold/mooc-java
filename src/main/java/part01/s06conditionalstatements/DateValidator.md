# Date Validator

**Category:** Logic Drill (Tier 4)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for three integers representing a day, month, and year, and determines whether it represents a valid calendar date in the Gregorian calendar.

- Prompts:
  - `"Enter day:"`
  - `"Enter month:"`
  - `"Enter year:"`
- Calendar Rules:
  - Year must be strictly positive (greater than 0).
  - Month must be between 1 and 12 inclusive.
  - Day must be at least 1, and cannot exceed the maximum days for that specific month:
    - Months with 31 days: 1 (January), 3 (March), 5 (May), 7 (July), 8 (August), 10 (October), 12 (December).
    - Months with 30 days: 4 (April), 6 (June), 9 (September), 11 (November).
    - February (month 2): 29 days in a leap year, and 28 days in a common year.
- Output:
  - If all values constitute a real date: print `"Valid date"`
  - Otherwise: print `"Invalid date"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>29<br>2<br>2020</pre> | <pre>Enter day:<br>Enter month:<br>Enter year:<br>Valid date</pre> |
| <pre>29<br>2<br>2021</pre> | <pre>Enter day:<br>Enter month:<br>Enter year:<br>Invalid date</pre> |
| <pre>31<br>4<br>2022</pre> | <pre>Enter day:<br>Enter month:<br>Enter year:<br>Invalid date</pre> |
| <pre>15<br>8<br>1995</pre> | <pre>Enter day:<br>Enter month:<br>Enter year:<br>Valid date</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.DateValidatorTest"
```
