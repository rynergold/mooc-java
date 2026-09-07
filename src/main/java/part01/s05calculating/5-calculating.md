---
path: "/part-1/5-calculating"
title: "Calculating with Numbers"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Perform calculations using arithmetic operators (`+`, `-`, `*`, `/`).
> - Control calculation order using parentheses and operator precedence.
> - Format print statements combining text with arithmetic expressions.
> - Avoid integer division truncation using `(double)` type casting.
> - Understand that variable assignment copies values into independent containers.
> - Prevent integer overflow and division by zero exceptions.

---

## 1. Arithmetic Operators & Precedence

Java supports standard arithmetic operators: addition `+`, subtraction `-`, multiplication `*`, and division `/`.

```java
int width = 4;
int height = 6;
int area = width * height; // 24
```

### Key Terminology Explained

- **Expression:** A combination of values, variables, and operators that computes a single result (e.g., `2 + 3 * 4`).
- **Statement:** A complete instruction ending in a semicolon (e.g., `int sum = 2 + 3 * 4;`).
- **Operator Precedence:** The order in which Java evaluates operations:
  1. Parentheses `(...)` calculate first.
  2. Multiplication `*` and division `/` calculate before addition `+` and subtraction `-`.
  3. Operators with the same priority calculate from left to right.
- **Type Casting:** Converting a value from one data type to another, written as `(double) number`.

```java
int withParens = (1 + 1) + 3 * (2 + 5); // 2 + 3 * 7 = 2 + 21 = 23
int withoutParens = 1 + 1 + 3 * 2 + 5;   // 1 + 1 + 6 + 5 = 13
```

> [!TIP]
> **Modern Java Note: Overflow Checking & Formatted Output**
> When dealing with large numbers, Java integers silently wrap around past 2 billion. In modern Java, you can use `Math.addExact(a, b)` and `Math.multiplyExact(a, b)` from `java.lang.Math` to throw an error if an overflow occurs. For formatting decimal numbers cleanly, `System.out.printf("Result: %.2f%n", value);` formats the number to two decimal places.

---

## 2. Performing Calculations in Code

### Example 1: Basic Arithmetic Chains

Evaluating sequential expressions and geometry calculations:

```java
int lengthMeters = 12;
int widthMeters = 5;
int gardenArea = lengthMeters * widthMeters;
int perimeter = 2 * (lengthMeters + widthMeters);

System.out.println("Area: " + gardenArea);        // 60
System.out.println("Perimeter: " + perimeter);    // 34
```

#### Practice (✪ 1/7)

- **✪** [SecondsInADay.md](./exercises/SecondsInADay.md) / [SecondsInADay.java](./exercises/SecondsInADay.java) — Unit conversion multiplication ($days \times 24 \times 60 \times 60$)
- **✪** [SumOfTwoNumbers.md](./exercises/SumOfTwoNumbers.md) / [SumOfTwoNumbers.java](./exercises/SumOfTwoNumbers.java) — Two-variable integer addition
- **✪** [SumOfThreeNumbers.md](./exercises/SumOfThreeNumbers.md) / [SumOfThreeNumbers.java](./exercises/SumOfThreeNumbers.java) — Three-variable integer addition

---

### Example 2: String Concatenation vs. Arithmetic Addition

The `+` operator adds numbers together, but joins text when one of the items is a `String`.

Because Java reads expressions from left to right, placing text first turns subsequent additions into text concatenation:

```java
int itemPrice = 25;
int deliveryFee = 5;

System.out.println("Total: " + itemPrice + deliveryFee);   // prints "Total: 255"
System.out.println("Total: " + (itemPrice + deliveryFee)); // prints "Total: 30"
System.out.println(itemPrice + deliveryFee + " euros");    // prints "30 euros"
```

In `"Total: " + itemPrice + deliveryFee`:
1. `"Total: " + 25` evaluates to `"Total: 25"`.
2. `"Total: 25" + 5` evaluates to `"Total: 255"`.

Wrap calculations inside parentheses when printing arithmetic inside a print statement.

#### Practice (✪ 1/7)

- **✪** [AdditionFormula.md](./exercises/AdditionFormula.md) / [AdditionFormula.java](./exercises/AdditionFormula.java) — Formatted addition equation ($a + b = c$)
- **✪** [MultiplicationFormula.md](./exercises/MultiplicationFormula.md) / [MultiplicationFormula.java](./exercises/MultiplicationFormula.java) — Formatted multiplication equation ($a \times b = c$)

---

### Example 3: Integer Division vs. Decimal Casting

Division behaves differently depending on the data types involved:

#### 1. Integer Division (Truncation)
When dividing two integers, Java discards the decimal remainder completely:
```java
int result = 7 / 2; // evaluates to 3 (not 3.5)
```
Storing the result of integer division into a `double` does not restore the discarded decimal:
```java
double value = 7 / 2; // calculates 7 / 2 -> 3, then stores 3.0
```

#### 2. Decimal Precision with Type Casting
To keep the decimal part, at least one number in the division must be a `double`. You can convert an integer variable by writing `(double)` before it:
```java
int totalMeters = 7;
int curtains = 2;

double pieceLength = (double) totalMeters / curtains;  // 3.5
double alsoCorrect = 1.0 * totalMeters / curtains;     // 3.5
```

