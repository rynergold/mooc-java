# Range Overlap

**Category:** Logic Drill (Tier 3)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for four integers representing two closed intervals on a 1D number line: $[start_1, end_1]$ and $[start_2, end_2]$. The program determines whether the two intervals overlap.

- Prompts:
  - `"Enter start 1:"`
  - `"Enter end 1:"`
  - `"Enter start 2:"`
  - `"Enter end 2:"`
- Rules:
  - Assume each interval is properly ordered ($start \le end$).
  - Two intervals overlap if they share at least one common number (touching at endpoints counts as an overlap, e.g. $[2, 5]$ and $[5, 9]$ share the number 5).
- Output:
  - If they share any common numbers: print `"Overlapping"`
  - Otherwise: print `"Disjoint"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1<br>5<br>3<br>8</pre> | <pre>Enter start 1:<br>Enter end 1:<br>Enter start 2:<br>Enter end 2:<br>Overlapping</pre> |
| <pre>1<br>4<br>5<br>10</pre> | <pre>Enter start 1:<br>Enter end 1:<br>Enter start 2:<br>Enter end 2:<br>Disjoint</pre> |
| <pre>2<br>6<br>6<br>9</pre> | <pre>Enter start 1:<br>Enter end 1:<br>Enter start 2:<br>Enter end 2:<br>Overlapping</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.RangeOverlapTest"
```
