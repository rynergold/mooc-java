# Television programs

**Exercise:** `part04-Part04_19.TelevisionPrograms`
**Package:** `part04.s02objectsinalist`

## Spec

In the exercise template there is a ready-made class TelevisionProgram, representing a television program. The class has object variables name and duration, a constructor, and a few methods.

Implement a program that begins by reading television programs from the user. When the user inputs an empty string as the name of the program, the program stops reading programs.

After this the user is queried for a maximum duration. Once the maximum is given, the program proceeds to list all the programs whose duration is smaller or equal to the specified maximum duration.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `Rick and Morty`<br>2. `25`<br>3. `Two and a Half Men`<br>4. `30`<br>5. `Love it or list it`<br>6. `60`<br>7. `House`<br>8. `60` | Name:<br>Duration:<br>Name:<br>Duration:<br>Name:<br>Duration:<br>Name:<br>Duration: |
| `30` | Program's maximum duration?<br>`Rick and Morty, 25 minutes`<br>`Two and a Half Men, 30 minutes` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s02objectsinalist.TelevisionProgramsTest"
```
