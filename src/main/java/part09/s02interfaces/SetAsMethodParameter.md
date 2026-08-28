# Set as  method parameter

**Exercise:** `part09-Part09_09.SetAsMethodParameter`
**Package:** `part09.s02interfaces`

## Spec

In the Main-class, implement the static method `returnSize`, which receives a Set object as a parameter and returns its size.

The method should work e.g. like this:

```java
Set names = new HashSet<>();
names.add("first");
names.add("first");
names.add("second");
names.add("second");
names.add("second");

System.out.println(returnSize(names));

```

Prints:

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>2</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part09.s02interfaces.SetAsMethodParameterTest"
```
