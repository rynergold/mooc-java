<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Temperature Alert

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program for a pharmaceutical storage refrigerator that monitors temperature.

- Prompt: `"Enter temperature:"`
- Safe Range: The temperature is normal if and only if it is between `2` and `8` degrees inclusive.
- Output:
  - If out of safe range: print `"Temperature alarm!"`
  - Otherwise: print `"Temperature normal"`

Practice using a guard clause: check for the alarm condition first and exit early.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `5` | <pre>Enter temperature:<br>Temperature normal</pre> |
| `2` | <pre>Enter temperature:<br>Temperature normal</pre> |
| `8` | <pre>Enter temperature:<br>Temperature normal</pre> |
| `1` | <pre>Enter temperature:<br>Temperature alarm!</pre> |
| `9` | <pre>Enter temperature:<br>Temperature alarm!</pre> |
| `-3` | <pre>Enter temperature:<br>Temperature alarm!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.TemperatureAlertTest"
```
