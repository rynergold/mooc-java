---
path: "/part-1/6-conditional-statements"
title: "Conditional Statements"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Control execution flow using `if`, `else if`, and `else` branches.
> - Apply comparison operators (`==`, `!=`, `<`, `>`, `<=`, `>=`) to evaluate boolean expressions.
> - Distinguish reference equality (`==`) from character content equality (`.equals()`) for strings.
> - Combine conditions using logical operators (`&&`, `||`, `!`) with short-circuit evaluation.
> - Test divisibility and parity using the remainder operator (`%`).
> - Order conditional branches from most restrictive to least restrictive to prevent unreachable logic.

---

## 1. Branching Logic & Comparison Operators

Java programs execute sequentially from top to bottom unless directed otherwise. A **conditional statement** branches execution by evaluating a boolean expression at runtime.

```java
int speed = 125;

if (speed > 120) {
    System.out.println("Speeding ticket!");
}
```

An `if` statement consists of:
1. The `if` keyword.
2. A condition enclosed in parentheses `(...)` evaluating to `true` or `false`.
3. A code block enclosed in curly brackets `{ ... }` that runs only when the condition is `true`.

If the condition evaluates to `false`, the program skips the block and continues with the next statement after the closing bracket `}`.

### Code Blocks & Indentation

A code block is bounded by opening `{` and closing `}` braces. Every nested block indents four spaces deeper than its enclosing scope.

```java
public class SpeedCheck {
    public static void main(String[] args) {
        int speed = 130;

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
```

Consistent indentation reflects scope hierarchy and prevents logical reading errors.

### Comparison Operators

Comparison (relational) operators compare two primitive values and produce a `boolean` result:

| Operator | Meaning | Example (`x = 5`) | Result |
| :--- | :--- | :--- | :--- |
| `>` | Greater than | `x > 3` | `true` |
| `>=` | Greater than or equal to | `x >= 5` | `true` |
| `<` | Less than | `x < 2` | `false` |
| `<=` | Less than or equal to | `x <= 5` | `true` |
| `==` | Equal to | `x == 5` | `true` |
| `!=` | Not equal to | `x != 0` | `true` |

### Alternative Execution: `else`

When a program must execute one block when a condition passes and a different block when it fails, append an `else` block:

```java
int age = 16;

if (age >= 18) {
    System.out.println("You are an adult");
} else {
    System.out.println("You are not an adult");
}
```

The `if` and `else` branches are mutually exclusive. Exactly one branch executes.

### Comparing Strings: `.equals()` vs. `==`

Comparing primitive types (`int`, `double`, `boolean`) with `==` checks the raw binary values in memory.

Strings in Java are objects stored on the heap. A `String` variable holds a reference (memory address) pointing to the object:

```
Stack                           Heap
[ input   ] ---> (0x20A4) ---> "secret"
[ passkey ] ---> (0x80F2) ---> "secret"
```

- `==` compares references (memory addresses). Two distinct string objects with identical text reside at different addresses, so `input == passkey` evaluates to `false`.
- `.equals()` inspects the actual characters inside the string objects.

```java
Scanner scanner = new Scanner(System.in);
String password = scanner.nextLine();

// Incorrect: compares heap addresses
if (password == "Caput Draconis") { ... }

// Correct: compares character contents
if (password.equals("Caput Draconis")) {
    System.out.println("Welcome!");
} else {
    System.out.println("Off with you!");
}
```

Always use `.equals()` to check string equality.

---

## 2. Progressive Practice: Foundation

### Example 1: Threshold & String Verification

Testing a numeric threshold and matching a string passkey:

```java
int speed = 135;
String passkey = "open sesame";

if (speed > 120) {
    System.out.println("Speeding ticket!");
}

if (passkey.equals("open sesame")) {
    System.out.println("Access granted.");
} else {
    System.out.println("Access denied.");
}
```

#### Practice (✪ 1/7)

