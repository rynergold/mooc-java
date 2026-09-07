---
path: "/part-1/3-reading"
title: "Reading Input"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Import and initialize the `Scanner` tool to read user input from the keyboard (`System.in`).
> - Read full lines of text into `String` variables with `scanner.nextLine()`.
> - Combine strings and text literals using the concatenation operator (`+`).
> - Sequence prompts and input reads to build interactive console programs.

---

## 1. How Java Reads User Input

Console applications receive user data through standard input (`System.in`). To read input as text, Java provides the `Scanner` tool in the `java.util` library:

```java
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a search term:");
        String search = scanner.nextLine();

        System.out.println("Searching for: " + search);
    }
}
```

### Key Terminology Explained

- **`import java.util.Scanner;`**: Tells the compiler where to find Java's built-in `Scanner` tool.
- **`Scanner scanner = new Scanner(System.in);`**: Creates an input reader attached to standard input (`System.in`), which represents the keyboard.
- **`scanner.nextLine()`**: A command that pauses program execution until the user types something into the console and presses <kbd>Enter</kbd>. It returns the typed text as a `String`.
- **Concatenation (`+`)**: Joining two or more pieces of text together into one continuous string.

> [!TIP]
> **Modern Java Note: Resource Management**
> In production Java, readers attached to external files or networks implement `AutoCloseable` and are closed using a `try-with-resources` block. For console applications reading from `System.in`, you do not need to call `scanner.close()`. Closing a scanner attached to `System.in` closes standard input for the entire application, preventing any future input reads.

---

## 2. Reading and Combining Input

### Example 1: Reading and Reusing Input

Reading a value from the user and storing it in a variable:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your destination city:");
String destination = scanner.nextLine();

System.out.println("Destination recorded: " + destination);
```

Because the value is stored in the variable `destination`, you can reuse it in multiple places without asking the user to type it again:

```java
System.out.println("Boarding pass issued for: " + destination);
System.out.println("Luggage tag printed for: " + destination);
```

#### Practice (✪ 1/7)

- **✪** [Message.md](./exercises/Message.md) / [Message.java](./exercises/Message.java) — Read and echo a single string
- **✪** [MessageThreeTimes.md](./exercises/MessageThreeTimes.md) / [MessageThreeTimes.java](./exercises/MessageThreeTimes.java) — Reuse an input variable across multiple print statements

---

### Example 2: String Variables and Concatenation

Strings represent sequences of characters. The `+` operator joins two strings together:

```java
String prefix = "Project-";
String code = "Apollo";
System.out.println(prefix + code); // Output: Project-Apollo
```

You can combine variables directly with literal text:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your department name:");
String department = scanner.nextLine();

System.out.println("Welcome to the " + department + " division!");
```

#### Practice (✪ 1/7)

- **✪** [HiAdaLovelace.md](./exercises/HiAdaLovelace.md) / [HiAdaLovelace.java](./exercises/HiAdaLovelace.java) — Concatenate literal text with a string variable
- **✪** [Greeting.md](./exercises/Greeting.md) / [Greeting.java](./exercises/Greeting.java) — Read user name and print a personalized greeting

---

### Example 3: Reading Multiple Values and Combining Strings

Each call to `scanner.nextLine()` reads one line of input. To collect several pieces of information, call `scanner.nextLine()` once for each required value:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter package item:");
String item = scanner.nextLine();

System.out.println("Enter destination country:");
String country = scanner.nextLine();

System.out.println("Dispatching order: " + item + " to " + country + ".");
```

Input:
```text
Microscope
Finland
```

Output:
```text
Dispatching order: Microscope to Finland.
```

Storing distinct values in separate variables lets you assemble complete multi-line messages:

```java
System.out.println("Notice: Shipment containing " + item + " is confirmed.");
System.out.println("Customs clearance scheduled upon arrival in " + country + ".");
```

#### Practice (✪ 1/7)

- **✪** [Conversation.md](./exercises/Conversation.md) / [Conversation.java](./exercises/Conversation.java) — Two-step interactive conversational prompt sequence
- **✪** [Story.md](./exercises/Story.md) / [Story.java](./exercises/Story.java) — Sequential inputs assembled into a multi-line story
- **✪** [MadLibs.md](./exercises/MadLibs.md) / [MadLibs.java](./exercises/MadLibs.java) — Assembling a narrative from multiple user responses

---

## 3. Common Input Pitfalls

- **Missing Import Statement:** Forgetting `import java.util.Scanner;` produces a compiler error:
  ```
  cannot find symbol: class Scanner
  ```
- **Quoting Variable Names:** Writing `System.out.println("department")` prints the literal word `"department"`. To print the value stored inside the variable, omit quotes: `System.out.println(department)`.
- **Inverted Prompt Order:** Calling `scanner.nextLine()` before printing the prompt causes the program to pause with an empty screen, leaving the user unsure what to type.
- **Missing Spacing in Concatenation:** Writing `"Welcome " + department` needs a space so words do not run together.

---

## Official Documentation

- **Scanner Class:** [Oracle Java SE Javadoc (Scanner)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html)
- **String Class:** [Oracle Java SE Javadoc (String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html)
- **String Concatenation Operator (`+`):** [Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/jls-15.html#jls-15.18.1)\n