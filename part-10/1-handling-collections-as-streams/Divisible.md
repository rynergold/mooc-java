# Divisible

**Exercise:** `part10-Part10_04.Divisible`
**Section:** Part 10 / 1-handling-collections-as-streams
**Course:** https://java-programming.mooc.fi/part-10/1-handling-collections-as-streams

## Spec

The exercise template includes a template for the method `public static ArrayList divisible(ArrayList numbers)`. Implement a functionality there that gathers numbers divisible by two, three or five from the list it receives as a parameter, and returns them as a new list. The list received as a parameter must not be altered.

```java
public static void main(String[] args) {
        ArrayList numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList divisible = divisible(numbers);

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }
```

3
2
-5

## Expected Output

```
3
2
-5
```
