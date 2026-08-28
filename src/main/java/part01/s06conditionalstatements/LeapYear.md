# Leap year

**Exercise:** `part01-Part01_36.LeapYear`
**Package:** `part01.s06conditionalstatements`

## Spec

A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

Write a program that reads a year from the user, and checks whether or not it is a leap year.

Give a year: **2011**
The year is not a leap year.

Give a year: **2012**
The year is a leap year.

Give a year: **1800**
The year is not a leap year.

Give a year: **2000**
The year is a leap year.

Hint 1: The divisibility by a particular number can be checked using the modulo operator, aka `%`, in the following way.

```java
int number = 5;

if (number % 5 == 0) {
    System.out.println("The number is divisible by five!");
}

if (number % 6 != 0) {
    System.out.println("The number is not divisible by six!")
}
```

The number is divisible by five!
The number is not divisible by six!

Hint 2: Think of the problem as a chain of if, else if, else if, ... comparisons, and start building the program from a situation in which you can be certain that the year is not a leap year.

```java
Scanner reader = new Scanner(System.in);
int number = Integer.valueOf(reader.nextLine());

if (number % 4 != 0) {
    System.out.println("The year is not a leap year.");
} else if (...) {
    ...
} ...
```

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `2011`<br>2. `2012`<br>3. `1800`<br>4. `2000` | Give a year: **`2011`**<br>`The year is not a leap year.`<br>Give a year: **`2012`**<br>`The year is a leap year.`<br>Give a year: **`1800`**<br>`The year is not a leap year.`<br>Give a year: **`2000`**<br>`The year is a leap year.`<br>`The number is divisible by five!`<br>`The number is not divisible by six!` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.LeapYearTest"
```
