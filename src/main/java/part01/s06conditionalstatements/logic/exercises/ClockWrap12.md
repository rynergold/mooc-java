<div align="right">
  <b>Difficulty:</b> ✪ (1/7)
</div>

# Clock Wrap 12

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪ (1/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program that converts a 24-hour time integer (`0` to `23`) into a 12-hour AM/PM string.

- Prompt: `"Enter hour (0-23):"`
- Rules:
  - If `0`: print `"12 AM"`
  - Else if `12`: print `"12 PM"`
  - Else if `hour < 12`: print `"<hour> AM"` (e.g. `9 AM`)
  - Otherwise (if `hour > 12`): print `"<hour - 12> PM"` (e.g. `14` becomes `2 PM`)

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `0` | <pre>Enter hour (0-23):<br>12 AM</pre> |
| `9` | <pre>Enter hour (0-23):<br>9 AM</pre> |
| `12` | <pre>Enter hour (0-23):<br>12 PM</pre> |
| `17` | <pre>Enter hour (0-23):<br>5 PM</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.ClockWrap12Test"
```
