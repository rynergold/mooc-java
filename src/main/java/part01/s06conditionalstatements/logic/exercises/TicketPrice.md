<div align="right">
  <b>Difficulty:</b> ✪ (1/7)
</div>

# Ticket Price

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪ (1/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program that determines the ticket price based on age.

- Prompt: `"Enter age:"`
- Rules:
  - If age is strictly less than `12`: print `"Ticket price: 5 euros"`
  - Otherwise: print `"Ticket price: 10 euros"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| `8` | <pre>Enter age:<br>Ticket price: 5 euros</pre> |
| `12` | <pre>Enter age:<br>Ticket price: 10 euros</pre> |
| `25` | <pre>Enter age:<br>Ticket price: 10 euros</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.TicketPriceTest"
```
