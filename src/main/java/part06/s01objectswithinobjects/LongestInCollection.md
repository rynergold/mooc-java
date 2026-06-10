# Longest in collection

**Exercise:** `part06-Part06_06.LongestInCollection`
**Package:** `part06.01objectswithinobjects`

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

Longest: null
Longest: mystique

## Expected Output

```
Longest: null
Longest: mystique
```
