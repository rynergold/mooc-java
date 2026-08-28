# From one to parameter

**Exercise:** `part02-Part02_23.FromOneToParameter`
**Package:** `part02.s04methods`

## Spec

Create the following method in the exercise template: `public static void printUntilNumber(int number)`. It should print the numbers from one to the number passed as a parameter. Two examples of the method's usage are given below.

```java
public static void main(String[] args) {
    printUntilNumber(5);
}
```

1
2
3
4
5

```java
public static void main(String[] args) {
    printUntilNumber(2);
}
```

1
2

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `1`<br>`2`<br>`3`<br>`4`<br>`5`<br>`1`<br>`2` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s04methods.FromOneToParameterTest"
```
