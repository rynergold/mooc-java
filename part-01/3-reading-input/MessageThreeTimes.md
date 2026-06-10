# Message Three Times

**Exercise:** `part01-Part01_07.MessageThreeTimes`
**Section:** Part 01 / 3-reading-input
**Course:** https://java-programming.mooc.fi/part-1/3-reading-input

## Spec

Write a program that asks the user to write a string. When the user has given a string (that is, written some text and pressed enter), the program must print the user's string three times (you can use the `System.out.println` command multiple times).

The exercise template already includes the code that creates the `Scanner` tool.

```java
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        // Write your program here
    }
}
```

Example output for when the user writes the string "Hi".

Write a message:
**Hi**
Hi
Hi
Hi

Example output when the user writes "Once upon a time...".

Write a message:
**Once upon a time...**
Once upon a time...
Once upon a time...
Once upon a time...

## Expected Output

```
Write a message:
**Hi**
Hi
Hi
Hi
Write a message:
**Once upon a time...**
Once upon a time...
Once upon a time...
Once upon a time...
```
