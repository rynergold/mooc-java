# Personal details

**Exercise:** `part03-Part03_32.PersonalDetails`
**Package:** `part03.s04strings`

## Spec

Write a program that reads names and birth years from the user until an empty line is entered. The  name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years. If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.

Longest name: sebastian
Average of the birth years: 2014.8

**sauli,1948**
**tarja,1943**
**martti,1936**
**mauno,1923**
**urho,1900**

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `sebastian,2017`<br>2. `lucas,2017`<br>3. `lily,2017`<br>4. `hanna,2014`<br>5. `gabriel,2009` |  |
| 1. `sauli,1948`<br>2. `tarja,1943`<br>3. `martti,1936`<br>4. `mauno,1923`<br>5. `urho,1900` | `Longest name: sebastian`<br>`Average of the birth years: 2014.8` |
| Program execution | `Longest name: martti`<br>`Average of the birth years: 1930.0` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.PersonalDetailsTest"
```
