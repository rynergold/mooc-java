# Song

**Exercise:** `part05-Part05_12.Song`
**Section:** Part 05 / 4-objects-and-references
**Course:** https://java-programming.mooc.fi/part-5/4-objects-and-references

## Spec

In the exercise base there is a class called `Song` that can be used to create new objects that represent songs. Add to that class the `equals` method so that the similarity of songs can be examined.

```java
Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

if (jackSparrow.equals(anotherSparrow)) {
    System.out.println("Songs are equal.");
}

if (jackSparrow.equals("Another object")) {
    System.out.println("Strange things are afoot.");
}
```

Songs are equal

## Expected Output

```
Songs are equal
```
