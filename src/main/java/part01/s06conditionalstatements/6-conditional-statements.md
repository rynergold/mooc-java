---
path: "/part-1/6-conditional-statements"
title: "Conditional Statements"
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - Control program execution using `if`, `else if`, and `else` branches.
> - Apply comparison operators (`==`, `!=`, `<`, `>`, `<=`, `>=`) to evaluate boolean conditions.
> - Distinguish reference equality (`==`) from character content equality (`.equals()`) for strings.
> - Combine conditions using logical operators (`&&`, `||`, `!`) with short-circuit evaluation.
> - Use the remainder operator (`%`) to test divisibility.
> - Order conditional branches from most specific to least specific so all conditions can be reached.

---

## 1. Branching Logic & Comparison Operators

Java programs execute sequentially from top to bottom unless directed otherwise. A **conditional statement** allows code to take different paths depending on whether a condition is `true` or `false`.

```java
int freezerTemperature = 4;

if (freezerTemperature > 0) {
    System.out.println("Warning: Freezer temperature is above 0 degrees!");
}
```

### Key Terminology Explained

- **Conditional Statement (`if`):** A structure that runs a block of code only if its condition evaluates to `true`.
- **Boolean Expression:** A statement that evaluates to either `true` or `false`.
- **Code Block (`{ ... }`):** Code enclosed within curly braces that belongs together. In Java, lines inside a block are indented four spaces.
- **Comparison (Relational) Operators:** Operators that compare two primitive values and return a boolean result (`true` or `false`).

### Comparison Operators

| Operator | Meaning | Example (`x = 5`) | Result |
| :--- | :--- | :--- | :--- |
| `>` | Greater than | `x > 3` | `true` |
| `>=` | Greater than or equal to | `x >= 5` | `true` |
| `<` | Less than | `x < 2` | `false` |
| `<=` | Less than or equal to | `x <= 5` | `true` |
| `==` | Equal to | `x == 5` | `true` |
| `!=` | Not equal to | `x != 0` | `true` |

### Alternative Execution: `else`

When a program needs to do one thing if a condition is met and something else if it is not, add an `else` branch:

```java
int passCredits = 5;

if (passCredits > 0) {
    System.out.println("Access granted to the workshop.");
} else {
    System.out.println("No credits remaining. Please top up.");
}
```

The `if` and `else` blocks are mutually exclusive. Exactly one branch executes.

### Comparing Strings: `.equals()` vs. `==`

Variables for primitive types (`int`, `double`, `boolean`) hold values directly in their memory containers. The `==` operator compares the contents of those containers.

Strings in Java are objects. A `String` variable holds a reference (memory address) pointing to where the text is stored in memory:

```
Stack                           Heap
[ input   ] ---> (0x20A4) ---> "secret"
[ passkey ] ---> (0x80F2) ---> "secret"
```

- `==` compares the memory addresses. Two strings created separately have different memory addresses, so `input == passkey` evaluates to `false` even if the words are identical.
- `.equals()` looks inside the memory addresses and compares the actual sequence of characters.

```java
Scanner scanner = new Scanner(System.in);
System.out.println("Enter operational status code:");
String status = scanner.nextLine();

// Incorrect: compares memory addresses
if (status == "ACTIVE") { ... }

// Correct: compares the text characters
if (status.equals("ACTIVE")) {
    System.out.println("System is operational.");
} else {
    System.out.println("System is offline or in maintenance.");
}
```

Always use `.equals()` when comparing text.

---

## 2. Progressive Practice: Foundation

### Example 1: Threshold and String Verification

Testing a numeric threshold and checking an exact code:

```java
int stockCount = 150;
String departmentCode = "ENG-42";

if (stockCount > 100) {
    System.out.println("Storage is near capacity.");
}

if (departmentCode.equals("ENG-42")) {
    System.out.println("Access granted to technical wing.");
} else {
    System.out.println("Visitor pass required.");
}
```

#### Practice (✪ 1/7)

