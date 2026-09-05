# Quadrant Finder

**Category:** Logic Drill (Tier 1)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for two integers representing 2D Cartesian coordinates $(x, y)$ and determines where the point lies.

- Prompts:
  - `"Enter x:"`
  - `"Enter y:"`
- Location Rules:
  - If both $x$ and $y$ are zero: print `"Origin"`
  - If either $x$ is zero or $y$ is zero (but not both): print `"Axis"`
  - If both $x$ and $y$ are positive: print `"Quadrant 1"`
  - If $x$ is negative and $y$ is positive: print `"Quadrant 2"`
  - If both $x$ and $y$ are negative: print `"Quadrant 3"`
  - If $x$ is positive and $y$ is negative: print `"Quadrant 4"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3<br>5</pre> | <pre>Enter x:<br>Enter y:<br>Quadrant 1</pre> |
| <pre>-4<br>2</pre> | <pre>Enter x:<br>Enter y:<br>Quadrant 2</pre> |
| <pre>0<br>0</pre> | <pre>Enter x:<br>Enter y:<br>Origin</pre> |
| <pre>0<br>-7</pre> | <pre>Enter x:<br>Enter y:<br>Axis</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.QuadrantFinderTest"
```
