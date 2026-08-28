# Map as a method parameter

**Exercise:** `part09-Part09_08.MapAsAMethodParameter`
**Package:** `part09.s02interfaces`

## Spec

In the class MainProgram implement a class method `returnSize` which gets a Map-object as a parameter, and returns its size as an integer.

The method should work as follows:

```java
Map names = new HashMap<>();
names.put("1", "first");
names.put("2", "second");

System.out.println(returnSize(names));
```

2

## Expected Output

```
2
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part09.s02interfaces.MapAsAMethodParameterTest"
```