- **✪** [SpeedingTicket.md](./exercises/SpeedingTicket.md) / [SpeedingTicket.java](./exercises/SpeedingTicket.java) — Numeric threshold check (`> 120`)
- **✪** [CheckYourIndentation.md](./exercises/CheckYourIndentation.md) / [CheckYourIndentation.java](./exercises/CheckYourIndentation.java) — Code block formatting and 4-space indentation
- **✪** [Orwell.md](./exercises/Orwell.md) / [Orwell.java](./exercises/Orwell.java) — Exact integer equality (`== 1984`)
- **✪** [Ancient.md](./exercises/Ancient.md) / [Ancient.java](./exercises/Ancient.java) — Strict numeric comparison (`< 2015`)
- **✪** [Positivity.md](./exercises/Positivity.md) / [Positivity.java](./exercises/Positivity.java) — Positive vs non-positive binary branch (`> 0`)
- **✪** [Adulthood.md](./exercises/Adulthood.md) / [Adulthood.java](./exercises/Adulthood.java) — Age threshold branch (`>= 18`)
- **✪** [Password.md](./exercises/Password.md) / [Password.java](./exercises/Password.java) — Checking text equality with `.equals()`
- **✪** [Same.md](./exercises/Same.md) / [Same.java](./exercises/Same.java) — Comparing two user strings with `.equals()`

---

## 3. Multiple Conditions, Remainder & Logical Operators

### Checking Multiple Conditions with `else if`

When choosing among more than two alternatives, chain conditions using `else if`:

```java
int waterTemperature = 45;

if (waterTemperature <= 0) {
    System.out.println("State: Solid (Ice)");
} else if (waterTemperature < 100) {
    System.out.println("State: Liquid (Water)");
} else {
    System.out.println("State: Gas (Steam)");
}
```

Java evaluates chained conditions from top to bottom. Execution enters the **first** condition that evaluates to `true`. Once that branch finishes, Java exits the chain and skips all remaining branches.

> [!TIP]
> **Modern Java Note: Switch Expressions (Java 14+)**
> When testing a variable against specific exact values rather than ranges, Java 14+ **switch expressions** offer a clean alternative to long `if-else if` chains:
> ```java
> String dayName = switch (dayNumber) {
>     case 1 -> "Monday";
>     case 2 -> "Tuesday";
>     default -> "Other day";
> };
> ```
> For range checks (like `temp <= 0`) or compound conditions, `if-else if` chains remain the standard tool.

### The Remainder Operator (`%`)

The `%` operator computes the integer remainder left over after division. It is used to test divisibility: a number $n$ divides evenly by $d$ if `n % d == 0`.

Checking if items can be packaged into full boxes of 6:

```java
int items = 24;

if (items % 6 == 0) {
    System.out.println("The items fill full boxes of 6.");
} else {
    int leftover = items % 6;
    System.out.println("Leftover items that do not fill a box: " + leftover);
}
```

### Logical Operators

Logical operators combine or invert boolean expressions:

| Operator | Name | Meaning | Truth Condition |
| :--- | :--- | :--- | :--- |
| `&&` | Logical AND | Both conditions must be true | `true` only if both `A` and `B` are `true` |
| `\|\|` | Logical OR | At least one condition must be true | `true` if either `A` or `B` is `true` |
| `!` | Logical NOT | Inverts the condition | `!true` is `false`, `!false` is `true` |

```java
int roomTemp = 22;
int humidity = 45;

if (roomTemp >= 20 && roomTemp <= 24 && humidity <= 60) {
    System.out.println("Climate is comfortable.");
} else {
    System.out.println("Climate requires adjustment.");
}
```

### Short-Circuit Evaluation

Java evaluates `&&` and `||` using **short-circuit evaluation**:
- In `A && B`, if `A` is `false`, Java skips `B` (because the overall result is already guaranteed to be `false`).
- In `A || B`, if `A` is `true`, Java skips `B` (because the overall result is already guaranteed to be `true`).

This prevents errors such as division by zero:

```java
int count = 0;
int total = 100;

if (count != 0 && total / count > 5) {
    System.out.println("Above average");
}
```

Because `count != 0` is `false`, Java never evaluates `total / count > 5`, avoiding an `ArithmeticException`.

---

## 4. Progressive Practice: Intermediate

### Example 2: Range Classification and Multiple Branches

Categorizing wind speed according to weather thresholds:

```java
int windSpeedKmh = 35;

if (windSpeedKmh < 0) {
    System.out.println("Invalid sensor reading.");
} else if (windSpeedKmh <= 20) {
    System.out.println("Light breeze");
} else if (windSpeedKmh <= 60) {
    System.out.println("Moderate wind");
} else {
    System.out.println("Gale force winds");
}
```

#### Evaluation Order Trace Table

