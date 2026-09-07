<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Working Hours

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.drills.exercises`

## Spec

Write a program that prompts the user for an hour of the day (in 24-hour format: `0` to `23`) and reports office status.

- Prompt: `"Enter hour (0-23):"`
- Office Schedule: The office is open from `9` to `17` (5 PM) inclusive.
- Output:
  - If outside `[9, 17]`: print `"Office closed"`
  - Otherwise: print `"Office open"`

Practice writing this with an early guard clause.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `10` | <pre>Enter hour (0-23):<br>Office open</pre> |
| `9` | <pre>Enter hour (0-23):<br>Office open</pre> |
| `17` | <pre>Enter hour (0-23):<br>Office open</pre> |
| `8` | <pre>Enter hour (0-23):<br>Office closed</pre> |
| `18` | <pre>Enter hour (0-23):<br>Office closed</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.drills.exercises.WorkingHoursTest"
```
