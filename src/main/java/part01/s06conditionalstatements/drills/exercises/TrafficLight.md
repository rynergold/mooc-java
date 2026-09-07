<div align="right">
  <b>Difficulty:</b> ✪ (1/7)
</div>

# Traffic Light

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪ (1/7)  
**Package:** `part01.s06conditionalstatements.drills.exercises`

## Spec

Write a program that prompts the user for a traffic light color and instructs what action to take.

- Prompt: `"Enter traffic light color:"`
- Rules (use `.equals()` for string comparisons):
  - If `"red"`: print `"Stop"`
  - Else if `"yellow"`: print `"Slow down"`
  - Else if `"green"`: print `"Go"`
  - Otherwise: print `"Invalid color"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `red` | <pre>Enter traffic light color:<br>Stop</pre> |
| `yellow` | <pre>Enter traffic light color:<br>Slow down</pre> |
| `green` | <pre>Enter traffic light color:<br>Go</pre> |
| `blue` | <pre>Enter traffic light color:<br>Invalid color</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.drills.exercises.TrafficLightTest"
```
