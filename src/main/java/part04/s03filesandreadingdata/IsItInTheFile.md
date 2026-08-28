# Is it in the file?

**Exercise:** `part04-Part04_27.IsItInTheFile`
**Package:** `part04.s03filesandreadingdata`

## Spec

The exercise template comes with two files, `names.txt` and `other-names.txt`. Write a program that first asks the user for the name of the file to be read, after which the user is prompted for the string that they're looking for. The program then reads the file and searches for the desired string.

If the string is found, the program should print "Found!". If not, the program should print "Not found.". If reading the file fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.".

Name of the file:
Search for:
Not found.

Name of the file:
Search for:
Found!

Name of the file:
Search for:
Reading the file nonexistent.txt failed.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `names.txt`<br>2. `Antti`<br>3. `names.txt`<br>4. `ada`<br>5. `nonexistent.txt`<br>6. `test` | `Name of the file:`<br>`Search for:`<br>`Not found.`<br>`Name of the file:`<br>`Search for:`<br>`Found!`<br>`Name of the file:`<br>`Search for:`<br>`Reading the file nonexistent.txt failed.` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s03filesandreadingdata.IsItInTheFileTest"
```
