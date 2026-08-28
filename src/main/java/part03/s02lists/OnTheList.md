# On the list?

**Exercise:** `part03-Part03_14.OnTheList`
**Package:** `part03.s02lists`

## Spec

In the exercise template there is a program that reads inputs from the user until an empty string is entered. Add the following functionality to it: after reading the inputs one more string is requested from the user. The program then tell whether that string was found in the list or not.

Search for? **Mary**
Mary was found!

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. Tom<br>2. Emma<br>3. Alex<br>4. Mary</pre> | *(No output)* |
| <pre>1. Mary<br>2. Tom<br>3. Emma<br>4. Alex<br>5. Mary</pre> | <pre>Search for?<br>Mary was found!</pre> |
| <pre>Logan</pre> | <pre>Search for?<br>Logan was not found!</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.OnTheListTest"
```
