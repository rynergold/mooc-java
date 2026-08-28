# Longest in collection

**Exercise:** `part06-Part06_06.LongestInCollection`
**Package:** `part06.s01objectswithinobjects`

## Spec

The exercise template comes with the class `SimpleCollection` that's familiar from previous exercises. Implement the method `public String longest()` for the class, which returns the longest string of the collection. If the collection is empty, the method should return a `null` reference.

```java
SimpleCollection j = new SimpleCollection("characters");
System.out.println("Longest: " + j.longest());

j.add("magneto");
j.add("mystique");
j.add("phoenix");

System.out.println("Longest: " + j.longest());
```

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `Longest: null`<br>`Longest: mystique` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part06.s01objectswithinobjects.LongestInCollectionTest"
```
