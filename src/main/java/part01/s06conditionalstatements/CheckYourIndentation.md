# Check Your Indentation

**Exercise:** `part01-Part01_25.CheckYourIndentation`  
**Package:** `part01.s06conditionalstatements`

## Spec

The starter code in `CheckYourIndentation.java` demonstrates a conditional statement comparing two numbers, but it has incorrect indentation.

Your goal is to inspect and correct the indentation so that every code block is indented with 4 spaces and braces follow standard Java conventions.

The program logic:
- First prompt: `"Give the first number:"`
- Second prompt: `"Give the second number:"`
- If `first == second`: print `"Same!"`
- Else if `first > second`: print `"The first was larger than the second!"`
- Else: print `"The second was larger than the first!"`

> [!TIP]
> In your IDE, you can automatically format the active file:
> - **macOS:** `Option + Shift + F` or `Control + Shift + F` (IntelliJ: `Option + Command + L`)
> - **Linux / Windows:** `Alt + Shift + F` (IntelliJ: `Ctrl + Alt + L`)

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>5<br>5</pre> | <pre>Give the first number:<br>Give the second number:<br>Same!</pre> |
| <pre>7<br>3</pre> | <pre>Give the first number:<br>Give the second number:<br>The first was larger than the second!</pre> |
| <pre>2<br>9</pre> | <pre>Give the first number:<br>Give the second number:<br>The second was larger than the first!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.CheckYourIndentationTest"
```
