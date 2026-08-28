# Print in range

**Exercise:** `part03-Part03_15.PrintInRange`
**Package:** `part03.s02lists`

## Spec

Create the method `public static void printNumbersInRange(ArrayList numbers, int lowerLimit, int upperLimit)` in the exercise template. The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit]. A few examples of using the method are supplied below.

```java
ArrayList numbers = new ArrayList<>();
numbers.add(3);
numbers.add(2);
numbers.add(6);
numbers.add(-1);
numbers.add(5);
numbers.add(1);

System.out.println("The numbers in the range [0, 5]");
printNumbersInRange(numbers, 0, 5);

System.out.println("The numbers in the range [3, 10]");
printNumbersInRange(numbers, 3, 10);
```

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `The numbers in the range [0, 5]`<br>`3`<br>`2`<br>`5`<br>`1`<br>`The numbers in the range [3, 10]`<br>`3`<br>`6`<br>`5` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.PrintInRangeTest"
```
