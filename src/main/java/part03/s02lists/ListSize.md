# List size

**Exercise:** `part03-Part03_04.ListSize`
**Package:** `part03.s02lists`

## Spec

In the exercise template is a program that reads input from the user. Modify its working so that when the program quits reading, the program prints the number of values on the list.

In total: 4

**NB!** Be sure to use the `size` method of the list.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. Tom<br>2. Emma<br>3. Alex<br>4. Mary</pre> | *(No output)* |
| <pre>1. Juno<br>2. Elizabeth<br>3. Mason<br>4. Irene<br>5. Olivia<br>6. Liam<br>7. Ida<br>8. Christopher<br>9. Mark<br>10. Sylvester<br>11. Oscar</pre> | <pre>In total: 4</pre> |
| Program execution | <pre>In total: 11</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.ListSizeTest"
```
