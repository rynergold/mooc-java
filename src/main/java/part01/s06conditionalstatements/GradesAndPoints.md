# Grades and Points

**Exercise:** `part01-Part01_31.GradesAndPoints`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that gives a course grade according to the table below.

| Points | Grade |
| :--- | :--- |
| < 0 | impossible! |
| 0–49 | failed |
| 50–59 | 1 |
| 60–69 | 2 |
| 70–79 | 3 |
| 80–89 | 4 |
| 90–100 | 5 |
| > 100 | incredible! |

- Prompt: `"Give points [0-100]:"`
- Output format: `"Grade: <grade>"` (e.g., `"Grade: failed"`, `"Grade: 3"`, `"Grade: impossible!"`)

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>37</pre> | <pre>Give points [0-100]:<br>Grade: failed</pre> |
| <pre>76</pre> | <pre>Give points [0-100]:<br>Grade: 3</pre> |
| <pre>95</pre> | <pre>Give points [0-100]:<br>Grade: 5</pre> |
| <pre>-3</pre> | <pre>Give points [0-100]:<br>Grade: impossible!</pre> |
| <pre>105</pre> | <pre>Give points [0-100]:<br>Grade: incredible!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.GradesAndPointsTest"
```
