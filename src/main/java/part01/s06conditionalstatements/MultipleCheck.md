# Multiple Check

**Category:** Logic Drill (Tier 1)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for two integers and determines whether either number is a multiple of the other.

- Prompts:
  - `"Enter first number:"`
  - `"Enter second number:"`
- Rules:
  - An integer is a multiple of another if it can be divided evenly with zero remainder.
  - Check if either the first number is a multiple of the second, or the second number is a multiple of the first.
  - Avoid dividing or taking the remainder by zero. If a divisor is zero, it cannot evenly divide another number.
- Output:
  - If either is a multiple of the other: print `"Multiples"`
  - Otherwise: print `"Not multiples"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>12<br>4</pre> | <pre>Enter first number:<br>Enter second number:<br>Multiples</pre> |
| <pre>3<br>15</pre> | <pre>Enter first number:<br>Enter second number:<br>Multiples</pre> |
| <pre>7<br>5</pre> | <pre>Enter first number:<br>Enter second number:<br>Not multiples</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.MultipleCheckTest"
```
