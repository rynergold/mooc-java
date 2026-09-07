---
path: "/part-1/5-calculating"
title: "Calculating with Numbers"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Perform calculations using arithmetic operators (`+`, `-`, `*`, `/`).
> - Control evaluation order using parentheses and operator precedence.
> - Format print statements combining text with arithmetic expressions.
> - Avoid integer division truncation using `(double)` type casting.
> - Prevent silent integer overflow and division by zero exceptions.

---

## 1. Arithmetic Operators & Precedence

Java supports standard arithmetic operators: addition `+`, subtraction `-`, multiplication `*`, and division `/`.

```java
int first = 2;
int second = 4;
int sum = first + second; // 6
```

### Precedence Rules

Java evaluates arithmetic following standard mathematical order of operations:
1. Operations inside parentheses `(...)` evaluate first.
2. Multiplication `*` and division `/` evaluate before addition `+` and subtraction `-`.
3. Operators of equal precedence evaluate left to right.

```java
int withParens = (1 + 1) + 3 * (2 + 5); // 2 + 3 * 7 = 2 + 21 = 23
int withoutParens = 1 + 1 + 3 * 2 + 5;   // 1 + 1 + 6 + 5 = 13
```

### Expressions vs. Statements

- An **expression** produces a single value when evaluated (e.g. `2 + 3 * 4`).
- A **statement** is a complete instruction ending in a semicolon (e.g. `int result = 2 + 3 * 4;`).

---

## 2. Progressive Calculation Techniques

### Example 1: Basic Arithmetic Chains

Evaluating sequential expressions and unit conversions:

```java
int days = 3;
int secondsInDay = days * 24 * 60 * 60;
System.out.println("Seconds: " + secondsInDay); // 259200
```

#### Practice (✪ 1/7)

- **✪** [SecondsInADay.md](./exercises/SecondsInADay.md) / [SecondsInADay.java](./exercises/SecondsInADay.java) — Unit conversion product ($days \times 24 \times 60 \times 60$)
- **✪** [SumOfTwoNumbers.md](./exercises/SumOfTwoNumbers.md) / [SumOfTwoNumbers.java](./exercises/SumOfTwoNumbers.java) — Two-variable integer addition
- **✪** [SumOfThreeNumbers.md](./exercises/SumOfThreeNumbers.md) / [SumOfThreeNumbers.java](./exercises/SumOfThreeNumbers.java) — Three-variable integer addition

---

### Example 2: String Concatenation vs. Arithmetic Addition

The `+` operator performs arithmetic addition between numbers, and string concatenation when at least one operand is a `String`.

Because expressions evaluate from left to right, placing a string first converts subsequent additions into string joins:

```java
System.out.println("Total: " + 2 + 2);   // prints "Total: 22"
System.out.println("Total: " + (2 + 2)); // prints "Total: 4"
System.out.println(2 + 2 + " Total");   // prints "4 Total"
```

In `"Total: " + 2 + 2`:
1. `"Total: " + 2` evaluates to `"Total: 2"`.
2. `"Total: 2" + 2` evaluates to `"Total: 22"`.

Always wrap arithmetic operations in parentheses when outputting calculations inside a print statement.

#### Practice (✪ 1/7)

- **✪** [AdditionFormula.md](./exercises/AdditionFormula.md) / [AdditionFormula.java](./exercises/AdditionFormula.java) — Formatted math equation output ($a + b = c$)
- **✪** [MultiplicationFormula.md](./exercises/MultiplicationFormula.md) / [MultiplicationFormula.java](./exercises/MultiplicationFormula.java) — Formatted multiplication equation ($a \times b = c$)

---

### Example 3: Integer Division vs. Floating-Point Casting

Division behavior depends on operand types:

#### 1. Integer Division (Truncation)
When dividing two integers, Java discards the fractional part completely:
```java
int result = 3 / 2; // evaluates to 1 (not 1.5)
```
Assigning the result of integer division to a `double` does not recover the lost fraction:
```java
double value = 3 / 2; // calculates 3 / 2 -> 1, then stores 1.0
```

#### 2. Floating-Point Precision
To obtain decimal precision, at least one operand must be a `double`. Cast an integer variable using `(double)`:
```java
int first = 3;
int second = 2;

double correct = (double) first / second; // 1.5
double alsoCorrect = 1.0 * first / second; // 1.5
```

> [!CAUTION]
> **Casting Order:** Writing `(double) (first / second)` truncates the fraction *before* casting, resulting in `1.0`. Place the cast directly on the operand: `(double) first / second`.

#### Practice (✪✪ 2/7)

