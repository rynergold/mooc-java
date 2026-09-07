<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Speed Camera

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program for an automated highway camera that detects speed violations.

- Prompt: `"Enter vehicle speed:"`
- Legal Zone: Speeds from `40` to `100` km/h inclusive are within legal limits. Vehicles traveling under `40` km/h obstruct traffic; vehicles traveling over `100` km/h speed.
- Output:
  - If outside `[40, 100]`: print `"Speed violation"`
  - Otherwise: print `"Speed normal"`

Practice using an early-return guard clause.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `65` | <pre>Enter vehicle speed:<br>Speed normal</pre> |
| `40` | <pre>Enter vehicle speed:<br>Speed normal</pre> |
| `100` | <pre>Enter vehicle speed:<br>Speed normal</pre> |
| `35` | <pre>Enter vehicle speed:<br>Speed violation</pre> |
| `120` | <pre>Enter vehicle speed:<br>Speed violation</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.SpeedCameraTest"
```
