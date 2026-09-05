# Cinema Ticket

**Category:** Logic Drill (Tier 2)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that calculates cinema ticket pricing based on age and day of the week.

- Prompts:
  - `"Enter age:"`
  - `"Enter day:"`
- Pricing Rules:
  - Children under 5: Free (`"Price: 0€"`)
  - Seniors aged 65 or older: 8€ (`"Price: 8€"`)
  - Regular patrons (ages 5 to 64 inclusive):
    - On `"Wednesday"`: discount price of 9€ (`"Price: 9€"`)
    - On all other days: standard price of 12€ (`"Price: 12€"`)
- Output format: `"Price: "` followed by the amount and `€` (e.g. `Price: 12€`).

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>4<br>Saturday</pre> | <pre>Enter age:<br>Enter day:<br>Price: 0€</pre> |
| <pre>25<br>Friday</pre> | <pre>Enter age:<br>Enter day:<br>Price: 12€</pre> |
| <pre>25<br>Wednesday</pre> | <pre>Enter age:<br>Enter day:<br>Price: 9€</pre> |
| <pre>70<br>Wednesday</pre> | <pre>Enter age:<br>Enter day:<br>Price: 8€</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.CinemaTicketTest"
```