- **✪** [SpeedingTicket.md](./exercises/SpeedingTicket.md) / [SpeedingTicket.java](./exercises/SpeedingTicket.java) — Integer threshold check (`> 120`)
- **✪** [CheckYourIndentation.md](./exercises/CheckYourIndentation.md) / [CheckYourIndentation.java](./exercises/CheckYourIndentation.java) — Code block formatting and 4-space indentation
- **✪** [Orwell.md](./exercises/Orwell.md) / [Orwell.java](./exercises/Orwell.java) — Exact integer equality (`== 1984`)
- **✪** [Ancient.md](./exercises/Ancient.md) / [Ancient.java](./exercises/Ancient.java) — Strict numeric inequality (`< 2015`)
- **✪** [Positivity.md](./exercises/Positivity.md) / [Positivity.java](./exercises/Positivity.java) — Positive vs non-positive binary branch (`> 0`)
- **✪** [Adulthood.md](./exercises/Adulthood.md) / [Adulthood.java](./exercises/Adulthood.java) — Age majority binary branch (`>= 18`)
- **✪** [Password.md](./exercises/Password.md) / [Password.java](./exercises/Password.java) — String equality checking with `.equals()`
- **✪** [Same.md](./exercises/Same.md) / [Same.java](./exercises/Same.java) — Comparing two user-provided strings with `.equals()`

---

## 3. Multi-Branching, Remainder & Logical Operators

### Multi-Way Branching: `else if`

When selecting among more than two alternatives, chain conditions using `else if`:

```java
int score = 75;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

#### Top-Down Evaluation Order

Java evaluates chained conditions from top to bottom. Execution branches into the **first** condition that evaluates to `true`. Once that block finishes, Java exits the entire chain, skipping all remaining `else if` and `else` branches.

### Remainder Operator (`%`)

The `%` operator returns the integer remainder after division. It tests divisibility: an integer $n$ is divisible by $d$ if and only if `n % d == 0`.

```java
int number = 14;

if (number % 2 == 0) {
    System.out.println("Number " + number + " is even.");
} else {
    System.out.println("Number " + number + " is odd.");
}
```

In Java, `%` preserves the sign of the left operand (`-7 % 2` is `-1`). Testing `remainder == 0` evaluates consistently for positive and negative numbers.

### Logical Operators

Logical operators combine or invert boolean expressions:

| Operator | Name | Meaning | Truth Condition |
| :--- | :--- | :--- | :--- |
| `&&` | Logical AND | Both operands must be true | `true` only if both `A` and `B` evaluate to `true` |
| `\|\|` | Logical OR | At least one operand must be true | `true` if either `A` or `B` evaluates to `true` |
| `!` | Logical NOT | Inverts the boolean operand | `!true` is `false`, `!false` is `true` |

```java
int age = 25;

if (age >= 0 && age <= 120) {
    System.out.println("OK");
} else {
    System.out.println("Impossible!");
}
```

### Short-Circuit Evaluation

Java evaluates `&&` and `||` using **short-circuit evaluation**:
- In `A && B`, if `A` is `false`, Java does not evaluate `B` (the result is guaranteed `false`).
- In `A || B`, if `A` is `true`, Java does not evaluate `B` (the result is guaranteed `true`).

This property prevents runtime exceptions such as division by zero:

```java
int count = 0;
int total = 100;

if (count != 0 && total / count > 5) {
    System.out.println("Above average");
}
```

Because `count != 0` evaluates to `false`, Java skips `total / count > 5`, preventing an `ArithmeticException`.

---

## 4. Progressive Practice: Intermediate

### Example 2: Range Boundaries & Parity Testing

Combining range checks, multi-way branching, and parity testing:

```java
int points = 82;

