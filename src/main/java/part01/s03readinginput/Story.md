# Story

**Exercise:** `part01-Part01_10.Story`  
**Package:** `part01.s03readinginput`

## Spec

Write a program that prompts the user for a character's name and their job, then prints a short 3-line story using those inputs.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `Bob`<br>2. `a builder` | `I will tell you a story, but I need some information first.`<br>`What is the main character called?`<br>`What is their job?`<br>`Here is the story:`<br>`Once upon a time there was Bob, who was a builder.`<br>`On the way to work, Bob reflected on life.`<br>`Perhaps Bob will not be a builder forever.` |
| 1. `Ada`<br>2. `a Data scientist` | `I will tell you a story, but I need some information first.`<br>`What is the main character called?`<br>`What is their job?`<br>`Here is the story:`<br>`Once upon a time there was Ada, who was a Data scientist.`<br>`On the way to work, Ada reflected on life.`<br>`Perhaps Ada will not be a Data scientist forever.` |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s03readinginput.StoryTest"
```
