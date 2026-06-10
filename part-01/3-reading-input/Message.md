# Message

**Exercise:** `part01-Part01_05.Message`
**Section:** Part 01 / 3-reading-input
**Course:** https://java-programming.mooc.fi/part-1/3-reading-input

## Spec

Write a program that asks the user to write a string. When the user has provided a string (i.e., written some text and pressed the enter key), the program should print the string that was provided by the user.

The exercise template comes with a program template that includes the creation of a Scanner tool.

```java
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        // Write your program here
    }
}
```

Example output for when the user writes "Bye".

Write a message:
**Bye**
Bye

Example output for when the user writes "Once upon a time...".

Write a message:
**Once upon a time...**
Once upon a time...

## Expected Output

```
Write a message:
**Bye**
Bye
Write a message:
**Once upon a time...**
Once upon a time...
```
