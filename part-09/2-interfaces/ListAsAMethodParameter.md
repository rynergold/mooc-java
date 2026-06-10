# List as a method parameter

**Exercise:** `part09-Part09_07.ListAsAMethodParameter`
**Section:** Part 09 / 2-interfaces
**Course:** https://java-programming.mooc.fi/part-9/2-interfaces

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

3

## Expected Output

```
3
```
