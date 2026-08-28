# Statistics (4 parts)

**Exercise:** `part04-Part04_15.NumberStatistics`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

Count

Create a class `Statistics` that has the following functionality (the file for the class is provided in the exercise template):

- a method `addNumber` adds a new number to the statistics
- a method `getCount` tells the number of added numbers

The class does not need to store the added numbers anywhere, it is enough for it to remember their count. At this stage, the `addNumber` method can even neglect the numbers being added to the statistics, since the only thing being stored is the count of numbers added.

The method's body is the following:

```java
public class Statistics {
    private int count;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        // write code here
    }

    public int getCount() {
        // write code here
    }
}
```

The following program introduces the class' use:

```java
public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
```

The program prints the following:

Count: 4

Sum and average

Expand the class with the following functionality:

- the `sum` method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
- the `average` method tells the average of the numbers added (the average of an empty number statistics object is 0

The class' template is the following:

```java
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variables count and sum here
    }

    public void addNumber(int number) {
        // write code here
    }

    public int getCount() {
        // write code here
    }

    public int sum() {
        // write code here
    }

    public double average() {
        // write code here
    }
}
```

The following program demonstrates the class' use:

```java
public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
```

The program prints the following:

Count: 4
Sum: 11
Average: 2.75

Sum of user input

Write a program that asks the user for numbers until the user enters -1. The program will then provide the sum of the numbers.

The program should use a `Statistics` object to calculate the sum.

**NOTE:** Do not modify the Statistics class in this part. Instead, implement the program for calculating the sum by making use of it.

Multiple sums

Change the previous program so that it also calculates the sum of even and odd numbers.

**NOTE**: Define _three_ Statistics objects in the program. Use the first to calculate the sum of all numbers, the second to calculate the sum of even numbers, and the third to calculate the sum of odd numbers.

**NOTE:** Do not change the Statistics class in any way!

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>Count: 4<br>Count: 4<br>Sum: 11<br>Average: 2.75</pre> |
| <pre>1. 4<br>2. 2<br>3. 5<br>4. 4<br>5. -1</pre> | <pre>Enter numbers:<br>Sum: 15</pre> |
| <pre>1. 4<br>2. 2<br>3. 5<br>4. 2<br>5. -1</pre> | <pre>Enter numbers:<br>Sum: 13<br>Sum of even numbers: 8<br>Sum of odd numbers: 5</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.NumberStatisticsTest"
```
