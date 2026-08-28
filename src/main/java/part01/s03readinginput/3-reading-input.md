---
path: '/part-1/3-reading'
title: 'Reading input'
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Write a program that reads text entered by a user.
> - Understand string variables and string literals in Java.
> - Concatenate strings together using the `+` operator.

## Reading Input

Input refers to text provided by the user that the program reads during execution. Input in Java is read as a string.

To read input from the console, use the `Scanner` class provided in `java.util`.

1. **Import the class**: Add `import java.util.Scanner;` before your class declaration.
2. **Instantiate the Scanner**: Create the reader with `Scanner scanner = new Scanner(System.in);`.
3. **Read a line**: Call `scanner.nextLine()` to wait for user input.

```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String message = scanner.nextLine();

        System.out.println(message);
    }
}
```

**Sample Output**
```text
Write a message:
**Hello world**
Hello world
```

> [!NOTE]
> **Execution Blocks for Input**
> When the JVM reaches `scanner.nextLine()`, execution halts until the user types input and presses **Enter**. The entered text is then returned as a string.

👉 **Ready?** Open [Message.md](./Message.md) / [Message.java](./Message.java)

---

## Fundamentals of Strings

A **string** is a sequence of characters. In Java, text is stored and manipulated using the `String` type.

### Declaring and Assigning Strings

Declare a string variable by specifying the type `String` and a variable name:

```java
String message = "Hello world!";
System.out.println(message);
```

**Sample Output**
```text
Hello world!
```

### String Literals vs. Variable Identifiers

* **String Literal**: Text enclosed in double quotes (e.g. `"Hello world!"`).
* **Variable Identifier**: The name referencing the string container (e.g. `message`).

If you put quotes around the variable name (e.g. `System.out.println("message");`), Java prints the literal text `message` instead of the value stored in the variable.

### String Concatenation

Use the `+` operator to join strings together:

```java
public class Program {

    public static void main(String[] args) {
        String start = "My name is ";
        String end = ", James Bond";

        System.out.println(start + "Bond" + end);
    }
}
```

**Sample Output**
```text
My name is Bond, James Bond
```

👉 **Ready?** Open [HiAdaLovelace.md](./HiAdaLovelace.md) / [HiAdaLovelace.java](./HiAdaLovelace.java)

---

## Reading Strings and Reusing Variables

When `scanner.nextLine()` reads a line, assign it to a variable so you can use it multiple times throughout your program:

```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String message = scanner.nextLine();

        System.out.println(message);
        System.out.println(message);
    }
}
```

**Sample Output**
```text
Write a message:
**Repeat this**
Repeat this
Repeat this
```

👉 **Ready?** Open [MessageThreeTimes.md](./MessageThreeTimes.md) / [MessageThreeTimes.java](./MessageThreeTimes.java)

---

## Combining Input and Output

You can concatenate user input directly with string literals to produce customized output:

```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something: ");
        String message = scanner.nextLine();

        System.out.println("You wrote " + message);
    }
}
```

**Sample Output**
```text
Write something:
**Java**
You wrote Java
```

👉 **Ready?** Open [Greeting.md](./Greeting.md) / [Greeting.java](./Greeting.java)

---

## Sequential Inputs

Each call to `scanner.nextLine()` reads the next full line of input from the user. You can store sequential inputs in distinct variables:

```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first string:");
        String first = scanner.nextLine();

        System.out.println("Write the second string:");
        String second = scanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(first);
        System.out.println(second);
    }
}
```

👉 **Ready?** Open [Conversation.md](./Conversation.md) / [Conversation.java](./Conversation.java)

---

## Dynamic Text Composition

Once inputs are captured in separate variables, you can reference and combine them in any order:

```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first string:");
        String first = scanner.nextLine();
        System.out.println("Write the second string:");
        String second = scanner.nextLine();
        System.out.println("Write the third string:");
        String third = scanner.nextLine();

        System.out.println("Last string: " + third);
        System.out.println("Preceded by: " + second);
        System.out.println("First string: " + first);
        System.out.println("All together: " + first + second + third);
    }
}
```

👉 **Ready?** Open [Story.md](./Story.md) / [Story.java](./Story.java)

---

## Official Documentation

* **Scanner Class**: [Oracle Java SE Javadoc (Scanner)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html) - Technical specification for token scanning and input streams.
* **String Class**: [Oracle Java SE Javadoc (String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html) - Official reference for immutable character strings.
* **Scanner Guide**: [Baeldung - Java Scanner Guide](https://www.baeldung.com/java-scanner) - Practical walkthrough of console reading and common pitfalls.
* **String Concatenation**: [Baeldung - Java String Concatenation](https://www.baeldung.com/java-string-concatenation) - Under-the-hood look at the `+` operator and string joining.