> [!CAUTION]
> **Casting Order:** Writing `(double) (totalMeters / curtains)` calculates `totalMeters / curtains` as integers first (producing `3`), and then converts `3` to `3.0`. Place `(double)` directly in front of the variable: `(double) totalMeters / curtains`.

#### Practice (✪✪ 2/7)

- **✪✪** [AverageOfTwoNumbers.md](./exercises/AverageOfTwoNumbers.md) / [AverageOfTwoNumbers.java](./exercises/AverageOfTwoNumbers.java) — Decimal average of two integers
- **✪✪** [AverageOfThreeNumbers.md](./exercises/AverageOfThreeNumbers.md) / [AverageOfThreeNumbers.java](./exercises/AverageOfThreeNumbers.java) — Decimal average of three integers
- **✪✪** [SimpleCalculator.md](./exercises/SimpleCalculator.md) / [SimpleCalculator.java](./exercises/SimpleCalculator.java) — Multi-operation arithmetic suite
- **✪✪** [BillSplitter.md](./exercises/BillSplitter.md) / [BillSplitter.java](./exercises/BillSplitter.java) — Decimal bill splitting and tip calculation

---

## 3. Common Calculation Pitfalls

- **Division by Zero:** Dividing an integer by zero (`count / 0`) crashes the program with an `ArithmeticException`. Check that divisors are not zero before dividing.
- **Silent Integer Overflow:** Java `int` variables can hold values up to $2{,}147{,}483{,}647$. Exceeding this limit wraps around into negative numbers:
  ```java
  int max = 2147483647;
  System.out.println(max + 1); // prints -2147483648
  ```
  For larger numbers, use the `long` data type.
- **Variables Store Copies of Values (Independent Containers):** When you assign one variable to another, Java copies the value. Changing the first variable later does not update the second variable:

### Variable State Trace

```java
int x = 4;
int y = x + 6; // 10

x = 20; // x is now 20; y remains 10

int z = x + y; // 20 + 10 = 30
```

| Step | Statement | `x` | `y` | `z` | Output |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 1 | `int x = 4;` | `4` | — | — | — |
| 2 | `int y = x + 6;` | `4` | `10` | — | — |
| 3 | `x = 20;` | `20` | `10` | — | — |
| 4 | `int z = x + y;` | `20` | `10` | `30` | — |

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Seconds in a Day | Multiplication calculation | [SecondsInADay.md](./exercises/SecondsInADay.md) | [SecondsInADay.java](./exercises/SecondsInADay.java) | `./gradlew test --tests "part01.s05calculating.exercises.SecondsInADayTest"` |
| **Tier 1** | ✪ | Sum of Two Numbers | Two-variable addition | [SumOfTwoNumbers.md](./exercises/SumOfTwoNumbers.md) | [SumOfTwoNumbers.java](./exercises/SumOfTwoNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.SumOfTwoNumbersTest"` |
| **Tier 1** | ✪ | Sum of Three Numbers | Three-variable addition | [SumOfThreeNumbers.md](./exercises/SumOfThreeNumbers.md) | [SumOfThreeNumbers.java](./exercises/SumOfThreeNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.SumOfThreeNumbersTest"` |
| **Tier 1** | ✪ | Addition Formula | Outputting formatted addition equation | [AdditionFormula.md](./exercises/AdditionFormula.md) | [AdditionFormula.java](./exercises/AdditionFormula.java) | `./gradlew test --tests "part01.s05calculating.exercises.AdditionFormulaTest"` |
| **Tier 1** | ✪ | Multiplication Formula | Outputting formatted multiplication equation | [MultiplicationFormula.md](./exercises/MultiplicationFormula.md) | [MultiplicationFormula.java](./exercises/MultiplicationFormula.java) | `./gradlew test --tests "part01.s05calculating.exercises.MultiplicationFormulaTest"` |
| **Tier 2** | ✪✪ | Average of Two Numbers | Double casting in division | [AverageOfTwoNumbers.md](./exercises/AverageOfTwoNumbers.md) | [AverageOfTwoNumbers.java](./exercises/AverageOfTwoNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.AverageOfTwoNumbersTest"` |
| **Tier 2** | ✪✪ | Average of Three Numbers | Multiple-variable decimal average | [AverageOfThreeNumbers.md](./exercises/AverageOfThreeNumbers.md) | [AverageOfThreeNumbers.java](./exercises/AverageOfThreeNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.AverageOfThreeNumbersTest"` |
| **Tier 2** | ✪✪ | Simple Calculator | Multi-operation arithmetic | [SimpleCalculator.md](./exercises/SimpleCalculator.md) | [SimpleCalculator.java](./exercises/SimpleCalculator.java) | `./gradlew test --tests "part01.s05calculating.exercises.SimpleCalculatorTest"` |
| **Tier 2** | ✪✪ | Bill Splitter | Decimal currency division and tip | [BillSplitter.md](./exercises/BillSplitter.md) | [BillSplitter.java](./exercises/BillSplitter.java) | `./gradlew test --tests "part01.s05calculating.exercises.BillSplitterTest"` |

---

## Official Documentation

- **Operators:** [Oracle Java Tutorials (Summary of Operators)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)
- **Expressions, Statements, and Blocks:** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html)
- **Type Conversion and Contexts:** [Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/jls-5.html)\n