if (points < 0 || points > 100) {
    System.out.println("Impossible!");
} else if (points >= 80) {
    System.out.println("Grade: 4");
} else if (points >= 60) {
    System.out.println("Grade: 3");
} else {
    System.out.println("Grade: failed");
}
```

#### Evaluation Trace Table

| Input `points` | `points < 0 \|\| points > 100` | `points >= 80` | `points >= 60` | Branch Executed | Output |
| :--- | :--- | :--- | :--- | :--- | :--- |
| `105` | `true` | — (skipped) | — (skipped) | 1st branch (`if`) | `"Impossible!"` |
| `82` | `false` | `true` | — (skipped) | 2nd branch (`else if`) | `"Grade: 4"` |
| `65` | `false` | `false` | `true` | 3rd branch (`else if`) | `"Grade: 3"` |
| `45` | `false` | `false` | `false` | 4th branch (`else`) | `"Grade: failed"` |

#### Practice (✪✪ 2/7)

- **✪✪** [LargerThanOrEqualTo.md](./exercises/LargerThanOrEqualTo.md) / [LargerThanOrEqualTo.java](./exercises/LargerThanOrEqualTo.java) — Compare two integers with equality tie handling
- **✪✪** [GradesAndPoints.md](./exercises/GradesAndPoints.md) / [GradesAndPoints.java](./exercises/GradesAndPoints.java) — Multi-tier score grading scale with invalid input boundaries
- **✪✪** [OddOrEven.md](./exercises/OddOrEven.md) / [OddOrEven.java](./exercises/OddOrEven.java) — Parity checking using remainder operator `% 2 == 0`
- **✪✪** [CheckingTheAge.md](./exercises/CheckingTheAge.md) / [CheckingTheAge.java](./exercises/CheckingTheAge.java) — Validating human age limits using compound `&&` conditions

---

## 5. Restrictive Ordering & Stepped Logic

When multiple conditions can match the same input, order branches from **most restrictive to least restrictive**.

### The Unreachable Branch Trap

Consider the FizzBuzz rule:
- Print `"FizzBuzz"` if divisible by both 3 and 5.
- Print `"Fizz"` if divisible by 3.
- Print `"Buzz"` if divisible by 5.

If individual conditions precede the compound condition:

```java
// Incorrect: 15 satisfies (15 % 3 == 0) first, printing "Fizz"
if (number % 3 == 0) {
    System.out.println("Fizz");
} else if (number % 5 == 0) {
    System.out.println("Buzz");
} else if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz"); // Unreachable!
}
```

Placing the most restrictive condition first ensures inputs matching both criteria execute the correct branch:

```java
// Correct: most restrictive condition evaluated first
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

---

## 6. Progressive Practice: Complex Combinations

### Example 3: Hierarchical Rule Ordering (Leap Year)

A year is a leap year if it is divisible by 4. However, if it is divisible by 100, it is not a leap year unless it is also divisible by 400:

```java
int year = 1900;

if (year % 400 == 0) {
    System.out.println("The year is a leap year.");
} else if (year % 100 == 0) {
    System.out.println("The year is not a leap year.");
} else if (year % 4 == 0) {
    System.out.println("The year is a leap year.");
} else {
    System.out.println("The year is not a leap year.");
}
```

#### Leap Year Trace Table

| Input `year` | `year % 400 == 0` | `year % 100 == 0` | `year % 4 == 0` | Branch Executed | Result |
| :--- | :--- | :--- | :--- | :--- | :--- |
| `2000` | `true` | — (skipped) | — (skipped) | 1st branch | Leap year |
| `1900` | `false` | `true` | — (skipped) | 2nd branch | Not a leap year |
| `2024` | `false` | `false` | `true` | 3rd branch | Leap year |
| `2023` | `false` | `false` | `false` | 4th branch (`else`) | Not a leap year |

#### Practice (✪✪✪ 3/7)

- **✪✪✪** [LeapYear.md](./exercises/LeapYear.md) / [LeapYear.java](./exercises/LeapYear.java) — Multi-rule divisibility ordering (400, 100, 4)
- **✪✪✪** [GiftTax.md](./exercises/GiftTax.md) / [GiftTax.java](./exercises/GiftTax.java) — Progressive tiered bracket calculations with base taxes and percentages

---

## 7. Common Conditionals Pitfalls

- **Semicolon After `if` Parentheses:** Placing a semicolon immediately after the condition terminates the statement:
  ```java
  if (speed > 120); // Empty statement!
  {
      System.out.println("Speeding ticket!"); // Executes unconditionally
  }
  ```
