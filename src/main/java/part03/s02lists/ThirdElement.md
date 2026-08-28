# Third element

**Exercise:** `part03-Part03_01.ThirdElement`
**Package:** `part03.s02lists`

## Spec

The exercise contains a base that asks the user for strings and adds them to a list. The program stops reading when the user enters an empty string. The program then prints the first element of the list.

Your assignment is to modify the program so that instead of the first value, the third value on the list is printed. Remember that programmers start counting from zero! The program is allowed to malfunction if there are fewer than three entries on the list, so you don't need to prepare for such an event at all.

Alex

****

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. Tom<br>2. Emma<br>3. Alex<br>4. Mary</pre> | *(No output)* |
| <pre>1. Emma<br>2. Alex<br>3. Mary</pre> | <pre>Alex</pre> |
| Program execution | <pre>Mary</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.ThirdElementTest"
```
