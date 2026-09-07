---
path: "/part-1/4-variables"
title: "Variables"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Declare, initialize, and reassign variables of type `int`, `double`, `boolean`, and `String`.
> - Understand the container mental model for storing values in memory.
> - Convert scanned text into numbers and booleans using `Integer.valueOf()`, `Double.valueOf()`, and `Boolean.valueOf()`.
> - Prevent type mismatch compiler errors and runtime conversion exceptions.

---

## 1. What is a Variable?

A variable is a named container in computer memory that holds information of a specific type. In Java, every variable must have a declared type and a name:

```java
int capacity = 500;
double fuelLevel = 82.5;
boolean inspected = true;
String flightCode = "AY101";
```

### Core Data Types Explained

| Type | What It Stores | Example Values | Example Declaration |
| :--- | :--- | :--- | :--- |
| **`int`** | Whole numbers (integers) | `-5`, `0`, `42`, `1000` | `int count = 42;` |
| **`double`** | Decimal (floating-point) numbers | `0.5`, `3.14159`, `-12.8` | `double balance = 99.95;` |
| **`boolean`** | Truth values | `true`, `false` | `boolean active = true;` |
| **`String`** | Text enclosed in double quotes | `"Ada"`, `"Hello World"`, `""` | `String title = "Developer";` |

### Key Terminology Explained

- **Declaration:** Creating a variable by specifying its type and name (e.g., `int capacity;`). This reserves memory for the variable.
- **Initialization:** Assigning a variable its initial value for the first time (e.g., `capacity = 500;` or `int capacity = 500;`).
- **Assignment Operator (`=`):** Stores the value on the right-hand side into the container on the left-hand side.
- **Reassignment:** Changing the value stored inside an existing variable (e.g., `capacity = 750;`). You do not repeat the type keyword when reassigning.

> [!TIP]
> **Modern Java Note: Local Variable Type Inference (`var`, Java 10+)**
> Starting in Java 10, you can use the `var` keyword instead of explicitly writing the type when the initial value makes the type obvious:
> ```java
> var title = "Flight Log"; // inferred as String
> var passengers = 120;     // inferred as int
> ```
> Java remains strictly and statically typed: the compiler figures out the type at compile time. While `var` reduces boilerplate in large production projects, explicitly writing `int`, `double`, `boolean`, and `String` is recommended while learning so you build a solid intuition for data types.

---

## 2. Working with Variables and Types

### Example 1: Declaring, Reassigning, and Displaying Types

When you reassign a variable, the new value replaces the old one:

```java
int speed = 60;
System.out.println("Initial speed: " + speed); // 60

speed = 85; // Reassignment: no type keyword
System.out.println("Updated speed: " + speed); // 85
```

Joining variables with text using `+` automatically converts the values into readable text:

```java
int roomNumber = 204;
double hourlyRate = 45.50;
boolean occupied = true;

System.out.println("Room: " + roomNumber);
System.out.println("Rate: " + hourlyRate);
System.out.println("Occupied: " + occupied);
```

Output:
```text
Room: 204
Rate: 45.5
Occupied: true
```

#### Practice (✪ 1/7)

- **✪** [VariousVariables.md](./exercises/VariousVariables.md) / [VariousVariables.java](./exercises/VariousVariables.java) — Declare, initialize, and display multiple data types

---

### Example 2: Converting Scanned Text into Numbers and Booleans

The `Scanner` tool always reads input from the console as text (`String`). To perform mathematical operations or check true/false flags, convert the string using Java's conversion methods:

```java
Scanner scanner = new Scanner(System.in);

// 1. Reading an Integer
System.out.println("Enter warehouse aisle number:");
int aisle = Integer.valueOf(scanner.nextLine());

// 2. Reading a Double (decimal number)
System.out.println("Enter package weight in kilograms:");
double weight = Double.valueOf(scanner.nextLine());

// 3. Reading a Boolean
System.out.println("Is this item fragile (true/false)?");
boolean isFragile = Boolean.valueOf(scanner.nextLine());
```

> [!NOTE]
> **Boolean Conversion Rule:** `Boolean.valueOf()` is case-insensitive. Typing `"true"` or `"TRUE"` produces `true`. Typing any other text (such as `"false"`, `"yes"`, or `"1"`) produces `false`.

#### Practice (✪ 1/7)

- **✪** [IntegerInput.md](./exercises/IntegerInput.md) / [IntegerInput.java](./exercises/IntegerInput.java) — Read text and convert to an `int`
- **✪** [DoubleInput.md](./exercises/DoubleInput.md) / [DoubleInput.java](./exercises/DoubleInput.java) — Read text and convert to a `double`
- **✪** [BooleanInput.md](./exercises/BooleanInput.md) / [BooleanInput.java](./exercises/BooleanInput.java) — Read text and convert to a `boolean`

---

### Example 3: Storing Multiple Pieces of Information

Programs often collect multiple values of different types in sequence:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter vehicle model:");
String model = scanner.nextLine();

System.out.println("Enter manufacture year:");
int year = Integer.valueOf(scanner.nextLine());

System.out.println("Enter engine displacement in liters:");
double engineSize = Double.valueOf(scanner.nextLine());

System.out.println("Is the vehicle electric (true/false)?");
boolean isElectric = Boolean.valueOf(scanner.nextLine());

System.out.println("Vehicle: " + model + " (" + year + ")");
System.out.println("Engine: " + engineSize + "L | Electric: " + isElectric);
```

#### Practice (✪ 1/7)

- **✪** [DifferentTypesOfInput.md](./exercises/DifferentTypesOfInput.md) / [DifferentTypesOfInput.java](./exercises/DifferentTypesOfInput.java) — Read and convert four distinct data types
- **✪** [CharacterSheet.md](./exercises/CharacterSheet.md) / [CharacterSheet.java](./exercises/CharacterSheet.java) — Store and display character information across multiple types

---

## 3. Common Variable Pitfalls

- **`NumberFormatException` at Runtime:** Passing non-numeric text like `"forty"` into `Integer.valueOf()` crashes the program with a `NumberFormatException`. The input text must consist of digits.
- **Redeclaring an Existing Variable:** Repeating the type keyword when changing a value causes a compiler error:
  ```java
  int count = 5;
  int count = 10; // Compiler error: variable count is already defined
  ```
  Write `count = 10;` to update an existing variable.
- **Type Mismatch:** Storing a decimal number into an `int` container without conversion fails compilation:
  ```java
  int value = 4.2; // Compiler error: possible lossy conversion from double to int
  ```
- **Uninitialized Variables:** Java requires local variables inside methods to be given a value before they are read. Using a variable before assigning it causes a compiler error (`variable might not have been initialized`).

---

## Official Documentation

- **Primitive Data Types:** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- **Integer Wrapper Class:** [Oracle Java SE Javadoc (Integer)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html)
- **Double Wrapper Class:** [Oracle Java SE Javadoc (Double)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html)
- **Boolean Wrapper Class:** [Oracle Java SE Javadoc (Boolean)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html)\n