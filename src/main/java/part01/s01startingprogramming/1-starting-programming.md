---
path: "/part-1/1-starting-programming"
title: "Getting started with programming"
---
## Programmers Write Source Code

Programming is about designing and implementing software to solve problems. We do this by writing instructions in a **programming language**—a syntax designed to be readable by humans but executable by machines.

There are hundreds of languages, but we are using **[Java](https://en.wikipedia.org/wiki/Java_(programming_language))**. It's strongly typed, object-oriented, and powers everything from Android apps to enterprise financial systems. Mastering Java gives you a rock-solid foundation for picking up almost any other language later.

The text you write is called **source code**. Source code is made up of statements and expressions that the computer reads sequentially (top-to-bottom, left-to-right). 

For example, to print "Hello World", you use a built-in Java command:

```java
System.out.println("Hello World");
```

### Key Takeaways:
- **`System.out.println()`**: A built-in statement used to print a string of text to the console.
- **Strings**: Text data must be wrapped in double quotation marks (`"Like this"`).
- **Semicolons (`;`)**: Every statement in Java must end with a semicolon. Think of it as a period at the end of a sentence.
- **Boilerplate**: Java requires a structural "frame" (classes and methods) around your code to run. We'll cover this soon—for now, just know it's mandatory scaffolding.

---

## Conceptual Check

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

No. It is missing a semicolon `;` closing the print statement. The Java compiler is unforgiving and will halt with a syntax error.
</details>

**Q2: In the command `System.out.println("Ada Lovelace");`, what is the technical term for the string `"Ada Lovelace"`?**
<details>
<summary><strong>View Answer</strong></summary>

A **parameter**. (e.g., "I passed the string \'Ada Lovelace\' as a parameter to the println command.")
</details>

**Q3: When you run a Java program, what happens to your human-readable source code?**
<details>
<summary><strong>View Answer</strong></summary>

The source code is compiled into **bytecode**. Then, the **Java Interpreter** (part of the JVM - Java Virtual Machine) reads the bytecode and converts it into the exact machine code for the specific OS on the fly. This enables "Write Once, Run Anywhere" (WORA).
</details>

---

*Next up: `02printing/` — your first exercises.*

## Navigating Java Documentation

As you learn Java, you will often need to look up how built-in tools work. Knowing where to look is half the battle.

* **The Defacto Standard:** [Oracle's Java SE API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/index.html). This is the official manual. It is written like a technical specification for engineers, so it can be dense and confusing for beginners. However, it is the absolute source of truth.
* **The Learning Alternative:** The industry standard for *understandable* Java tutorials is a site called [Baeldung](https://www.baeldung.com/). If Oracle gives you the strict technical rules, Baeldung gives you the clear, readable examples of how to actually use the code in the real world. Keep it bookmarked as an essential supplement to this course.
