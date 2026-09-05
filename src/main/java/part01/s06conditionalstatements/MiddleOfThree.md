# Middle of Three

**Category:** Logic Drill (Tier 4)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for three integers and prints the middle (median) value without using arrays or sorting methods.

- Prompts:
  - `"Enter first number:"`
  - `"Enter second number:"`
  - `"Enter third number:"`
- Rules:
  - The middle number is the value that would sit in the center if the three numbers were placed in numerical order.
  - Your program must properly handle duplicate values (e.g. if two numbers are identical, that shared value could be the middle).
- Output: `"The middle number is: "` followed by the value.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>10<br>5<br>20</pre> | <pre>Enter first number:<br>Enter second number:<br>Enter third number:<br>The middle number is: 10</pre> |
| <pre>7<br>15<br>3</pre> | <pre>Enter first number:<br>Enter second number:<br>Enter third number:<br>The middle number is: 7</pre> |
| <pre>5<br>5<br>2</pre> | <pre>Enter first number:<br>Enter second number:<br>Enter third number:<br>The middle number is: 5</pre> |
| <pre>4<br>4<br>4</pre> | <pre>Enter first number:<br>Enter second number:<br>Enter third number:<br>The middle number is: 4</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.MiddleOfThreeTest"
```
