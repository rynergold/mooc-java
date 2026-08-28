# From parameter to one

**Exercise:** `part02-Part02_24.FromParameterToOne`
**Package:** `part02.s04methods`

## Spec

Create the following method in the exercise template: `public static void printFromNumberToOne(int number)`. It should print the numbers from the number passed as a parameter down to one. Two examples of the method's usage are given below.

```java
public static void main(String[] args) {
    printFromNumberToOne(5);
}
```

5
4
3
2
1

```java

public static void main(String[] args) {
    printFromNumberToOne(2);
}

```

2
1

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `5`<br>`4`<br>`3`<br>`2`<br>`1`<br>`2`<br>`1` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s04methods.FromParameterToOneTest"
```