- **✪✪** [AverageOfTwoNumbers.md](./exercises/AverageOfTwoNumbers.md) / [AverageOfTwoNumbers.java](./exercises/AverageOfTwoNumbers.java) — Floating-point average of two integers
- **✪✪** [AverageOfThreeNumbers.md](./exercises/AverageOfThreeNumbers.md) / [AverageOfThreeNumbers.java](./exercises/AverageOfThreeNumbers.java) — Floating-point average of three integers
- **✪✪** [SimpleCalculator.md](./exercises/SimpleCalculator.md) / [SimpleCalculator.java](./exercises/SimpleCalculator.java) — Multi-operation arithmetic suite
- **✪✪** [BillSplitter.md](./exercises/BillSplitter.md) / [BillSplitter.java](./exercises/BillSplitter.java) — Real-world stepped financial division and tip calculations

---

## 3. Common Calculation Pitfalls

- **Division by Zero:** Dividing an integer by zero (`count / 0`) crashes the program with an `ArithmeticException`. Always verify divisors are non-zero before division.
- **Silent Integer Overflow:** Java 32-bit `int` values wrap around silently past $2^{31}-1$ ($2{,}147{,}483{,}647$):
  ```java
  int max = 2147483647;
  System.out.println(max + 1); // prints -2147483648
  ```
  For larger numbers, use the 64-bit `long` data type.
- **Copy Semantics in Assignment:** Variable assignment (`=`) copies values by value at a single point in time. Changing the original variable later does not update variables assigned from it earlier.

### Variable State Trace

```java
int first = 2;
int second = first + 5; // 7

first = 10; // first is now 10; second remains 7

int third = first + second; // 10 + 7 = 17
```

| Step | Statement | `first` | `second` | `third` | Output |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 1 | `int first = 2;` | `2` | — | — | — |
| 2 | `int second = first + 5;` | `2` | `7` | — | — |
| 3 | `first = 10;` | `10` | `7` | — | — |
| 4 | `int third = first + second;` | `10` | `7` | `17` | — |

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Seconds in a Day | Arithmetic multiplication chain | [SecondsInADay.md](./exercises/SecondsInADay.md) | [SecondsInADay.java](./exercises/SecondsInADay.java) | `./gradlew test --tests "part01.s05calculating.exercises.SecondsInADayTest"` |
| **Tier 1** | ✪ | Sum of Two Numbers | Two-variable addition | [SumOfTwoNumbers.md](./exercises/SumOfTwoNumbers.md) | [SumOfTwoNumbers.java](./exercises/SumOfTwoNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.SumOfTwoNumbersTest"` |
| **Tier 1** | ✪ | Sum of Three Numbers | Three-variable addition | [SumOfThreeNumbers.md](./exercises/SumOfThreeNumbers.md) | [SumOfThreeNumbers.java](./exercises/SumOfThreeNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.SumOfThreeNumbersTest"` |
| **Tier 1** | ✪ | Addition Formula | Formula string formatting | [AdditionFormula.md](./exercises/AdditionFormula.md) | [AdditionFormula.java](./exercises/AdditionFormula.java) | `./gradlew test --tests "part01.s05calculating.exercises.AdditionFormulaTest"` |
| **Tier 1** | ✪ | Multiplication Formula | Multiplication equation formatting | [MultiplicationFormula.md](./exercises/MultiplicationFormula.md) | [MultiplicationFormula.java](./exercises/MultiplicationFormula.java) | `./gradlew test --tests "part01.s05calculating.exercises.MultiplicationFormulaTest"` |
| **Tier 2** | ✪✪ | Average of Two Numbers | Double casting in division | [AverageOfTwoNumbers.md](./exercises/AverageOfTwoNumbers.md) | [AverageOfTwoNumbers.java](./exercises/AverageOfTwoNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.AverageOfTwoNumbersTest"` |
| **Tier 2** | ✪✪ | Average of Three Numbers | Multi-variable precision division | [AverageOfThreeNumbers.md](./exercises/AverageOfThreeNumbers.md) | [AverageOfThreeNumbers.java](./exercises/AverageOfThreeNumbers.java) | `./gradlew test --tests "part01.s05calculating.exercises.AverageOfThreeNumbersTest"` |
| **Tier 2** | ✪✪ | Simple Calculator | Multi-operator arithmetic suite | [SimpleCalculator.md](./exercises/SimpleCalculator.md) | [SimpleCalculator.java](./exercises/SimpleCalculator.java) | `./gradlew test --tests "part01.s05calculating.exercises.SimpleCalculatorTest"` |
| **Tier 2** | ✪✪ | Bill Splitter | Decimal currency division and tip | [BillSplitter.md](./exercises/BillSplitter.md) | [BillSplitter.java](./exercises/BillSplitter.java) | `./gradlew test --tests "part01.s05calculating.exercises.BillSplitterTest"` |

---

## Official Documentation

- **Operators:** [Oracle Java Tutorials (Summary of Operators)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)
- **Expressions, Statements, and Blocks:** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html)
- **Type Conversion and Contexts:** [Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se21/html/jls-5.html)
