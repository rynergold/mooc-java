# Divisible by three

**Exercise:** `part02-Part02_26.DivisibleByThree`
**Package:** `part02.s04methods`

## Spec

Write a method `public static void divisibleByThreeInRange(int beginning, int end)` that prints all the numbers divisible by three in the given range. The numbers are to be printed in order from the smallest to the greatest.

```java
public static void main(String[] args) {
    divisibleByThreeInRange(3, 6);
}
```

3
6

```java

public static void main(String[] args) {
    divisibleByThreeInRange(2, 10);
}

```

3
6
9

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `3`<br>`6`<br>`3`<br>`6`<br>`9` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s04methods.DivisibleByThreeTest"
```
