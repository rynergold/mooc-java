---
path: "/part-1/2-printing"
title: "Printing"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Print text to standard output using `System.out.println()`.
> - Control sequential output across multiple lines.
> - Distinguish `System.out.println()` from `System.out.print()`.
> - Use single-line (`//`) and multi-line (`/* ... */`) comments to document code.
> - Match exact text output including spaces and capitalization.

---

## 1. Printing Text to the Console

The `System.out.println()` statement prints text to the console, followed by a new line:

```java
System.out.println("Welcome to Java programming!");
```

Output:
```text
Welcome to Java programming!
```

### Key Terminology Explained

- **`System.out`**: The standard output stream representing the terminal console where text appears.
- **`.println(...)`**: The built-in method that outputs characters to the terminal and moves the cursor to the start of the next line.
- **Argument**: The data passed inside the parentheses of a method. In `System.out.println("Welcome to Java programming!");`, the string `"Welcome to Java programming!"` is the argument.
- **String Literal**: Text wrapped in double quotation marks (`"..."`). The quotation marks tell the compiler where the text starts and ends; they are not printed to the console.

---

## 2. Multi-Line Printing & Formatting

### Example 1: Single-Line Printing

In Java, executable statements reside inside the `main` method of a class:

```java
package part01.s02printing;

public class WelcomeMessage {
    public static void main(String[] args) {
        System.out.println("Hello, Helsinki!");
    }
}
```

Output:
```text
Hello, Helsinki!
```

#### Practice (✪ 1/7)

- **✪** [AdaLovelace.md](./exercises/AdaLovelace.md) / [AdaLovelace.java](./exercises/AdaLovelace.java) — Single-line string output

---

### Example 2: Sequential Multi-Line Execution

Java executes statements sequentially from top to bottom. Calling `System.out.println()` multiple times prints each string on its own line:

```java
public class Instructions {
    public static void main(String[] args) {
        System.out.println("Step 1: Gather ingredients");
        System.out.println("Step 2: Mix thoroughly in a bowl");
        System.out.println("Step 3: Bake at 180 degrees");
    }
}
```

Output:
```text
Step 1: Gather ingredients
Step 2: Mix thoroughly in a bowl
Step 3: Bake at 180 degrees
```

> [!TIP]
> **IDE Shortcut:** In IntelliJ and VS Code, type `sout` on an empty line inside `main` and press <kbd>Tab</kbd> or <kbd>Enter</kbd> to generate `System.out.println("");` immediately.

> [!TIP]
> **Modern Java Note (Java 15+)**
> When printing long multi-line paragraphs, traditional Java requires repeated `println` statements or manual newline characters (`\n`). Since Java 15, you can use **Text Blocks** delimited by three double quotes (`"""`):
> ```java
> System.out.println("""
>     Step 1: Gather ingredients
>     Step 2: Mix thoroughly in a bowl
>     Step 3: Bake at 180 degrees
>     """);
> ```
> Text blocks preserve line breaks and relative indentation cleanly.

#### Practice (✪ 1/7)

- **✪** [OnceUponATime.md](./exercises/OnceUponATime.md) / [OnceUponATime.java](./exercises/OnceUponATime.java) — Multi-line sequential printing
- **✪** [Dinosaur.md](./exercises/Dinosaur.md) / [Dinosaur.java](./exercises/Dinosaur.java) — Multi-line text using `sout`

---

### Example 3: Space Alignment and Console Art

Spaces placed inside quotation marks are preserved by the console. Aligning spaces and characters lets you draw shapes and structured banners:

```java
public class Banner {
    public static void main(String[] args) {
        System.out.println("+-----------+");
        System.out.println("|   JAVA    |");
        System.out.println("+-----------+");
    }
}
```

Output:
```text
+-----------+
|   JAVA    |
+-----------+
```

#### Practice (✪ 1/7)

- **✪** [TriangleDrill.md](./exercises/TriangleDrill.md) / [TriangleDrill.java](./exercises/TriangleDrill.java) — Character alignment and space-sensitive output

---

## 3. `println` vs. `print`

Java provides two standard print commands on `System.out`:

- **`System.out.println()`**: Prints the argument and appends a newline character (`\n`). Subsequent output starts on the next line.
- **`System.out.print()`**: Prints the argument without appending a newline. The cursor stays on the same line, so subsequent output appears directly after it.

```java
System.out.print("Good morning, ");
System.out.println("world!");
// Output: Good morning, world!
```

---

## 4. Code Comments

Comments let you write explanatory notes for human readers. The Java compiler skips comments during execution:

- **Single-Line Comments (`//`)**: Everything from `//` to the end of that line is ignored.
- **Multi-Line Comments (`/* ... */`)**: Everything between `/*` and `*/` is ignored, even across multiple lines.

```java
public class CommentsExample {
    public static void main(String[] args) {
        // This is a single-line comment explaining the next instruction
        System.out.println("Visible text");

        /*
         * This is a multi-line comment.
         * The compiler skips all lines within this block.
         */
        
        // System.out.println("Temporarily disabled line");
    }
}
```

---

## 5. Common Output Pitfalls

- **Missing Quotes:** Writing `System.out.println(Hello);` causes a compiler error (`cannot find symbol`) because Java treats words without quotes as variable names.
- **Trailing or Leading Space Mismatches:** Automated tests compare output character by character. An extra space at the end of a line (`"Ada Lovelace "`) causes a test expecting `"Ada Lovelace"` to fail.
- **Capitalization and Spelling:** Java tests expect exact character matches. `"ada lovelace"` does not match `"Ada Lovelace"`.

---

## Official Documentation

- **PrintStream (`println`):** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/PrintStream.html#println(java.lang.String))
- **System (`System.out`):** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/System.html#out)
- **Java Comments:** [Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.7)\n