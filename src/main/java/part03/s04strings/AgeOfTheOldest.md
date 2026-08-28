# Age of the oldest

**Exercise:** `part03-Part03_30.AgeOfTheOldest`
**Package:** `part03.s04strings`

## Spec

Write a program that reads names and ages from the user until an empty line is entered. The  name and age are separated by a comma.

After reading all user input, the program prints the age of the oldest person. You can assume that the user enters at least one person, and that one of the users is older than the others.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. sebastian,2<br>2. lucas,2<br>3. lily,1<br>4. hanna,5<br>5. gabriel,10</pre> | <pre>Age of the oldest: 10</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.AgeOfTheOldestTest"
```
