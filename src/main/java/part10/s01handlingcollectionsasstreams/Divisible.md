# Divisible

**Exercise:** `part10-Part10_04.Divisible`
**Package:** `part10.s01handlingcollectionsasstreams`

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

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `3`<br>`2`<br>`-5` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s01handlingcollectionsasstreams.DivisibleTest"
```
