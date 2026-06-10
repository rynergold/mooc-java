# Averaging

**Exercise:** `part02-Part02_32.Averaging`
**Section:** Part 02 / 4-methods
**Course:** https://java-programming.mooc.fi/part-2/4-methods

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

Average: 3.5

Make sure to remember how to convert an integer (`int`) into a decimal number (`double`)!

## Expected Output

```
Average: 3.5
```
