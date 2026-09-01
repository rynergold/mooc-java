---
path: '/part-1/5-calculating'
title: 'Calculating with Numbers'
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Perform calculations using variables and arithmetic operators (`+`, `-`, `*`, `/`).
> - Control evaluation order with operator precedence and parentheses.
> - Format print statements combining text strings with expressions.
> - Handle integer division, double casting, and floating-point calculations.
> - Trace variable state changes during execution.

---

## Arithmetic Operators & Precedence

Java supports standard arithmetic operators: addition `+`, subtraction `-`, multiplication `*`, and division `/`.

```java
int first = 2;
int second = 4;
int sum = first + second; // sum is 6
```

### Precedence and Parentheses

Java follows standard mathematical order of operations:
1. Operations inside parentheses `(...)` evaluate first.
2. Multiplication `*` and division `/` evaluate before addition `+` and subtraction `-`.
3. Operators of equal precedence evaluate left to right.

```java
int withParentheses = (1 + 1) + 3 * (2 + 5); // (2) + 3 * (7) = 2 + 21 = 23
int withoutParentheses = 1 + 1 + 3 * 2 + 5;  // 1 + 1 + 6 + 5 = 13
```

### Expressions vs. Statements

An **expression** produces a single value when evaluated (e.g. `2 + 3 * 4`).  
A **statement** is a complete instruction ending in a semicolon (e.g. `int result = 2 + 3 * 4;`).

Expressions evaluate at the point where they appear in code, including directly inside `System.out.println()`:

```java
int first = 2;
int second = 4;
System.out.println(first + second); // prints 6
```

An expression alone does not change a variable's stored value unless the result is assigned back with `=`:

```java
int x = 5;
x + 10; // Does not compile: not a statement
x = x + 10; // Valid: x is now 15
```

👉 **Ready?** Open [SecondsInADay.md](./SecondsInADay.md) / [SecondsInADay.java](./SecondsInADay.java)

---

## String Concatenation and Evaluation Order

The `+` operator performs arithmetic addition when used between numbers, and string concatenation when at least one operand is a `String`.

```java
int length = 42;
System.out.println("Length: " + length); // prints "Length: 42"
```

Because expressions evaluate from left to right, placing a string first converts subsequent additions into string joins:

```java
System.out.println("Total: " + 2 + 2);   // prints "Total: 22"
System.out.println("Total: " + (2 + 2)); // prints "Total: 4"
System.out.println(2 + 2 + " Total");   // prints "4 Total"
```

In `"Total: " + 2 + 2`:
1. `"Total: " + 2` evaluates to `"Total: 2"`.
2. `"Total: 2" + 2` evaluates to `"Total: 22"`.

Use parentheses whenever you want arithmetic addition inside a print statement.

👉 **Ready?** Open [SumOfTwoNumbers.md](./SumOfTwoNumbers.md) / [SumOfTwoNumbers.java](./SumOfTwoNumbers.java)  
👉 **Ready?** Open [SumOfThreeNumbers.md](./SumOfThreeNumbers.md) / [SumOfThreeNumbers.java](./SumOfThreeNumbers.java)  
👉 **Ready?** Open [AdditionFormula.md](./AdditionFormula.md) / [AdditionFormula.java](./AdditionFormula.java)  
👉 **Ready?** Open [MultiplicationFormula.md](./MultiplicationFormula.md) / [MultiplicationFormula.java](./MultiplicationFormula.java)

---

## Integer Limits and Overflow

Java `int` variables use 32-bit signed two's complement representation. The valid range spans $-2^{31}$ to $2^{31}-1$ ($-2{,}147{,}483{,}648$ to $2{,}147{,}483{,}647$).

When a calculation exceeds these bounds, Java does not throw an error. It wraps around silently (overflow/underflow):

```java
int max = 2147483647;
System.out.println(max + 1); // prints -2147483648
```

For numbers outside this range, use the 64-bit `long` data type.

---

## Division: Integers vs. Floating-Point Numbers

Division behavior in Java depends on operand types:

### 1. Integer Division (Truncation)

When both operands are integers, the result is always an integer. Java truncates the fractional part completely:

```java
int result = 3 / 2; // evaluates to 1 (not 1.5)
```

Assigning the result of integer division to a `double` variable does not recover the discarded fraction:

```java
double value = 3 / 2; // evaluates 3 / 2 -> 1, then stores 1.0
```

### 2. Floating-Point Division

If either operand is a floating-point number (`double`), Java performs floating-point division:

```java
double a = 3.0 / 2; // 1.5
double b = 3 / 2.0; // 1.5
```

### 3. Type Casting with `(double)`

To divide integer variables with decimal precision, cast at least one operand to `double`:

```java
int first = 3;
int second = 2;

double correct = (double) first / second; // 1.5
double alsoCorrect = 1.0 * first / second; // 1.5
double incorrect = (double) (first / second); // 1.0 (integer division happens before casting)
```

👉 **Ready?** Open [AverageOfTwoNumbers.md](./AverageOfTwoNumbers.md) / [AverageOfTwoNumbers.java](./AverageOfTwoNumbers.java)  
👉 **Ready?** Open [AverageOfThreeNumbers.md](./AverageOfThreeNumbers.md) / [AverageOfThreeNumbers.java](./AverageOfThreeNumbers.java)  
👉 **Ready?** Open [SimpleCalculator.md](./SimpleCalculator.md) / [SimpleCalculator.java](./SimpleCalculator.java)

---

## Variable Assignment: Copy Semantics

Variable assignment (`=`) copies the value from the right-hand side to the variable on the left-hand side at that exact moment.

### Common Misconceptions

1. **Assignment is a copy, not a move:** `first = second;` leaves `second` unchanged.
2. **Assignment is a point-in-time snapshot, not a live binding:** changing `second` later will not update `first`.
3. **Direction flows right-to-left:** the value on the right is assigned to the variable name on the left.

### Trace Example

```java
int first = (1 + 1);             // first is 2
int second = first + 3 * (2 + 5); // second is 2 + 21 = 23

first = 5;                       // first is now 5; second remains 23

int third = first + second;       // third is 5 + 23 = 28
```

| Step | Statement | `first` | `second` | `third` | Output |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 1 | `int first = (1 + 1);` | `2` | — | — | — |
| 2 | `int second = first + 3 * (2 + 5);` | `2` | `23` | — | — |
| 3 | `first = 5;` | `5` | `23` | — | — |
| 4 | `int third = first + second;` | `5` | `23` | `28` | — |

---

## Official Documentation

* **Operators**: [Oracle Java Tutorials (Summary of Operators)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)
* **Primitive Data Types**: [Oracle Java Tutorials (Primitive Data Types)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
* **Expressions, Statements, and Blocks**: [Oracle Java Tutorials (Expressions, Statements, and Blocks)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html)