| Input `windSpeedKmh` | `< 0` | `<= 20` | `<= 60` | Branch Executed | Output |
| :--- | :--- | :--- | :--- | :--- | :--- |
| `-5` | `true` | — (skipped) | — (skipped) | 1st branch (`if`) | `"Invalid sensor reading."` |
| `15` | `false` | `true` | — (skipped) | 2nd branch (`else if`) | `"Light breeze"` |
| `35` | `false` | `false` | `true` | 3rd branch (`else if`) | `"Moderate wind"` |
| `75` | `false` | `false` | `false` | 4th branch (`else`) | `"Gale force winds"` |

#### Practice (✪✪ 2/7)

- **✪✪** [LargerThanOrEqualTo.md](./exercises/LargerThanOrEqualTo.md) / [LargerThanOrEqualTo.java](./exercises/LargerThanOrEqualTo.java) — Compare two integers with equality tie handling
- **✪✪** [GradesAndPoints.md](./exercises/GradesAndPoints.md) / [GradesAndPoints.java](./exercises/GradesAndPoints.java) — Multi-branch `else if` grading scale
- **✪✪** [OddOrEven.md](./exercises/OddOrEven.md) / [OddOrEven.java](./exercises/OddOrEven.java) — Remainder even/odd check (`% 2 == 0`)
- **✪✪** [CheckingTheAge.md](./exercises/CheckingTheAge.md) / [CheckingTheAge.java](./exercises/CheckingTheAge.java) — Range validation with logical `&&`

---

## 5. Branch Ordering & Unreachable Code

When multiple conditions can match an input, order your branches from **most specific to least specific**.

### The Unreachable Branch Trap

Consider the FizzBuzz rule:
- Print `"FizzBuzz"` if divisible by both 3 and 5.
- Print `"Fizz"` if divisible by 3.
- Print `"Buzz"` if divisible by 5.

If single-condition checks come before the combined check:

```java
// Incorrect: 15 matches (15 % 3 == 0) first, printing "Fizz"
if (number % 3 == 0) {
    System.out.println("Fizz");
} else if (number % 5 == 0) {
    System.out.println("Buzz");
} else if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz"); // Unreachable!
}
```

Placing the most specific condition first ensures inputs matching both criteria execute the intended branch:

```java
// Correct: most specific condition evaluated first
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

### Example 3: Hierarchical Rule Ordering

Theme park safety regulations depend on height and adult supervision:
- Guests $140$ cm or taller can ride solo.
- Guests between $120$ cm and $139$ cm can ride only if accompanied by an adult.
- Guests under $120$ cm cannot ride.

```java
int heightCm = 132;
boolean hasAdultCompanion = true;

