---
path: "/part-1/2-printing"
title: "Printing"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Learn to write a program that prints text.
> 
> - Become familiar with executing programs.
> 
> - Know what the term "parameter" means.

The print command `System.out.println("Hello world");` prints the text "Hello world".

```java
System.out.println("Hello world!");
```

**Sample Output**
```text
Hello world!
```

In this material, text boxes like the one above show the output of the preceding code examples. Accordingly, the above program would produce the print output "Hello world!". You can test these examples yourself using the "Sandbox" exercise template in your IDE.

You can print any text you want by replacing the text inside the quotes. Just ensure the surrounding syntax—`System.out.println("` and `");`—remains unchanged. The command below will print the text "Hello there!".

```java
System.out.println("Hello there!");
```

**Sample Output**
```text
Hello there!
```

## Program Boilerplate

In Java, programs require some boilerplate code to function. For instance, the boilerplate shown below tells the computer the name of your program. Below, the name of the program is `Example`. This name has to correspond to the name of the file that contains the source code (e.g. `Example.java`).

```java
public class Example {
    public static void main(String[] args) {

        System.out.println("Text to be printed");

    }
}
```

Execution of the program starts from the line that follows `public static void main(String[] args) {`, and ends at the closing curly bracket `}`. Commands are executed one line at a time. We'll learn what the terms `public class` and `public static void` mean later on. In the above example, `System.out.println("Text to be printed")` is the only command to be executed. Its output is:

**Sample Output**
```text
Text to be printed
```

> [!NOTE]
> **Examples in the Material and Code Templates**
>
> The examples in the material will not always show the template, but you can assume that your program file always needs one. As such, the examples might be as short as a single line, such as the example below that illustrates the print command.
> 
> ```java
> System.out.println("Hello world");
> ```
> 
> A full Java program looks like this:
> 
> ```java
> public class Example {
>     public static void main(String[] args) {
>         // Here goes the statements used by the program
>         System.out.println("Hello world!");
>     }
> }
> ```

Here's the second programming exercise of this course. If you'd like, you can watch this video on how to solve the exercise first:

