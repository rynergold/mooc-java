<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Discount Eligibility

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program that determines public transport discount eligibility based on passenger age.

- Prompt: `"Enter age:"`
- Rule: Passengers qualify for a discount if they are youth (strictly under `18`) OR senior (`65` and older).
- Output:
  - If eligible for discount: print `"Discount applied"`
  - Otherwise: print `"Standard price"`

Practice combining conditions with `||`.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `15` | <pre>Enter age:<br>Discount applied</pre> |
| `65` | <pre>Enter age:<br>Discount applied</pre> |
| `70` | <pre>Enter age:<br>Discount applied</pre> |
| `18` | <pre>Enter age:<br>Standard price</pre> |
| `40` | <pre>Enter age:<br>Standard price</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.DiscountEligibilityTest"
```
