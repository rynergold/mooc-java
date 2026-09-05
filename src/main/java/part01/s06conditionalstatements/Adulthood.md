# Adulthood

**Exercise:** `part01-Part01_29.Adulthood`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for their age and tells them whether or not they are an adult (18 years old or older).

- Prompt: `"How old are you?"`
- If the age is 18 or older: print `"You are an adult"`
- Otherwise: print `"You are not an adult"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>12</pre> | <pre>How old are you?<br>You are not an adult</pre> |
| <pre>18</pre> | <pre>How old are you?<br>You are an adult</pre> |
| <pre>32</pre> | <pre>How old are you?<br>You are an adult</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.AdulthoodTest"
```
