---
path: "/part-1/1-starting-programming"
title: "Getting Started with Programming"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Understand how human-readable Java source code is compiled and run on the Java Virtual Machine (JVM).
> - Identify the core parts of a Java program: packages, classes, and the `main` method.
> - Print text to the console using `System.out.println()`.
> - Diagnose beginner syntax errors including missing semicolons, capitalization mistakes, and unmatched curly braces.

---

## 1. How Java Executes Code

Computers execute instructions expressed as binary machine code (sequences of 0s and 1s). Because writing binary instructions directly is impractical, programmers write instructions in high-level programming languages such as **Java**.

Java uses a two-step process to run your code:

```
[Source Code (.java)]
        │
        ▼  javac (Java Compiler)
[Bytecode (.class)]
        │
        ▼  java (Java Virtual Machine / JVM)
[Machine Code (CPU)]
```

### Key Terminology Explained

- **Source Code (`.java` file):** The text instructions you write in a programming language. Java source code is read line by line, from top to bottom, and from left to right.
- **Compiler (`javac`):** A program that reads your source code, checks it for syntax errors, and translates it into an intermediate format called **bytecode**.
- **Bytecode (`.class` file):** A compact set of instructions designed for the Java Virtual Machine rather than any single physical computer.
- **Java Virtual Machine (JVM / `java`):** The program that loads bytecode and translates it into native machine code for your specific computer and operating system.

Because bytecode runs on any system with a compatible JVM installed, Java programs follow the principle: write once, run anywhere.

> [!TIP]
> **Modern Java Note (Java 11+)**
> Traditionally, running a Java program requires two command-line steps: compiling with `javac Sandbox.java` to generate `Sandbox.class`, then executing with `java Sandbox`. Starting in Java 11, you can run single-file source code directly with one command: `java Sandbox.java`. The JVM compiles the code in memory and executes it immediately, which is convenient when testing small ideas in a sandbox.

---

## 2. Structure of a Java Program

Every Java program requires a standard frame of code around its instructions:

```java
package part01.s01startingprogramming;

public class Sandbox {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Parts of the Program Frame

- **`package`**: Groups related classes together into a folder-based namespace (`part01/s01startingprogramming`).
- **`public class Sandbox`**: In Java, all code belongs inside a class. When a class is declared `public`, its name must match the `.java` file name exactly (`Sandbox.java`).
- **`public static void main(String[] args)`**: The **entry point** of the program. When you run a Java program, execution begins at the first statement inside `main`.
- **`{ ... }` (Curly Braces)**: Define code blocks. Every opening brace `{` must have a matching closing brace `}`.
- **`System.out.println(...)`**: A built-in command that outputs the text provided inside the parentheses to the console, followed by a new line.
- **`;` (Semicolon)**: Terminates a statement. In Java, every individual command must end with a semicolon.
- **`"Hello World"` (String Literal)**: Text data enclosed in double quotation marks.
- **`//` (Line Comment)**: Any text following `//` on a line is ignored by the computer. Comments allow you to leave explanatory notes for yourself and others.

---

## 3. The Minimal Program

### Example 1: Printing to the Console

To display text on the screen, pass a string literal as an argument into `System.out.println()`:

```java
System.out.println("Welcome to programming!");
```

When this statement runs:
1. The text `"Welcome to programming!"` is sent to standard output (`System.out`).
2. The terminal displays the text.
3. The cursor moves to the beginning of the next line.

#### Practice (✪ 1/7)

Verify your local environment and run your first program:

- **✪** [Sandbox.md](./exercises/Sandbox.md) / [Sandbox.java](./exercises/Sandbox.java) — Minimal program structure and first execution check

---

## 4. Common Compiler Pitfalls

The Java compiler stops and reports an error when code violates the grammar rules of the language. Common syntax mistakes include:

- **Missing Semicolon (`;`)**:
  ```java
  // Compiler error: ';' expected
  System.out.println("Hello World")
  ```
- **Capitalization Mistakes**: Java is case-sensitive. `System` begins with an uppercase `S`.
  ```java
  // Compiler error: package system does not exist
  system.out.println("Hello World");
  ```
- **Single vs. Double Quotes**: Double quotes (`"..."`) denote text strings. Single quotes (`'...'`) denote individual single characters (`char`).
  ```java
  // Compiler error: unclosed character literal
  System.out.println('Hello World');
  ```
- **Mismatched Class and File Names**: A public class named `Example` inside a file named `Sandbox.java` fails to compile:
  ```
  class Example is public, should be declared in a file named Example.java
  ```

---

## 5. Conceptual Check

Test your understanding of Java fundamentals before writing code:

**Q1: Will the following program compile? Why or why not?**
```java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!")
    }
}
```
<details>
<summary><strong>View Answer</strong></summary>

No. It is missing a semicolon `;` at the end of the print statement. In Java, every individual statement must end with a semicolon.
</details>

**Q2: In the command `System.out.println("Ada Lovelace");`, what is the technical term for `"Ada Lovelace"`?**
<details>
<summary><strong>View Answer</strong></summary>

An **argument**. The string literal `"Ada Lovelace"` is passed inside the parentheses as the input value for the `println` method.
</details>

**Q3: What role does the Java Virtual Machine (JVM) play in running code?**
<details>
<summary><strong>View Answer</strong></summary>

The compiler (`javac`) translates source code into platform-independent **bytecode**. The JVM (`java`) runs that bytecode by translating it into native instructions for your computer's operating system and processor.
</details>

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Sandbox | Java program structure, compilation | [Sandbox.md](./exercises/Sandbox.md) | [Sandbox.java](./exercises/Sandbox.java) | `./gradlew test --tests "part01.s01startingprogramming.exercises.SandboxTest"` |

---

## Official Documentation

- **The Java Tutorials — "Hello World!" Application:** [Oracle Java SE Documentation](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html)
- **The Java Tutorials — A Closer Look at "Hello World!":** [Oracle Java SE Documentation](https://docs.oracle.com/javase/tutorial/getStarted/application/index.html)
- **Java Platform, Standard Edition API Specification:** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)\n