# Sum these for me

**Exercise:** `part12-Part12_03.SumTheseForMe`
**Package:** `part12.s02arraylistandhashtable`

## Spec

In the class `Program` implement a class method `public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest)`. The method must calculate the sum of the elements in the array between the lower and the upper limits. Only numbers smaller or equal to the int largest and larger or equal to the int smallest are added to the sum.

The method must also check that the lower and the upper limit are valid indexes in the array. If the parameter `fromWhere` is smaller than 0, the lower limit becomes 0 instead. Accordingly, if the parameter `toWhere` is larger than the size of the array, the upper limit becomes the last index of the array instead.

```java
int[] numbers = {3, -1, 8, 4};

System.out.println(sum(numbers, 0, 0, 0, 0));
System.out.println(sum(numbers, 0, 0, 0, 10));
System.out.println(sum(numbers, 0, 1, 0, 10));
System.out.println(sum(numbers, 0, 1, -10, 10));
System.out.println(sum(numbers, -1, 999, -10, 10));
```

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `0`<br>`0`<br>`3`<br>`3`<br>`14` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part12.s02arraylistandhashtable.SumTheseForMeTest"
```
