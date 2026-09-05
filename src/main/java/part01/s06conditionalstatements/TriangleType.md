# Triangle Type

**Category:** Logic Drill (Tier 2)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for three integer side lengths, verifies whether they form a valid triangle, and classifies the triangle type.

- Prompts:
  - `"Enter side 1:"`
  - `"Enter side 2:"`
  - `"Enter side 3:"`
- Rules:
  - If the three sides cannot form a valid triangle, print `"Not a triangle"`.
  - Otherwise, classify the valid triangle:
    - If all three sides are equal: print `"Equilateral"`
    - If exactly two sides are equal: print `"Isosceles"`
    - If all three sides have different lengths: print `"Scalene"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>5<br>5<br>5</pre> | <pre>Enter side 1:<br>Enter side 2:<br>Enter side 3:<br>Equilateral</pre> |
| <pre>5<br>5<br>8</pre> | <pre>Enter side 1:<br>Enter side 2:<br>Enter side 3:<br>Isosceles</pre> |
| <pre>3<br>4<br>5</pre> | <pre>Enter side 1:<br>Enter side 2:<br>Enter side 3:<br>Scalene</pre> |
| <pre>1<br>2<br>10</pre> | <pre>Enter side 1:<br>Enter side 2:<br>Enter side 3:<br>Not a triangle</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.TriangleTypeTest"
```
