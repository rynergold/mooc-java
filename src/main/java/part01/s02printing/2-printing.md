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
> - Match exact text output including whitespace and capitalization.

---

## 1. Printing Text to the Console

The `System.out.println()` statement prints text to the console, followed by a newline:

```java
System.out.println("Hello world!");
```

Output:
```text
Hello world!
```

### Components of the Print Statement
- **`System.out`**: The standard output stream representing the terminal console.
- **`.println(...)`**: The method that writes characters to the stream and moves the cursor to the beginning of the next line.
- **`"Hello world!"`**: The **argument** (a string literal) passed into the method. String literals must be wrapped in double quotes.

---

## 2. Progressive Printing Techniques

### Example 1: Single-Line Printing

In Java, all executable statements must be placed inside the `main` method of a class:

```java
package part01.s02printing;

public class AdaLovelace {
    public static void main(String[] args) {
        System.out.println("Ada Lovelace");
    }
}
```

Output:
```text
Ada Lovelace
```

#### Practice (✪ 1/7)

- **✪** [AdaLovelace.md](./exercises/AdaLovelace.md) / [AdaLovelace.java](./exercises/AdaLovelace.java) — Single-line string output

---

### Example 2: Sequential Multi-Line Execution

Java executes statements sequentially from top to bottom. Calling `System.out.println()` multiple times prints each string on a separate line:

```java
public class MultiLine {
    public static void main(String[] args) {
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");
    }
}
```

Output:
```text
Once upon a time
there was
a program
```

> [!TIP]
> **IDE Shortcut:** In IntelliJ and VS Code, type `sout` on an empty line inside `main` and press <kbd>Tab</kbd> or <kbd>Enter</kbd> to generate `System.out.println("");` instantly.

#### Practice (✪ 1/7)

- **✪** [OnceUponATime.md](./exercises/OnceUponATime.md) / [OnceUponATime.java](./exercises/OnceUponATime.java) — Multi-line sequential printing
- **✪** [Dinosaur.md](./exercises/Dinosaur.md) / [Dinosaur.java](./exercises/Dinosaur.java) — Multi-line text using `sout`

---

### Example 3: ASCII Art and Whitespace Alignment

Precise character placement allows you to draw shapes in the console using spaces and characters:

```java
public class Arrow {
    public static void main(String[] args) {
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
    }
}
```

Output:
```text
  *  
 *** 
*****
```

Leading spaces inside quotation marks are preserved literally by the console.

#### Practice (✪ 1/7)

- **✪** [TriangleDrill.md](./exercises/TriangleDrill.md) / [TriangleDrill.java](./exercises/TriangleDrill.java) — Character alignment and ASCII rendering

---

## 3. `println` vs. `print`

Java provides two primary methods on `System.out`:

- **`System.out.println()`**: Prints the argument and appends a newline character (`\n`). Subsequent output starts on the next line.
- **`System.out.print()`**: Prints the argument without appending a newline. Subsequent output continues on the same line.

```java
System.out.print("Hello ");
System.out.println("World");
// Output: Hello World
```

---

## 4. Code Comments

Comments let you write explanatory notes that the Java compiler ignores during execution:

- **Single-Line Comments (`//`)**: Everything from `//` to the end of that line is ignored.
- **Multi-Line Comments (`/* ... */`)**: Everything between `/*` and `*/` is ignored, across multiple lines.

```java
public class CommentsExample {
    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("Visible text");

        /*
         * This is a multi-line comment.
         * The compiler skips all lines within this block.
         */
        
        // System.out.println("Disabled line");
    }
}
```

---

## 5. Common Output Pitfalls

- **Missing Quotes:** Writing `System.out.println(Hello);` causes a compiler error (`cannot find symbol`) because Java treats unquoted words as variable names.
- **Trailing or Leading Whitespace:** Automated tests check output character-by-character. An extra space at the end of a line (`"Ada Lovelace "`) causes tests expecting `"Ada Lovelace"` to fail.
- **Spelling and Case:** Java is case-sensitive. `"ada lovelace"` does not match `"Ada Lovelace"`.

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Ada Lovelace | Single-line string printing | [AdaLovelace.md](./exercises/AdaLovelace.md) | [AdaLovelace.java](./exercises/AdaLovelace.java) | `./gradlew test --tests "part01.s02printing.exercises.AdaLovelaceTest"` |
| **Tier 1** | ✪ | Once Upon a Time | Multi-line sequential execution | [OnceUponATime.md](./exercises/OnceUponATime.md) | [OnceUponATime.java](./exercises/OnceUponATime.java) | `./gradlew test --tests "part01.s02printing.exercises.OnceUponATimeTest"` |
| **Tier 1** | ✪ | Dinosaur | Multi-line text with `sout` | [Dinosaur.md](./exercises/Dinosaur.md) | [Dinosaur.java](./exercises/Dinosaur.java) | `./gradlew test --tests "part01.s02printing.exercises.DinosaurTest"` |
| **Tier 1** | ✪ | Triangle Drill | ASCII art, space alignment | [TriangleDrill.md](./exercises/TriangleDrill.md) | [TriangleDrill.java](./exercises/TriangleDrill.java) | `./gradlew test --tests "part01.s02printing.exercises.TriangleDrillTest"` |

---

## Official Documentation

- **PrintStream (`println`):** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/PrintStream.html#println(java.lang.String))
- **System (`System.out`):** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/System.html#out)
- **Java Comments:** [Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.7)
