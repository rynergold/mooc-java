# Personal information

**Exercise:** `part04-Part04_18.PersonalInformation`
**Package:** `part04.s02objectsinalist`

## Spec

The program described here should be implemented in the class `PersonalInformationCollection`. **NB!** Do not modify the class `PersonalInformation`.

After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.

Then print the collected personal information so that each entered object is printed in the following format: first and last names separated by a space (you don't print the identification number). An example of the working program is given below:

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `Jean`<br>2. `Bartik`<br>3. `271224`<br>4. `Betty`<br>5. `Holberton`<br>6. `070317` | First name: **`Jean`**<br>Last name: **`Bartik`**<br>Identification number: **`271224`**<br>First name: **`Betty`**<br>Last name: **`Holberton`**<br>Identification number: **`070317`**<br>`First name:` |
| Program execution | `Jean Bartik`<br>`Betty Holberton` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s02objectsinalist.PersonalInformationTest"
```
