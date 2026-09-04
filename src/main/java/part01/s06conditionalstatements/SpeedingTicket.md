# Speeding Ticket

**Exercise:** `part01-Part01_24.SpeedingTicket`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that asks the user for an integer and prints `"Speeding ticket!"` if the input is greater than 120.

- Prompt: `"Give speed:"`
- If speed > 120: print `"Speeding ticket!"`
- Otherwise: do not print anything further.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>15</pre> | <pre>Give speed:</pre> |
| <pre>135</pre> | <pre>Give speed:<br>Speeding ticket!</pre> |
| <pre>120</pre> | <pre>Give speed:</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.SpeedingTicketTest"
```
