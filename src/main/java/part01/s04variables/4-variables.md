---
path: '/part-1/4-variables'
title: 'Variables'
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Understand what variables are, including their types, names, and assigned values.
> - Declare and use `String`, `int`, `double`, and `boolean` variables.
> - Convert user console text into numeric and boolean data types using wrapper methods.

## What is a Variable?

A variable is a named memory location where you can store data of a specific type. 

In Java, every variable must have a declared type and a unique name:

```java
int months = 12;
double pi = 3.14159;
boolean isJavaFun = true;
String greeting = "Hello!";
```

### Joining Variables with Strings

You can concatenate variables directly into print statements with the `+` operator:

```java
int wholeNumber = 123;
double floatingPoint = 3.14159;
boolean trueOrFalse = true;

System.out.println("Integer: " + wholeNumber);
System.out.println("Floating-point: " + floatingPoint);
System.out.println("Boolean: " + trueOrFalse);
```

**Sample Output**
```text
Integer: 123
Floating-point: 3.14159
Boolean: true
```

👉 **Ready?** Open [VariousVariables.md](./VariousVariables.md) / [VariousVariables.java](./VariousVariables.java)

---

## Modifying Variable Values

Once declared, you can assign new values to a variable by referencing its name without repeating the type:

```java
int number = 123;
System.out.println(number); // prints 123

number = 42;
System.out.println(number); // prints 42
```

### Type Invariance

Java is strongly typed. Once a variable is declared with a specific type, it cannot hold a conflicting type:

```java
int number = 10;
number = 4.2; // Compiler error: incompatible types (possible lossy conversion from double to int)
```

However, widening conversions (like assigning an `int` to a `double`) work automatically:

```java
double floatingPoint = 0.5;
floatingPoint = 10; // Valid: Java converts 10 to 10.0
```

---

## Core Data Types

| Type | Syntax Example | Stored Values |
| :--- | :--- | :--- |
| **`int`** | `int age = 25;` | 32-bit whole numbers ($-2^{31}$ to $2^{31}-1$). |
| **`double`** | `double price = 19.99;` | 64-bit floating-point decimal numbers. |
| **`boolean`** | `boolean passed = true;` | Either `true` or `false`. |
| **`String`** | `String name = "Ada";` | Immutable sequence of characters. |

---

## Reading Different Variable Types

The `Scanner` tool always reads user input as raw text (`String`). To convert that text into numbers or booleans, use Java's conversion methods:

### 1. Reading Integers (`int`)
Use `Integer.valueOf(...)` on the scanned string:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Give a number: ");
int value = Integer.valueOf(scanner.nextLine());
System.out.println("You gave " + value);
```

👉 **Ready?** Open [IntegerInput.md](./IntegerInput.md) / [IntegerInput.java](./IntegerInput.java)

---

### 2. Reading Floating-Point Numbers (`double`)
Use `Double.valueOf(...)` on the scanned string:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Give a floating-point number: ");
double value = Double.valueOf(scanner.nextLine());
System.out.println("You gave " + value);
```

👉 **Ready?** Open [DoubleInput.md](./DoubleInput.md) / [DoubleInput.java](./DoubleInput.java)

---

### 3. Reading Booleans (`boolean`)
Use `Boolean.valueOf(...)` on the scanned string:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Write something: ");
boolean value = Boolean.valueOf(scanner.nextLine());
System.out.println("True or false? " + value);
```

> [!NOTE]
> `Boolean.valueOf` is case-insensitive. If the user enters `"true"` or `"TRUE"`, it evaluates to `true`. Any other string evaluates to `false`.

👉 **Ready?** Open [BooleanInput.md](./BooleanInput.md) / [BooleanInput.java](./BooleanInput.java)

---

### 4. Combining Multiple Types
Read multiple different types in sequential order:

👉 **Ready?** Open [DifferentTypesOfInput.md](./DifferentTypesOfInput.md) / [DifferentTypesOfInput.java](./DifferentTypesOfInput.java)

---

## Official Documentation

* **Primitive Data Types**: [Oracle Java Tutorials (Primitive Data Types)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) - Breakdown of memory footprint and ranges for primitives.
* **Integer Class**: [Oracle Java SE Javadoc (Integer)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html) - Documentation for integer parsing and `Integer.valueOf()`.
* **Double Class**: [Oracle Java SE Javadoc (Double)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html) - Documentation for double-precision parsing.
* **Boolean Class**: [Oracle Java SE Javadoc (Boolean)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html) - Documentation for boolean parsing.
