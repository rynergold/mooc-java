# Decreasing counter (3 parts)

**Exercise:** `part04-Part04_08.DecreasingCounter`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

This exercise consists of multiple parts. Each part corresponds to one exercise point.

The exercise template comes with a partially executed class `decreasingCounter`:

```java
public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }

    // and the other methods go here
}
```

The following is an example of how the main program uses the decreasing counter:

```java
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```

The program above should have the following print output.

value: 10
value: 9
value: 8

Implementation of the decrement() method

Implement the `decrement()` method in the class body in such a way that it decrements the `value` variable of the object it's being called on by one. Once you're done with the `decrement()` method, the main program of the previous example should work to produce the example output.

The counter's value cannot be negative

Implement the `decrement()` in such a way that the counter's value never becomes negative. This means that if the value of the counter is 0, it cannot be decremented. A conditional statement is useful here.

```java
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```

Prints:

value: 2
value: 1
value: 0
value: 0

Resetting the counter value

Create the method `public void reset()` for the counter that resets the value of the counter to 0. For example:

```java
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```

Prints:

value: 100
value: 0
value: 0

## Expected Output

```
value: 10
value: 9
value: 8
value: 2
value: 1
value: 0
value: 0
value: 100
value: 0
value: 0
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.DecreasingCounterTest"
```
