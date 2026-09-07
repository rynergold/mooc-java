---
path: "/part-1/3-reading"
title: "Reading Input"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Import and initialize the `Scanner` tool for reading user input from standard input (`System.in`).
> - Read full lines of text into `String` variables with `scanner.nextLine()`.
> - Combine string variables and literals using the concatenation operator (`+`).
> - Sequence prompts and input reads to build interactive console programs.

---

## 1. How Java Reads User Input

Console applications receive user data through standard input (`System.in`). To read input as text, Java provides the `Scanner` utility in the `java.util` package:

```java
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String message = scanner.nextLine();

        System.out.println(message);
    }
}
```

### Execution Steps
1. **Import:** `import java.util.Scanner;` tells the compiler where to find the `Scanner` class.
2. **Instantiate:** `Scanner scanner = new Scanner(System.in);` creates the input reader connected to your keyboard stream.
3. **Blocking Read:** When execution reaches `scanner.nextLine()`, the program halts and waits for the user to type text and press <kbd>Enter</kbd>.
4. **Variable Assignment:** The text is returned as a `String` and stored in the variable `message`.

---

## 2. Progressive Input Techniques

### Example 1: Reading and Echoing Input

Reading a single line and printing it back to the console:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Write a message: ");
String message = scanner.nextLine();

System.out.println(message);
```

Assigning input to a variable allows you to reference and print the value multiple times without re-reading:

```java
System.out.println(message);
System.out.println(message);
```

#### Practice (✪ 1/7)

- **✪** [Message.md](./exercises/Message.md) / [Message.java](./exercises/Message.java) — Read and echo a single string
- **✪** [MessageThreeTimes.md](./exercises/MessageThreeTimes.md) / [MessageThreeTimes.java](./exercises/MessageThreeTimes.java) — Reuse input variable across multiple print statements

---

### Example 2: String Variables and Concatenation

Strings represent sequences of characters. The `+` operator concatenates (joins) two strings together into one:

```java
String greeting = "Hi ";
String name = "Ada";
System.out.println(greeting + name); // Output: Hi Ada
```

You can combine string variables directly with literal strings:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("What is your name?");
String name = scanner.nextLine();

System.out.println("Hi " + name);
```

#### Practice (✪ 1/7)

- **✪** [HiAdaLovelace.md](./exercises/HiAdaLovelace.md) / [HiAdaLovelace.java](./exercises/HiAdaLovelace.java) — Concatenate literal text with a string variable
- **✪** [Greeting.md](./exercises/Greeting.md) / [Greeting.java](./exercises/Greeting.java) — Read user name and print custom greeting

---

### Example 3: Sequential Inputs & Multi-Variable Interpolation

Each call to `scanner.nextLine()` reads the next line of input. To collect multiple pieces of information, call `scanner.nextLine()` once for each required value:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name:");
String name = scanner.nextLine();

System.out.println("Enter your title:");
String title = scanner.nextLine();

System.out.println("Character: " + name + ", the " + title);
```

Input:
```text
Bob
Builder
```

Output:
```text
Character: Bob, the Builder
```

Storing distinct values in separate variables lets you assemble complete multi-line narratives:

```java
System.out.println("Once upon a time there was " + name + ",");
System.out.println("who worked as a " + title + ".");
```

#### Practice (✪ 1/7)

- **✪** [Conversation.md](./exercises/Conversation.md) / [Conversation.java](./exercises/Conversation.java) — Two-step interactive conversational prompt sequence
- **✪** [Story.md](./exercises/Story.md) / [Story.java](./exercises/Story.java) — Sequential inputs interpolated into multi-line narrative
- **✪** [MadLibs.md](./exercises/MadLibs.md) / [MadLibs.java](./exercises/MadLibs.java) — Multi-token narrative template interpolation

---

## 3. Common Input Pitfalls

- **Missing Import Statement:** Omitting `import java.util.Scanner;` produces a compiler error:
  ```
  cannot find symbol: class Scanner
  ```
- **Quoting Variable Names:** Writing `System.out.println("name")` prints the literal word `"name"`, ignoring the variable's value. To print the variable's contents, omit quotes: `System.out.println(name)`.
- **Inverted Prompt Order:** Calling `scanner.nextLine()` before `System.out.println("Prompt:")` leaves the user staring at a blank console with no instructions.
- **Missing Spacing in Concatenation:** Writing `"Hi" + name` results in `"HiAda"`. Include explicit whitespace inside the string literal: `"Hi " + name`.

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Message | Basic console input with `Scanner` | [Message.md](./exercises/Message.md) | [Message.java](./exercises/Message.java) | `./gradlew test --tests "part01.s03readinginput.exercises.MessageTest"` |
| **Tier 1** | ✪ | Message Three Times | Variable reuse across print calls | [MessageThreeTimes.md](./exercises/MessageThreeTimes.md) | [MessageThreeTimes.java](./exercises/MessageThreeTimes.java) | `./gradlew test --tests "part01.s03readinginput.exercises.MessageThreeTimesTest"` |
| **Tier 1** | ✪ | Hi Ada Lovelace | String concatenation with `+` | [HiAdaLovelace.md](./exercises/HiAdaLovelace.md) | [HiAdaLovelace.java](./exercises/HiAdaLovelace.java) | `./gradlew test --tests "part01.s03readinginput.exercises.HiAdaLovelaceTest"` |
| **Tier 1** | ✪ | Greeting | Input capture with interactive prompt | [Greeting.md](./exercises/Greeting.md) | [Greeting.java](./exercises/Greeting.java) | `./gradlew test --tests "part01.s03readinginput.exercises.GreetingTest"` |
| **Tier 1** | ✪ | Conversation | Multi-turn prompt/response sequence | [Conversation.md](./exercises/Conversation.md) | [Conversation.java](./exercises/Conversation.java) | `./gradlew test --tests "part01.s03readinginput.exercises.ConversationTest"` |
| **Tier 1** | ✪ | Story | Multi-variable interpolation | [Story.md](./exercises/Story.md) | [Story.java](./exercises/Story.java) | `./gradlew test --tests "part01.s03readinginput.exercises.StoryTest"` |
| **Tier 1** | ✪ | Mad Libs | Narrative template composition | [MadLibs.md](./exercises/MadLibs.md) | [MadLibs.java](./exercises/MadLibs.java) | `./gradlew test --tests "part01.s03readinginput.exercises.MadLibsTest"` |

---

## Official Documentation

- **Scanner Class:** [Oracle Java SE Javadoc (Scanner)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html)
- **String Class:** [Oracle Java SE Javadoc (String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html)
- **String Concatenation Operator (`+`):** [Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/jls-15.html#jls-15.18.1)