[Watch on YouTube](https://www.youtube.com/watch?v=-DzOKI6iH5w)

### Programming Exercise: Ada Lovelace

The exercise template has the following boilerplate code:

```java
public class AdaLovelace {
    public static void main(String[] args) {
        // Write your program here

    }
}
```

The line "// Write your program here" is a _line comment_, and the computer will ignore it when executing the program. Add a new line below the line comment that prints the string "Ada Lovelace" and run the program. The output of the program should be:

**Sample Output**
```text
Ada Lovelace
```

Once you've finished the exercise and see that it prints the correct string, you can move on to the next task. After that, you can read more about [Ada Lovelace](https://en.wikipedia.org/wiki/Ada_Lovelace), who was one of the first programmers.

> [!NOTE]
> **Running the Program**
>
> You can run a program in your IDE by pressing the run or play button, typically found near your code or in the top menu.
> 
> When a program is run, the source code is first compiled into Java bytecode. This compilation process is done by Java's compiler, which itself is a program. Following that, the program gets executed, meaning the interpreter executes commands one-by-one by reading the Java bytecode.
> 
> This compile process affects how and when errors occur. When a program is compiled before execution, the compiler can search for errors in it. This also affects the hints provided by the IDE, and in this way, the programmer can receive immediate feedback on any errors.
> 
> The IDE both compiles and executes the program with just one press of a button. However, the programming environment compiles the program continuously, so it can report errors. You can, for example, try to change above Ada Lovelace exercise print command to `Systemoutprintln("hi!")` -- what you'll notice is that the line will be underlined and you'll be notified of an error on the left-hand side.

## Printing Multiple Lines

Programs are constructed command-by-command, where each command is placed on a new line. In the example below, the command `System.out.println` appears twice, which means that two print commands are being executed in the program.

```java
public class Ohjelma {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("... and the universe!");
    }
}
```

The program above will print:

**Sample Output**
```text
Hello world!
... and the universe!
```

> [!NOTE]
> **Exact Inspector**
>
> The automated tests are meticulous. The guidelines in the assignments regarding the print format are very precise. If the assignment expects you to print a parenthesis, you must print the parenthesis.
> 
> This precision matters everywhere in programming. Missing a single character may cause an error. Novice programmers often enter a comma instead of a dot, and write, for instance `printin` instead of `println`, leave out apostrophes, or forget the semicolon after a command. Any one of these would cause an error and cause the program execution to fail.
> 
> Learning programming is, in fact, a path full of mistakes -- and every error message is a chance to learn. Keep a lookout for any red signs in the IDE and try to read the test errors!

### Programming Exercise: Once Upon a Time

The exercise template comes with the following template:

```java
public class OnceUponATime {
    public static void main(String[] args) {
        // Write your program here

    }
}
```

Modify the program so that it will print the following text. Use three `System.out.println`-commands for printing.

**Sample Output**
```text
Once upon a time
there was
a program
```

> [!NOTE]
> **"sout"**
>
> Writing the command `System.out.println("...")` can be taxing. In your IDE (like IntelliJ or VS Code), try to write **sout** on a blank line (within main) and press Enter or Tab. What happens? This shortcut may save you a lot of time in the future.
> 
> The animation below illustrates the use of the sout command. The user first writes sout and then presses tab. Magic!
> 
> ![](../img/part1.2-sout.gif)

### Programming Exercise: Dinosaur

The exercise comes ready with the following template:

```java
public class Dinosaur {
    public static void main(String[] args) {
        // Write your program here
    }
}
```

Edit the program so that it will print the following text. Use the "sout"-shorthand for writing the print commands.

**Sample Output**
```text
Once upon a time
there was
a dinosaur
```

## Terminology and Code Comments

### Command parameters

Pass the information to print—the **parameters**—inside the parentheses `()` that follow the command. For example, passing `Hi` as a parameter to the `System.out.println` command is done like this: `System.out.println("Hi")`.

### Semicolon Separates Commands

Commands are separated with a semicolon `;`. We could, if we wanted to, write almost everything on a single line. However, that would be difficult to understand.

```java
System.out.println("Hello "); System.out.println("world"); System.out.println("!\n");
```

**Sample Output**
```text
Hello
world
!
```

Although the previous example works, it's important to be considerate of other programmers (and your future self!) and to use line breaks. That way, anyone reading the program knows that each line does only a single concrete thing.

### Comments

Source code can be commented to clarify it or to add notes. There are two ways to do this.

- Single-line comments are marked with two slashes `//`. Everything following them on the same line is interpreted as a comment.

- Multi-line comments are marked with a slash and an asterisk `/*`, and closed with an asterisk followed by a slash `*/`. Everything between them is interpreted as a comment.

Below is an example of a program where both are used.

```java
public class Comments {
    public static void main(String[] args) {
        // Printing
        System.out.println("Text to print");
        System.out.println("More text to print!");
        /* Next:
        - more on printing
        - more practice
        - variables
        - ...
        */
        System.out.println("Some other text to print");
        // System.out.println("Trying stuff out")
    }
}
```

The last line of the example shows a particularly handy use-case for comments. Code that has been written does not need to be deleted to try out something else.

## Official Documentation

When writing Java, you will eventually need to read documentation to understand how built-in code works. 

* **The Source of Truth:** [Oracle's Java SE Documentation (System.out)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/System.html#out). This is the official "Javadoc". It is extremely dense and written like a technical specification, but it is the absolute authority on what the code does.
* **The Learning Alternative:** Because Oracle's docs are written for engineers rather than beginners, the industry standard for *understandable* Java explanations is a site called **Baeldung**. Here is their guide on [System.out.println](https://www.baeldung.com/java-testing-system-out-println).
