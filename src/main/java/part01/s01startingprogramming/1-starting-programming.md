---
path: "/part-1/1-starting-programming"
title: "Getting Started with Programming"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Understand how human-readable Java source code compiles into bytecode and executes on the JVM.
> - Identify the core components of a Java program: packages, classes, and the `main` method.
> - Print text to the console using `System.out.println()`.
> - Diagnose syntax errors including missing semicolons, case sensitivity, and unmatched braces.

---

## 1. How Java Executes Code

Computers execute instructions expressed as binary machine code. Because binary instructions are impractical for humans to write directly, developers write in high-level programming languages like **Java**.

Java uses a two-phase execution model:

```
[Source Code (.java)]
        │
        ▼  javac (Java Compiler)
[Bytecode (.class)]
        │
        ▼  java (Java Virtual Machine / JVM)
[Machine Code (CPU)]
```

1. **Compilation:** The Java compiler (`javac`) checks your source code for syntax errors and translates it into platform-independent **bytecode** stored in `.class` files.
2. **Execution:** The Java Virtual Machine (`java` / JVM) translates bytecode instructions into machine instructions specific to your operating system and CPU.

This design enables Java's write-once, run-anywhere model: compiled bytecode runs on any system with a compatible JVM installed.

---

## 2. Structure of a Java Program

A minimal Java program consists of a package declaration, a class definition, and an entry-point method:

```java
package part01.s01startingprogramming;

public class Sandbox {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Components of the Program

- **`package`**: Organizes related classes into a namespace matching the directory structure on disk (`part01/s01startingprogramming`).
- **`public class Sandbox`**: In Java, all executable code resides inside a class. When a class is declared `public`, its name must exactly match the file name (`Sandbox.java`).
- **`public static void main(String[] args)`**: The **entry point** of the program. When you run a Java application, execution begins at the first statement inside `main`.
- **`{ ... }` (Curly Braces)**: Delimit code blocks. Every opening brace `{` must have a matching closing brace `}`.
- **`System.out.println(...)`**: An instruction that prints the provided argument to the console, followed by a newline.
- **`;` (Semicolon)**: Terminates a statement. Every individual command in Java must end with a semicolon.
- **`"Hello World"` (String Literal)**: Text data enclosed in double quotation marks.

---

## 3. The Minimal Program

### Example 1: Printing to the Console

Printing text requires passing a string literal as an argument into `System.out.println()`:

```java
System.out.println("Welcome to programming!");
```

When this statement executes:
1. The string `"Welcome to programming!"` is sent to the standard output stream (`System.out`).
2. The console displays the text.
3. The cursor moves to the beginning of the next line.

#### Practice (✪ 1/7)

Verify your local environment and run your first program:

- **✪** [Sandbox.md](./exercises/Sandbox.md) / [Sandbox.java](./exercises/Sandbox.java) — Minimal program structure and first execution check

---

## 4. Common Compiler Pitfalls

The Java compiler rejects programs containing syntax errors. Watch for these common issues:

- **Missing Semicolon (`;`)**:
  ```java
  // Compiler error: ';' expected
  System.out.println("Hello World")
  ```
- **Case Sensitivity**: Java differentiates between lowercase and uppercase letters.
  ```java
  // Compiler error: package system does not exist
  system.out.println("Hello World");
  ```
- **Single vs. Double Quotes**: Double quotes (`"..."`) denote strings. Single quotes (`'...'`) denote single characters (`char`).
  ```java
  // Compiler error: unclosed character literal
  System.out.println('Hello World');
  ```
- **Mismatched Class and File Names**: A public class named `Example` in a file named `Sandbox.java` fails to compile:
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

No. It is missing a semicolon `;` at the end of the print statement. In Java, individual statements must terminate with a semicolon.
</details>

**Q2: In the command `System.out.println("Ada Lovelace");`, what is the technical term for `"Ada Lovelace"`?**
<details>
<summary><strong>View Answer</strong></summary>

An **argument** (or parameter). The string literal `"Ada Lovelace"` is passed as input to the `println` method.
</details>

**Q3: What role does the Java Virtual Machine (JVM) play in running code?**
<details>
<summary><strong>View Answer</strong></summary>

The compiler (`javac`) first translates human-readable source code into platform-independent **bytecode**. The JVM (`java`) interprets this bytecode and converts it into native machine instructions for your specific operating system and processor at runtime.
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
- **Java Platform, Standard Edition API Specification:** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
