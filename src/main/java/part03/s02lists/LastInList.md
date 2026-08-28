# Last in list

**Exercise:** `part03-Part03_05.LastInList`
**Package:** `part03.s02lists`

## Spec

In the exercise template there is a program that reads inputs from the user and adds them to a list. Reading is stopped once the user enters an empty string.

Your task is to modify the method to print the last read value after it stops reading. Print the value that was read last from the list. Use the method that tells the size of a list to help you.

Mary

****

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. Tom<br>2. Emma<br>3. Alex<br>4. Mary</pre> | *(No output)* |
| <pre>1. Juno<br>2. Elizabeth<br>3. Mason<br>4. Irene<br>5. Olivia<br>6. Liam<br>7. Ida<br>8. Christopher<br>9. Mark<br>10. Sylvester<br>11. Oscar</pre> | <pre>Mary</pre> |
| Program execution | <pre>Oscar</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.LastInListTest"
```
