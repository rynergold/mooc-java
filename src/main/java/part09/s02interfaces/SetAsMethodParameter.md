# Set as  method parameter

**Exercise:** `part09-Part09_09.SetAsMethodParameter`
**Package:** `part09.02interfaces`

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

2

## Expected Output

```
2
```
