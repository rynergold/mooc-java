# Remember these numbers

**Exercise:** `part03-Part03_07.RememberTheseNumbers`
**Package:** `part03.s02lists`

## Spec

The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

Expand the functionality of the program so that after reading the numbers, it prints all the numbers received from the user. The number used to indicate stopping should not be printed.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. 72<br>2. 2<br>3. 8<br>4. 11<br>5. -1</pre> | <pre>72<br>2<br>8<br>11</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.RememberTheseNumbersTest"
```
