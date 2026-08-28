# First and last

**Exercise:** `part03-Part03_06.FirstAndLast`
**Package:** `part03.s02lists`

## Spec

In the exercise template there is a program that reads inputs from the user and adds them to a list. Reading is stopped once the user enters an empty string.

Modify the program to print both the first and the last values after the reading ends. You may suppose that at least two values are read into the list.

Tom
Mary

**Juno**
**Elizabeth**
**Mason**
**Irene**
**Olivia**
**Liam**
**Ida**
**Christopher**
**Mark**
**Sylvester**
**Oscar**

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `Tom`<br>2. `Emma`<br>3. `Alex`<br>4. `Mary` |  |
| 1. `Juno`<br>2. `Elizabeth`<br>3. `Mason`<br>4. `Irene`<br>5. `Olivia`<br>6. `Liam`<br>7. `Ida`<br>8. `Christopher`<br>9. `Mark`<br>10. `Sylvester`<br>11. `Oscar` | `Tom`<br>`Mary` |
| Program execution | `Juno`<br>`Oscar` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.FirstAndLastTest"
```