if (heightCm >= 140) {
    System.out.println("Approved: Solo rider.");
} else if (heightCm >= 120 && hasAdultCompanion) {
    System.out.println("Approved: Accompanied rider.");
} else {
    System.out.println("Admission denied: Height requirement not met.");
}
```

#### Safety Regulation Trace Table

| `heightCm` | `hasAdultCompanion` | Branch Executed | Result |
| :--- | :--- | :--- | :--- |
| `145` | `false` | 1st branch (`heightCm >= 140`) | Approved solo |
| `132` | `true` | 2nd branch (`>= 120 && companion`) | Approved accompanied |
| `132` | `false` | 3rd branch (`else`) | Denied |
| `110` | `true` | 3rd branch (`else`) | Denied |

#### Practice (✪✪✪ 3/7)

- **✪✪✪** [LeapYear.md](./exercises/LeapYear.md) / [LeapYear.java](./exercises/LeapYear.java) — Multi-rule divisibility ordering (400, 100, 4)
- **✪✪✪** [GiftTax.md](./exercises/GiftTax.md) / [GiftTax.java](./exercises/GiftTax.java) — Stepped tax bracket calculation with base taxes and percentages

---

## 7. Common Conditionals Pitfalls

- **Semicolon After `if` Parentheses:** Placing a semicolon directly after the condition ends the `if` statement prematurely:
  ```java
  if (temperature > 30); // Empty statement!
  {
      System.out.println("Hot day!"); // Executes unconditionally
  }
  ```
- **Assignment (`=`) vs. Equality (`==`):** Writing `if (x = 5)` attempts an assignment. In Java, numbers cannot be converted to `boolean`, so this triggers a compiler error.
- **Comparing Strings with `==`:** Always use `first.equals(second)` rather than `first == second`.
- **Inverted Branch Order:** Placing general conditions before specific conditions shadows the specific conditions, making them unreachable.
- **Short-Circuit Misunderstandings:** Code inside the right side of `&&` or `||` will not run when the left side already determines the result.

---

## Complete Section Exercises Roadmap

| Tier | Difficulty | Exercise | Core Concept | Spec | Starter Code | Verification Command |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Tier 1** | ✪ | Speeding Ticket | Single condition check (`> 120`) | [SpeedingTicket.md](./exercises/SpeedingTicket.md) | [SpeedingTicket.java](./exercises/SpeedingTicket.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.SpeedingTicketTest"` |
| **Tier 1** | ✪ | Check Your Indentation | Code block formatting & scope | [CheckYourIndentation.md](./exercises/CheckYourIndentation.md) | [CheckYourIndentation.java](./exercises/CheckYourIndentation.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.CheckYourIndentationTest"` |
| **Tier 1** | ✪ | Orwell | Exact integer equality (`== 1984`) | [Orwell.md](./exercises/Orwell.md) | [Orwell.java](./exercises/Orwell.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.OrwellTest"` |
| **Tier 1** | ✪ | Ancient | Numeric comparison (`< 2015`) | [Ancient.md](./exercises/Ancient.md) | [Ancient.java](./exercises/Ancient.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.AncientTest"` |
| **Tier 1** | ✪ | Positivity | Binary branch with `if-else` | [Positivity.md](./exercises/Positivity.md) | [Positivity.java](./exercises/Positivity.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.PositivityTest"` |
| **Tier 1** | ✪ | Adulthood | Binary threshold with `if-else` | [Adulthood.md](./exercises/Adulthood.md) | [Adulthood.java](./exercises/Adulthood.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.AdulthoodTest"` |
| **Tier 1** | ✪ | Password | String equality with `.equals()` | [Password.md](./exercises/Password.md) | [Password.java](./exercises/Password.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.PasswordTest"` |
| **Tier 1** | ✪ | Same | Comparing two strings with `.equals()` | [Same.md](./exercises/Same.md) | [Same.java](./exercises/Same.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.SameTest"` |
| **Tier 2** | ✪✪ | Larger Than or Equal To | Two-variable comparison with tie | [LargerThanOrEqualTo.md](./exercises/LargerThanOrEqualTo.md) | [LargerThanOrEqualTo.java](./exercises/LargerThanOrEqualTo.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.LargerThanOrEqualToTest"` |
| **Tier 2** | ✪✪ | Grades and Points | Multi-branch `else if` grading scale | [GradesAndPoints.md](./exercises/GradesAndPoints.md) | [GradesAndPoints.java](./exercises/GradesAndPoints.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.GradesAndPointsTest"` |
| **Tier 2** | ✪✪ | Odd or Even | Remainder even/odd check (`% 2 == 0`) | [OddOrEven.md](./exercises/OddOrEven.md) | [OddOrEven.java](./exercises/OddOrEven.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.OddOrEvenTest"` |
| **Tier 2** | ✪✪ | Checking the Age | Range validation with logical `&&` | [CheckingTheAge.md](./exercises/CheckingTheAge.md) | [CheckingTheAge.java](./exercises/CheckingTheAge.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.CheckingTheAgeTest"` |
| **Tier 3** | ✪✪✪ | Leap Year | Hierarchical divisibility ordering | [LeapYear.md](./exercises/LeapYear.md) | [LeapYear.java](./exercises/LeapYear.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.LeapYearTest"` |
| **Tier 3** | ✪✪✪ | Gift Tax | Stepped tax bracket calculation | [GiftTax.md](./exercises/GiftTax.md) | [GiftTax.java](./exercises/GiftTax.java) | `./gradlew test --tests "part01.s06conditionalstatements.exercises.GiftTaxTest"` |

---

## Applied Logic & Problem Solving

Ready to apply your conditional logic to real-world problem solving, boundary checks, and algorithmic patterns?

Continue to [6.5 Applied Logic & Problem Solving](./logic/6.5-applied-logic.md) for 25 applied exercises covering guard clauses, tiered rate calculations, overlapping ranges, and clock cycles.

---

## Official Documentation

- **Control Flow Statements (The if-then and if-then-else Statements):** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
- **Equality, Relational, and Conditional Operators:** [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)
- **String Class (`equals`):** [Oracle Java SE Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#equals(java.lang.Object))\n