# Larger Than or Equal To

**Exercise:** `part01-Part01_30.LargerThanOrEqualTo`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are equal, the program informs the user about this.

- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- If `first > second`: print `"Greater number is: " + first`
- Else if `second > first`: print `"Greater number is: " + second`
- Else: print `"The numbers are equal!"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>5<br>3</pre> | <pre>Give the first number:<br>Give the second number:<br>Greater number is: 5</pre> |
| <pre>5<br>8</pre> | <pre>Give the first number:<br>Give the second number:<br>Greater number is: 8</pre> |
| <pre>5<br>5</pre> | <pre>Give the first number:<br>Give the second number:<br>The numbers are equal!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.LargerThanOrEqualToTest"
```
