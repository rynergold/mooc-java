# Numbers From a File

**Exercise:** `part04-Part04_28.NumbersFromAFile`
**Package:** `part04.s03filesandreadingdata`

## Spec

Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers. Then the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range. Finally, the program should print the number of numbers that were inside the given range.

You can convert a string-type integer read from a file into a proper integer using the command `Integer.valueOf` (just as when handling input from a user).

File? **numbers-1.txt**
Lower bound? **15**
Upper bound? **20**
Numbers: 2

File? **numbers-1.txt**
Lower bound? **0**
Upper bound? **300**
Numbers: 4

**NB**! The exercise template comes with two files, `numbers-1.txt` and `numbers-2.txt` that have the following contents. Do not change the contents of these files.

numbers-1.txt:

300
9
20
15

numbers-2.txt:

123
-5
12
67
-300
1902

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `numbers-1.txt`<br>2. `15`<br>3. `20`<br>4. `numbers-1.txt`<br>5. `0`<br>6. `300` | `File?`<br>`Lower bound?`<br>`Upper bound?`<br>`Numbers: 2`<br>`File?`<br>`Lower bound?`<br>`Upper bound?`<br>`Numbers: 4` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s03filesandreadingdata.NumbersFromAFileTest"
```
