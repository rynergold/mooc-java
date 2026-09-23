---
path: '/part-2/1-problems-and-patterns'
title: 'Recurring Problems and Patterns to Solve Them'
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Break programming tasks down into input, calculation, and output steps.
> - Calculate square roots using `Math.sqrt()`.
> - Direct program flow using two-way (`if-else`) and multi-way (`if-else if-else`) conditional branching.

---

## 1. Calculations and Dataflow

Programs solve tasks by chaining three steps: reading input, performing calculations on intermediate variables, and printing output.

When performing arithmetic, declare variables with explicit types and assign values directly:

```java
int width = 6;
int height = 4;
int area = width * height;

System.out.println("Area: " + area);
```

### Common Mistakes

- **Uninitialized variables:** In Java, local variables declared inside a method do not receive default values. Using a variable before assigning it causes a compiler error (`variable might not have been initialized`). Always initialize variables at declaration.
- **Integer division truncation:** Dividing two `int` values (such as `5 / 2`) discards the fractional remainder and produces `2`. To retain decimal precision, at least one operand must be a `double` (such as `5.0 / 2`).

#### Practice (✪ 1/7)

- **✪** [Squared.md](./Squared.md) / [Squared.java](./Squared.java) — Read an integer and calculate its square.

---

## 2. Mathematical Functions: `Math.sqrt()`

Java includes mathematical functions in the `java.lang.Math` class. Because the compiler automatically imports packages in `java.lang`, you can call `Math.sqrt()` without an import statement.

The `Math.sqrt(double value)` method takes a `double` and returns its square root as a `double`:

```java
int area = 49;
double sideLength = Math.sqrt(area);

System.out.println("Side length: " + sideLength); // prints 7.0
```

Java automatically widens an `int` passed to `Math.sqrt()` into a `double`. The returned value remains a `double`.

> [!TIP]
> **Modern Java Note: Static Imports**
> If a class uses many math operations, Java allows importing static methods directly:
> ```java
> import static java.lang.Math.sqrt;
> ```
> This allows calling `sqrt(value)` without prefixing `Math.`. In introductory code, keeping `Math.sqrt()` makes the origin of the method explicit.

### Common Mistakes

- **Type mismatch when storing results:** `Math.sqrt()` returns a `double`. Assigning the result directly to an `int` variable causes a compilation error (`incompatible types: possible lossy conversion from double to int`). If an integer is strictly required, convert explicitly using `(int) Math.sqrt(...)`.
- **Negative radicands:** Passing a negative value to `Math.sqrt()` does not throw an exception. It returns `Double.NaN` ("Not a Number"), which propagates silently into subsequent calculations. Verify that inputs are non-negative before computing square roots.

#### Practice (✪✪ 2/7)

- **✪✪** [SquareRootOfSum.md](./SquareRootOfSum.md) / [SquareRootOfSum.java](./SquareRootOfSum.java) — Read two integers, calculate their sum, and print the square root of the sum.

---

## 3. Two-Way Branching

A two-way branch selects between two mutually exclusive execution paths using `if` and `else`:

```java
int balance = 25;

if (balance >= 0) {
    System.out.println("Account in good standing.");
} else {
    System.out.println("Account overdrawn.");
}
```

Java evaluates the condition in parentheses. If the condition is `true`, the `if` block executes. If `false`, the `else` block executes. Exactly one block runs.

### Common Mistakes

- **Accidental assignment in conditions:** In Java, conditions require a `boolean` expression. Writing `if (x = 0)` fails to compile because `=` is assignment, not equality (`==`).
- **Missing braces on multi-line blocks:** Omitting curly braces around an `if` or `else` branch restricts the branch to the single statement immediately following it. Always use curly braces for code blocks.

#### Practice (✪✪ 2/7)

- **✪✪** [AbsoluteValue.md](./AbsoluteValue.md) / [AbsoluteValue.java](./AbsoluteValue.java) — Read an integer and print its absolute value by negating negative numbers.

---

## 4. Multi-Way Branching

When a problem has three or more distinct outcomes, chain conditions using `if`, `else if`, and `else`:

```java
int temperature = 18;

if (temperature > 25) {
    System.out.println("Warm");
} else if (temperature >= 10) {
    System.out.println("Moderate");
} else {
    System.out.println("Cold");
}
```

Java evaluates conditions sequentially from top to bottom. As soon as one condition evaluates to `true`, Java executes that block and skips the remainder of the chain. If no condition matches, the trailing `else` block executes.

### Common Mistakes

- **Shadowed conditions:** Placing a broad condition before a narrow one prevents the narrow branch from ever running. For example, checking `temperature > 0` before `temperature > 25` catches all values above 25 in the first branch. Always order conditions from most specific to least specific.
- **Missing fallback cases:** Omitting the final `else` branch means execution can fall through without handling unexpected values. Use a trailing `else` to handle edge cases or default states.

#### Practice (✪✪ 2/7)

- **✪✪** [ComparingNumbers.md](./ComparingNumbers.md) / [ComparingNumbers.java](./ComparingNumbers.java) — Read two integers and report whether the first is greater than, smaller than, or equal to the second.

---

## 5. Next Steps

Linear execution and branching run code once from start to finish. In [Section 2.2: Repeating Functionality](../s02repeating/2-repeating.md), you will use loops to run code blocks repeatedly until specific exit conditions are met.
