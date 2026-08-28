# Summation

**Exercise:** `part02-Part02_29.Summation`
**Package:** `part02.s04methods`

## Spec

Expand the method `sum` in the exercise template so that it calculates and returns the sum of the numbers that are given as the parameters.

Create the method using the following structure:

```java
public static int sum(int number1, int number2, int number3, int number4) {
    // write your code here
    // remember to include return (at the end)!
}

public static void main(String[] args) {
    int answer = sum(4, 3, 6, 1);
    System.out.println("Sum: " + answer);
}
```

The output of the program:

**NB:** when an exercise describes a method that should _return_ something, this means that the type of the return value must be declared in the method definition, and that the method contains a `return` command that returns the wanted data. The method itself will print nothing (i.e. will not use the command `System.out.println`) - that task is left to the method caller, which in this case is the main program.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Sum: 14` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s04methods.SummationTest"
```
