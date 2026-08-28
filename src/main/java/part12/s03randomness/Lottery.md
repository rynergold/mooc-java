# Lottery

**Exercise:** `part12-Part12_08.Lottery`
**Package:** `part12.s03randomness`

## Spec

Your assignment is to complete the class `LotteryRow`, which is used to draw the week's winning numbers. The numbers are in range 1--40, and 7 numbers will be drawn in total. A lottery row consists of seven different numbers that are all in range 1--40.

We wish to implement the following functions in the class:

- the constructor `LotteryRow` creates a new LotteryRow object that contains new randomized numbers.

- the method `numbers` returns the drawn lottery numbers of this lottery row

- the method `containsNumber` tells whether the given number is included in the drawn numbers

- the method `randomizeNumbers` randomizes new numbers for the lottery row.

The basic structure of the class is as follows:

```java
import java.util.ArrayList;
import java.util.Random;

    public class LotteryRow {
    private ArrayList numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Tests whether the number is already among the randomized numbers
        return false;
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the randomization of the numbers by using the method containsNumber() here
    }

    public boolean equals(Object other) {
        return false;
    }
}
```

The following main program is supplied in the exercise base:

```java
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (int number: lotteryNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("");
    }
}
```

Here are a few possible outputs of the program:

**NB!** The same number can only appear once in a lottery row. The numbers don't need to be ordered.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>Lottery numbers:<br>3 5 10 14 15 27 37</pre> |
| Program execution | <pre>Lottery numbers:<br>2 9 11 18 23 32 34</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part12.s03randomness.LotteryTest"
```