- **Assignment (`=`) vs. Equality (`==`):** Writing `if (x = 5)` attempts an assignment. In Java, this triggers a compiler error for numeric types because `int` cannot convert to `boolean`. For boolean variables, `if (isReady = false)` assigns `false` and evaluates to `false`.
- **Reference Equality on Strings:** Comparing strings with `==` compares heap memory addresses. Always use `first.equals(second)`.
- **Inverted Branch Order:** Placing general conditions before specific conditions shadows the specific conditions, making them unreachable.
- **Short-Circuit Misunderstandings:** Operations inside the right operand of `&&` or `||` do not execute when the left operand determines the outcome.

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Speeding Ticket | Single condition threshold (`> 120`) | [SpeedingTicket.md](./exercises/SpeedingTicket.md) | [SpeedingTicket.java](./exercises/SpeedingTicket.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.SpeedingTicketTest"` |
| **Tier 1** | ✪ | Check Your Indentation | Code block formatting & scope | [CheckYourIndentation.md](./exercises/CheckYourIndentation.md) | [CheckYourIndentation.java](./exercises/CheckYourIndentation.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.CheckYourIndentationTest"` |
| **Tier 1** | ✪ | Orwell | Strict integer equality (`== 1984`) | [Orwell.md](./exercises/Orwell.md) | [Orwell.java](./exercises/Orwell.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.OrwellTest"` |
| **Tier 1** | ✪ | Ancient | Strict integer inequality (`< 2015`) | [Ancient.md](./exercises/Ancient.md) | [Ancient.java](./exercises/Ancient.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.AncientTest"` |
| **Tier 1** | ✪ | Positivity | Binary branch with `if-else` | [Positivity.md](./exercises/Positivity.md) | [Positivity.java](./exercises/Positivity.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.PositivityTest"` |
| **Tier 1** | ✪ | Adulthood | Binary threshold with `if-else` | [Adulthood.md](./exercises/Adulthood.md) | [Adulthood.java](./exercises/Adulthood.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.AdulthoodTest"` |
| **Tier 1** | ✪ | Password | String equality with `.equals()` | [Password.md](./exercises/Password.md) | [Password.java](./exercises/Password.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.PasswordTest"` |
| **Tier 1** | ✪ | Same | Two-variable string comparison | [Same.md](./exercises/Same.md) | [Same.java](./exercises/Same.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.SameTest"` |
| **Tier 2** | ✪✪ | Larger Than or Equal To | Two-variable comparison with tie | [LargerThanOrEqualTo.md](./exercises/LargerThanOrEqualTo.md) | [LargerThanOrEqualTo.java](./exercises/LargerThanOrEqualTo.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.LargerThanOrEqualToTest"` |
| **Tier 2** | ✪✪ | Grades and Points | Multi-bracket `else if` grading scale | [GradesAndPoints.md](./exercises/GradesAndPoints.md) | [GradesAndPoints.java](./exercises/GradesAndPoints.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.GradesAndPointsTest"` |
| **Tier 2** | ✪✪ | Odd or Even | Remainder parity testing (`% 2 == 0`) | [OddOrEven.md](./exercises/OddOrEven.md) | [OddOrEven.java](./exercises/OddOrEven.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.OddOrEvenTest"` |
| **Tier 2** | ✪✪ | Checking the Age | Range validation with logical `&&` | [CheckingTheAge.md](./exercises/CheckingTheAge.md) | [CheckingTheAge.java](./exercises/CheckingTheAge.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.CheckingTheAgeTest"` |
| **Tier 3** | ✪✪✪ | Leap Year | Hierarchical divisibility ordering | [LeapYear.md](./exercises/LeapYear.md) | [LeapYear.java](./exercises/LeapYear.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.LeapYearTest"` |
| **Tier 3** | ✪✪✪ | Gift Tax | Stepped tax bracket calculation | [GiftTax.md](./exercises/GiftTax.md) | [GiftTax.java](./exercises/GiftTax.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.GiftTaxTest"` |

---

## Advanced Practice Drills

Ready to test your logic on real-world edge cases and progressive overload challenges?

👉 **Next Step:** Continue to [6.5 Logic, Math & Conditional Drills](./exercises/drills/6.5-logic-drills.md) for 25 targeted drill exercises covering guard clauses, the waterfall pattern, interval collisions, and modular clock arithmetic.

---

## Official Documentation

- **Control Flow Statements (The if-then and if-then-else Statements):** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
- **Equality, Relational, and Conditional Operators:** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)
- **String Class (`equals`):** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#equals(java.lang.Object))

