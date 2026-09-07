---
path: "/part-1/4-variables"
title: "Variables"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Declare, initialize, and reassign variables of type `int`, `double`, `boolean`, and `String`.
> - Understand the memory footprint and values supported by Java primitives.
> - Convert scanned text into numeric and boolean values using `Integer.valueOf()`, `Double.valueOf()`, and `Boolean.valueOf()`.
> - Prevent type mismatch compiler errors and runtime parsing exceptions.

---

## 1. What is a Variable?

A variable is a named container in memory holding data of a designated type. In Java, every variable must have a declared type and a unique identifier:

```java
int months = 12;
double pi = 3.14159;
boolean passed = true;
String name = "Ada";
```

### Core Data Types

| Type | Classification | Memory Size | Stored Values | Example Declaration |
| :--- | :--- | :--- | :--- | :--- |
| **`int`** | Primitive | 32-bit (4 bytes) | Whole numbers from $-2^{31}$ to $2^{31}-1$ | `int count = 42;` |
| **`double`** | Primitive | 64-bit (8 bytes) | Double-precision floating-point decimals | `double balance = 99.95;` |
| **`boolean`** | Primitive | 1-bit logical | `true` or `false` | `boolean active = true;` |
| **`String`** | Reference | Object on heap | Immutable sequence of characters | `String title = "Developer";` |

---

## 2. Progressive Variable Techniques

### Example 1: Declaring, Reassigning, and Concatenating Types

Variables are assigned initial values using the assignment operator (`=`). Once declared, assign new values by referencing the variable name without repeating its type:

```java
int score = 10;
System.out.println("Initial score: " + score); // 10

score = 25; // Reassignment: no type keyword
System.out.println("Updated score: " + score); // 25
```

Concatenating variables with strings converts the values to text automatically:

```java
int wholeNumber = 123;
double floatingPoint = 3.14159;
boolean flag = true;

System.out.println("Integer: " + wholeNumber);
System.out.println("Floating-point: " + floatingPoint);
System.out.println("Boolean: " + flag);
```

Output:
```text
Integer: 123
Floating-point: 3.14159
Boolean: true
```

#### Practice (✪ 1/7)

- **✪** [VariousVariables.md](./exercises/VariousVariables.md) / [VariousVariables.java](./exercises/VariousVariables.java) — Declare, initialize, and display multiple data types

---

### Example 2: Parsing Scanned Text into Specific Types

The `Scanner` tool always reads input from the console as raw text (`String`). To perform numeric calculations or boolean evaluations, parse the scanned string with wrapper methods:

```java
Scanner scanner = new Scanner(System.in);

// 1. Reading an Integer
System.out.println("Enter an integer:");
int intValue = Integer.valueOf(scanner.nextLine());

// 2. Reading a Double
System.out.println("Enter a floating-point number:");
double doubleValue = Double.valueOf(scanner.nextLine());

// 3. Reading a Boolean
System.out.println("Enter true or false:");
boolean boolValue = Boolean.valueOf(scanner.nextLine());
```

> [!NOTE]
> **Boolean Parsing Rule:** `Boolean.valueOf()` is case-insensitive. Entering `"true"` or `"TRUE"` evaluates to `true`. Entering any other string evaluates to `false`.

#### Practice (✪ 1/7)

- **✪** [IntegerInput.md](./exercises/IntegerInput.md) / [IntegerInput.java](./exercises/IntegerInput.java) — Read text and parse into an `int`
- **✪** [DoubleInput.md](./exercises/DoubleInput.md) / [DoubleInput.java](./exercises/DoubleInput.java) — Read text and parse into a `double`
- **✪** [BooleanInput.md](./exercises/BooleanInput.md) / [BooleanInput.java](./exercises/BooleanInput.java) — Read text and parse into a `boolean`

---

### Example 3: Mixed Sequential Input and Composite State

Complex applications capture multiple distinct data types in a specific sequence:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter name:");
String name = scanner.nextLine();

