# Sum

**Exercise:** `part03-Part03_16.Sum`
**Package:** `part03.s02lists`

## Spec

Create the method `public static int sum(ArrayList numbers)` in the exercise template. The method is to return the sum of the numbers in the parameter list.

```java
ArrayList numbers = new ArrayList<>();
numbers.add(3);
numbers.add(2);
numbers.add(6);
numbers.add(-1);
System.out.println(sum(numbers));

numbers.add(5);
numbers.add(1);
System.out.println(sum(numbers));
```

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>10<br>16</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.SumTest"
```
