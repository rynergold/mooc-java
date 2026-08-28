# Remove last

**Exercise:** `part03-Part03_17.RemoveLast`
**Package:** `part03.s02lists`

## Spec

Create the method `public static void removeLast(ArrayList strings)` in the exercise template. The method should remove the last value in the list it receives as a parameter. If the list is empty, the method does nothing.

```java
ArrayList strings = new ArrayList<>();

strings.add("First");
strings.add("Second");
strings.add("Third");

System.out.println(strings);

removeLast(strings);
removeLast(strings);

System.out.println(strings);
```

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `[First, Second, Third]`<br>`[First]` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.RemoveLastTest"
```
