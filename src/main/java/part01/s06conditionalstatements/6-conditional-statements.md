---
path: '/part-1/6-conditional-statements'
title: 'Conditional Statements'
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Control execution flow using `if`, `else if`, and `else` branches.
> - Apply comparison operators (`==`, `!=`, `<`, `>`, `<=`, `>=`) to evaluate boolean conditions.
> - Combine expressions using logical operators (`&&`, `||`, `!`) with short-circuit evaluation.
> - Distinguish reference equality (`==`) from value equality (`.equals()`) for strings.
> - Order conditional branches from most restrictive to least restrictive to prevent unreachable logic.

---

## Branching Logic and Conditional Statements

Programs execute sequentially from top to bottom unless directed otherwise. A **conditional statement** branches execution by evaluating a boolean expression at runtime.

```java
int number = 11;

if (number > 10) {
    System.out.println("The number was greater than 10");
}
```

An `if` statement consists of:
1. The `if` keyword.
2. A condition inside parentheses `(...)` that evaluates to a `boolean` (`true` or `false`).
3. A code block enclosed by curly brackets `{ ... }` that runs only when the condition is `true`.

If the condition evaluates to `false`, the program skips the block and continues with the statement immediately following the closing bracket `}`.

> [!IMPORTANT]
> Never place a semicolon immediately after the parentheses: `if (number > 10);`. In Java, an empty statement ends at the semicolon, causing the subsequent block `{ ... }` to execute unconditionally regardless of the test result.

### Code Blocks and Indentation

A code block is bounded by opening `{` and closing `}` braces. Every nested block indents four spaces deeper than its enclosing scope.

```java
public class Example {
    public static void main(String[] args) {
        int speed = 130;

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
```

Consistent indentation prevents logical misunderstandings when reading nested structures.

👉 **Ready?** Open [SpeedingTicket.md](./SpeedingTicket.md) / [SpeedingTicket.java](./SpeedingTicket.java)  
👉 **Ready?** Open [CheckYourIndentation.md](./CheckYourIndentation.md) / [CheckYourIndentation.java](./CheckYourIndentation.java)

---

## Comparison Operators

Comparison (relational) operators compare two values and produce a `boolean` result:

| Operator | Meaning | Example (`x = 5`) | Result |
| :--- | :--- | :--- | :--- |
| `>` | Greater than | `x > 3` | `true` |
| `>=` | Greater than or equal to | `x >= 5` | `true` |
| `<` | Less than | `x < 2` | `false` |
| `<=` | Less than or equal to | `x <= 5` | `true` |
| `==` | Equal to | `x == 5` | `true` |
| `!=` | Not equal to | `x != 0` | `true` |

```java
int year = 1984;

if (year == 1984) {
    System.out.println("Orwell");
}
```

> [!CAUTION]
> Do not confuse the assignment operator `=` with the equality comparison operator `==`. `x = 5` assigns the value 5 to `x`, while `x == 5` tests whether `x` equals 5.

👉 **Ready?** Open [Orwell.md](./Orwell.md) / [Orwell.java](./Orwell.java)  
👉 **Ready?** Open [Ancient.md](./Ancient.md) / [Ancient.java](./Ancient.java)

---

## Alternative Execution: else

When a program needs to run one block when a condition holds and another block when it does not, use `else`:

```java
int age = 15;

if (age >= 18) {
    System.out.println("You are an adult");
} else {
    System.out.println("You are not an adult");
}
```

The `if` and `else` blocks are mutually exclusive. Exactly one block runs during execution.

👉 **Ready?** Open [Positivity.md](./Positivity.md) / [Positivity.java](./Positivity.java)  
👉 **Ready?** Open [Adulthood.md](./Adulthood.md) / [Adulthood.java](./Adulthood.java)

---

## Multi-Way Branching: else if

When choosing among more than two alternatives, chain conditions with `else if`:

```java
int number = 2;

if (number == 1) {
    System.out.println("The number is one");
} else if (number == 2) {
    System.out.println("The number is two");
} else if (number == 3) {
    System.out.println("The number is three");
} else {
    System.out.println("Something else!");
}
```

### Top-Down Evaluation Order

Java evaluates chained conditions from top to bottom. Execution branches into the **first** block whose condition evaluates to `true`. Once a matching block completes, the entire structure terminates, skipping all remaining `else if` and `else` branches.

```java
int number = 5;

if (number > 0) {
    System.out.println("Greater than 0");
} else if (number > 4) {
    System.out.println("Greater than 4"); // Never reached when number is 5
}
```

Because `5 > 0` evaluates to `true`, the program prints `"Greater than 0"` and exits the chain. The condition `number > 4` is never evaluated.

👉 **Ready?** Open [LargerThanOrEqualTo.md](./LargerThanOrEqualTo.md) / [LargerThanOrEqualTo.java](./LargerThanOrEqualTo.java)  
👉 **Ready?** Open [GradesAndPoints.md](./GradesAndPoints.md) / [GradesAndPoints.java](./GradesAndPoints.java)

---

## Boolean Variables and the Remainder Operator

The condition in an `if` statement is an expression of type `boolean`. Boolean expressions can be stored directly in variables:

```java
int points = 85;
boolean passed = points >= 50;

if (passed) {
    System.out.println("Course passed.");
}
```

### Remainder Operator (`%`)

The `%` operator computes the integer remainder after division. It tests divisibility: a number $n$ is divisible by $d$ if and only if `n % d == 0`.

