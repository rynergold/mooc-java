# Printing a Specified File

**Exercise:** `part04-Part04_25.PrintingASpecifiedFile`
**Package:** `part04.s03filesandreadingdata`

## Spec

Write a program that asks the user for a string, and then prints the contents of a file with a name matching the string provided. You may assume that the user provides a file name that the program can find.

The exercise template contains the files "data.txt" and "song.txt", which you may use when testing the functionality of your program. The output of the program can be seen below for when a user has entered the string "song.txt". The content that is printed comes from the file "song.txt". Naturally, the program should also work with other filenames, assuming the file can be found.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| `song.txt` | `Which file should have its contents printed?`<br>**`song.txt`**<br>`No option for duality`<br>`The old is where we come`<br>`Clockspeed is fast, but we'll survive`<br>`The new will overcome`<br>`We are challengers, not followers`<br>`We take the ball to build`<br>`Easy safe services`<br>`Are here to stay` |
| Program execution | `Value for society`<br>`Value for life`<br>`For you and me`<br>`Tieto is here allright!` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s03filesandreadingdata.PrintingASpecifiedFileTest"
```
