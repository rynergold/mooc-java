# Averaging

**Exercise:** `part02-Part02_32.Averaging`
**Package:** `part02.s04methods`

## Spec

Create a method called `average` that calculates the average of the numbers passed as parameters. The previously created method `sum` must be used inside this method!

Define the method in the following template:

```java
public static int sum(int number1, int number2, int number3, int number4) {
    // you can copy your implementation of the method sum here
}

public static double average(int number1, int number2, int number3, int number4) {
    // write your code here
    // calculate the sum of the elements by calling the method sum
}

public static void main(String[] args) {
    double result = average(4, 3, 6, 1);
    System.out.println("Average: " + result);
}
```

The output of the program:

Make sure to remember how to convert an integer (`int`) into a decimal number (`double`)!

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Average: 3.5` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s04methods.AveragingTest"
```
