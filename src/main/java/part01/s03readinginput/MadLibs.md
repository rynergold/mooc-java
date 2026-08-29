# Mad Libs (Extension Drill)

**Exercise:** `part01-Part01_Drill_01.MadLibs`  
**Package:** `part01.s03readinginput`

## Spec

Write a program that prompts the user for 4 pieces of information in this exact order:
1. `"Give an adjective:"`
2. `"Give a noun:"`
3. `"Give a past-tense verb:"`
4. `"Give a quote or shout:"`

After gathering all 4 inputs, the program prints the completed Mad Libs adventure using the exact formatting shown below.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>noisy<br>rubber duck<br>debugged<br>The JVM ran out of memory!</pre> | <pre>Give an adjective:<br>Give a noun:<br>Give a past-tense verb:<br>Give a quote or shout:<br>--- Mad Libs Adventure ---<br>Today, a noisy rubber duck debugged into the server room.<br>It shouted: "The JVM ran out of memory!"</pre> |
| <pre>mysterious<br>Java compiler<br>crashed<br>NullPointerException strikes again!</pre> | <pre>Give an adjective:<br>Give a noun:<br>Give a past-tense verb:<br>Give a quote or shout:<br>--- Mad Libs Adventure ---<br>Today, a mysterious Java compiler crashed into the server room.<br>It shouted: "NullPointerException strikes again!"</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s03readinginput.MadLibsTest"
```