System.out.println("Enter level:");
int level = Integer.valueOf(scanner.nextLine());

System.out.println("Enter power rating:");
double power = Double.valueOf(scanner.nextLine());

System.out.println("Active status:");
boolean isActive = Boolean.valueOf(scanner.nextLine());

System.out.println("Character: " + name + " (Level " + level + ")");
System.out.println("Power: " + power + " | Active: " + isActive);
```

#### Practice (✪ 1/7)

- **✪** [DifferentTypesOfInput.md](./exercises/DifferentTypesOfInput.md) / [DifferentTypesOfInput.java](./exercises/DifferentTypesOfInput.java) — Sequential parsing across all four types
- **✪** [CharacterSheet.md](./exercises/CharacterSheet.md) / [CharacterSheet.java](./exercises/CharacterSheet.java) — Composite character state tracking across multiple types

---

## 3. Common Variable Pitfalls

- **`NumberFormatException` at Runtime:** Passing non-numeric text (`"forty"`) into `Integer.valueOf()` causes the JVM to crash with a `NumberFormatException`. The input must contain valid digit characters.
- **Redeclaring Existing Variables:** Repeating the type keyword when assigning a new value causes a compilation error:
  ```java
  int count = 5;
  int count = 10; // Compiler error: variable count is already defined
  ```
- **Type Incompatibility:** Assigning a larger type into a smaller container without casting fails compilation:
  ```java
  int value = 4.2; // Compiler error: possible lossy conversion from double to int
  ```
- **Uninitialized Variables:** In Java, local variables inside methods have no default value. Reading a variable before assigning it causes a compiler error (`variable might not have been initialized`).

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Various Variables | Declaring and displaying multiple types | [VariousVariables.md](./exercises/VariousVariables.md) | [VariousVariables.java](./exercises/VariousVariables.java) | `./gradlew test --tests "part01.s04variables.exercises.VariousVariablesTest"` |
| **Tier 1** | ✪ | Integer Input | Parsing text into `int` with `Integer.valueOf` | [IntegerInput.md](./exercises/IntegerInput.md) | [IntegerInput.java](./exercises/IntegerInput.java) | `./gradlew test --tests "part01.s04variables.exercises.IntegerInputTest"` |
| **Tier 1** | ✪ | Double Input | Parsing text into `double` with `Double.valueOf` | [DoubleInput.md](./exercises/DoubleInput.md) | [DoubleInput.java](./exercises/DoubleInput.java) | `./gradlew test --tests "part01.s04variables.exercises.DoubleInputTest"` |
| **Tier 1** | ✪ | Boolean Input | Parsing text into `boolean` with `Boolean.valueOf` | [BooleanInput.md](./exercises/BooleanInput.md) | [BooleanInput.java](./exercises/BooleanInput.java) | `./gradlew test --tests "part01.s04variables.exercises.BooleanInputTest"` |
| **Tier 1** | ✪ | Different Types Of Input | Sequential parsing of mixed types | [DifferentTypesOfInput.md](./exercises/DifferentTypesOfInput.md) | [DifferentTypesOfInput.java](./exercises/DifferentTypesOfInput.java) | `./gradlew test --tests "part01.s04variables.exercises.DifferentTypesOfInputTest"` |
| **Tier 1** | ✪ | Character Sheet | Composite state capture across multiple types | [CharacterSheet.md](./exercises/CharacterSheet.md) | [CharacterSheet.java](./exercises/CharacterSheet.java) | `./gradlew test --tests "part01.s04variables.exercises.CharacterSheetTest"` |

---

## Official Documentation

- **Primitive Data Types:** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- **Integer Wrapper Class:** [Oracle Java SE Javadoc (Integer)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html)
- **Double Wrapper Class:** [Oracle Java SE Javadoc (Double)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html)
- **Boolean Wrapper Class:** [Oracle Java SE Javadoc (Boolean)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html)
