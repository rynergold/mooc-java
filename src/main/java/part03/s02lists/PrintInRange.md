# Print in range

**Exercise:** `part03-Part03_15.PrintInRange`
**Package:** `part03.02lists`

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

The numbers in the range [0, 5]
3
2
5
1
The numbers in the range [3, 10]
3
6
5

## Expected Output

```
The numbers in the range [0, 5]
3
2
5
1
The numbers in the range [3, 10]
3
6
5
```
