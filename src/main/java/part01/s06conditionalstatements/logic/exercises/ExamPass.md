<div align="right">
  <b>Difficulty:</b> ✪✪ (2/7)
</div>

# Exam Pass

**Category:** Logic Drill (Tier 1)  
**Difficulty:** ✪✪ (2/7)  
**Package:** `part01.s06conditionalstatements.logic.exercises`

## Spec

Write a program that determines whether a student passes a certification exam comprising two components: theory and practical.

- Prompts:
  - `"Enter theory score:"`
  - `"Enter practical score:"`
- Rule: To pass, the student must score at least `50` on the theory component AND at least `50` on the practical component.
- Output:
  - If either score is below 50: print `"Failed"`
  - Otherwise: print `"Passed"`

Practice writing this with a guard clause (rejecting if either part fails).

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>75<br>80</pre> | <pre>Enter theory score:<br>Enter practical score:<br>Passed</pre> |
| <pre>50<br>50</pre> | <pre>Enter theory score:<br>Enter practical score:<br>Passed</pre> |
| <pre>45<br>80</pre> | <pre>Enter theory score:<br>Enter practical score:<br>Failed</pre> |
| <pre>75<br>30</pre> | <pre>Enter theory score:<br>Enter practical score:<br>Failed</pre> |
| <pre>40<br>40</pre> | <pre>Enter theory score:<br>Enter practical score:<br>Failed</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.logic.exercises.ExamPassTest"
```
