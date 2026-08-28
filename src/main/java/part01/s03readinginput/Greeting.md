# Greeting

**Exercise:** `part01-Part01_08.Greeting`
**Package:** `part01.s03readinginput`

## Spec

Write a program that prompts the user for their name with the message "What's your name?". When the user has written their name, the program has to print "Hi " followed by the user's name.

The exercise template already includes the code that creates the `Scanner` tool.

```java
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
    }
}
```

Example output when user gives the name Ada.

What's your name?
**Ada**
Hi Ada

Example output when user gives the name Lily.

What's your name?
**Lily**
Hi Lily

## Expected Output

```
What's your name?
**Ada**
Hi Ada
What's your name?
**Lily**
Hi Lily
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part01.s03readinginput.GreetingTest"
```
