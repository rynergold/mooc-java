# List as a method parameter

**Exercise:** `part09-Part09_07.ListAsAMethodParameter`
**Package:** `part09.s02interfaces`

## Spec

In the mainProgram class, implement a class method `returnSize`, which is given a List-object as a parameter, and returns the size of the list as an integer.

The method should work as follows:

```java
List names = new ArrayList<>();
names.add("First");
names.add("Second");
names.add("Third");

System.out.println(returnSize(names));
```

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `3` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part09.s02interfaces.ListAsAMethodParameterTest"
```