```java
int number = 8;

if (number % 2 == 0) {
    System.out.println("Number is even.");
} else {
    System.out.println("Number is odd.");
}
```

In Java, `%` preserves the sign of the dividend (left operand). For example, `-7 % 2` evaluates to `-1`. Testing `number % 2 == 0` works correctly for both positive and negative even numbers because zero has no sign.

👉 **Ready?** Open [OddOrEven.md](./OddOrEven.md) / [OddOrEven.java](./OddOrEven.java)

---

## Comparing Strings: .equals() vs. ==

Comparing primitive types (`int`, `double`, `boolean`) with `==` compares the raw binary values stored in variable memory.

Strings in Java are reference types (objects) stored on the heap. A `String` variable contains an address (reference) pointing to that object:

```
Stack                        Heap
[ first  ] ---> (0x10A4) ---> "hello"
[ second ] ---> (0x20B8) ---> "hello"
```

- `==` compares references (memory addresses). Two distinct string objects with identical text reside at different addresses, so `first == second` evaluates to `false`.
- `.equals()` inspects the actual characters contained within the string objects.

```java
Scanner scanner = new Scanner(System.in);
String password = scanner.nextLine();

// Incorrect: compares memory addresses
if (password == "Caput Draconis") { ... }

// Correct: compares character contents
if (password.equals("Caput Draconis")) {
    System.out.println("Welcome!");
} else {
    System.out.println("Off with you!");
}
```

Always use `.equals()` to check string equality.

👉 **Ready?** Open [Password.md](./Password.md) / [Password.java](./Password.java)  
👉 **Ready?** Open [Same.md](./Same.md) / [Same.java](./Same.java)

---

## Logical Operators

Logical operators combine or negate boolean conditions:

| Operator | Name | Meaning |
| :--- | :--- | :--- |
| `&&` | Logical AND | `true` only if both operands evaluate to `true` |
| `\|\|` | Logical OR | `true` if at least one operand evaluates to `true` |
| `!` | Logical NOT | Inverts the boolean value (`!true` is `false`, `!false` is `true`) |

```java
int age = 25;

if (age >= 0 && age <= 120) {
    System.out.println("OK");
} else {
    System.out.println("Impossible!");
}
```

### Truth Table

| `A` | `B` | `A && B` | `A \|\| B` | `!A` |
| :--- | :--- | :--- | :--- | :--- |
| `false` | `false` | `false` | `false` | `true` |
| `false` | `true` | `false` | `true` | `true` |
| `true` | `false` | `false` | `true` | `false` |
| `true` | `true` | `true` | `true` | `false` |

### Short-Circuit Evaluation

Java evaluates `&&` and `||` using **short-circuit evaluation**:
- In `A && B`, if `A` evaluates to `false`, the entire expression must be `false`. Java does not evaluate `B`.
- In `A || B`, if `A` evaluates to `true`, the entire expression must be `true`. Java does not evaluate `B`.

This property avoids redundant computations and guards against runtime exceptions (such as division by zero or calling methods on `null` references):

```java
int count = 0;
int total = 100;

if (count != 0 && total / count > 5) {
    System.out.println("Above average");
}
```

Because `count != 0` evaluates to `false`, Java does not evaluate `total / count > 5`, preventing an `ArithmeticException` (division by zero).

👉 **Ready?** Open [CheckingTheAge.md](./CheckingTheAge.md) / [CheckingTheAge.java](./CheckingTheAge.java)

---

## Execution Flow: Ordering Restrictions

When multiple conditions can match the same input, order branches from **most restrictive to least restrictive**.

Consider the classic FizzBuzz requirement:
- Print `"FizzBuzz"` if divisible by both 3 and 5.
- Print `"Fizz"` if divisible by 3.
- Print `"Buzz"` if divisible by 5.

If the individual conditions appear before the combined condition:

```java
// Incorrect ordering: 15 prints "Fizz", not "FizzBuzz"
if (number % 3 == 0) {
    System.out.println("Fizz");
} else if (number % 5 == 0) {
    System.out.println("Buzz");
} else if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz"); // Unreachable
}
```

Placing the compound condition first guarantees that numbers meeting both criteria execute the correct branch:

```java
// Correct ordering: most restrictive condition first
if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz");
} else if (number % 3 == 0) {
    System.out.println("Fizz");
} else if (number % 5 == 0) {
    System.out.println("Buzz");
} else {
    System.out.println(number);
}
```

### Trace Table: Step-by-Step Resolution

| Input `number` | `n % 3 == 0 && n % 5 == 0` | `n % 3 == 0` | `n % 5 == 0` | Branch Taken | Output |
| :--- | :--- | :--- | :--- | :--- | :--- |
| `3` | `false` | `true` | — (skipped) | 2nd branch | `"Fizz"` |
| `5` | `false` | `false` | `true` | 3rd branch | `"Buzz"` |
| `15` | `true` | — (skipped) | — (skipped) | 1st branch | `"FizzBuzz"` |
| `7` | `false` | `false` | `false` | `else` branch | `"7"` |

👉 **Ready?** Open [LeapYear.md](./LeapYear.md) / [LeapYear.java](./LeapYear.java)  
👉 **Ready?** Open [GiftTax.md](./GiftTax.md) / [GiftTax.java](./GiftTax.java)

---

## Official Documentation

- **Control Flow Statements (The if-then and if-then-else Statements):** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
- **Equality, Relational, and Conditional Operators:** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)
- **String Class (`equals`):** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#equals(java.lang.Object))
