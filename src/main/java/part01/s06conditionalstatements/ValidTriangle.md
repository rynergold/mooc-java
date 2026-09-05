# Valid Triangle

**Category:** Logic Drill (Tier 1)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for three integers representing side lengths and determines whether they can form a valid triangle.

- Prompts:
  - `"Enter first side:"`
  - `"Enter second side:"`
  - `"Enter third side:"`
- Triangle Rule: Three lengths can form a triangle if and only if all side lengths are strictly positive (greater than zero) and the sum of any two sides is strictly greater than the third side (this must hold for all three combinations of sides).
- Output:
  - If the sides can form a triangle: print `"Valid triangle"`
  - Otherwise: print `"Invalid triangle"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3<br>4<br>5</pre> | <pre>Enter first side:<br>Enter second side:<br>Enter third side:<br>Valid triangle</pre> |
| <pre>1<br>2<br>5</pre> | <pre>Enter first side:<br>Enter second side:<br>Enter third side:<br>Invalid triangle</pre> |
| <pre>0<br>4<br>4</pre> | <pre>Enter first side:<br>Enter second side:<br>Enter third side:<br>Invalid triangle</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.ValidTriangleTest"
```
