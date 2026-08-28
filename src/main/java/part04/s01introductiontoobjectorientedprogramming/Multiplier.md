# Multiplier

**Exercise:** `part04-Part04_14.Multiplier`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

Create a class Multiplier that has a:

- Constructor `public Multiplier(int number)`.
- Method `public int multiply(int number)` which returns the value `number` passed to it multiplied by the `number` provided to the constructor.

You also need to create an instance variable in this exercise.

An example of the class in use:

```java
Multiplier multiplyByThree = new Multiplier(3);

System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

Multiplier multiplyByFour = new Multiplier(4);

System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
```

Output

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `multiplyByThree.multiply(2): 6`<br>`multiplyByFour.multiply(2): 8`<br>`multiplyByThree.multiply(1): 3`<br>`multiplyByFour.multiply(1): 4` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.MultiplierTest"
```
