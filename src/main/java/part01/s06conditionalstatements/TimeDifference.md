# Time Difference

**Category:** Logic Drill (Tier 3)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for a start time and an end time on a 24-hour clock and calculates the total duration in hours and minutes.

- Prompts:
  - `"Enter start hour:"`
  - `"Enter start minute:"`
  - `"Enter end hour:"`
  - `"Enter end minute:"`
- Rules:
  - Valid hours are 0 to 23; valid minutes are 0 to 59.
  - The end time occurs either later on the same day, or on the next day (always within 24 hours of the start time).
  - If the end time is numerically earlier than the start time (e.g. 22:00 to 02:00), the event crossed midnight into the next day.
- Output: `"Duration: X hours and Y minutes"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>9<br>30<br>11<br>45</pre> | <pre>Enter start hour:<br>Enter start minute:<br>Enter end hour:<br>Enter end minute:<br>Duration: 2 hours and 15 minutes</pre> |
| <pre>22<br>50<br>1<br>20</pre> | <pre>Enter start hour:<br>Enter start minute:<br>Enter end hour:<br>Enter end minute:<br>Duration: 2 hours and 30 minutes</pre> |
| <pre>14<br>15<br>14<br>15</pre> | <pre>Enter start hour:<br>Enter start minute:<br>Enter end hour:<br>Enter end minute:<br>Duration: 0 hours and 0 minutes</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.TimeDifferenceTest"
```
