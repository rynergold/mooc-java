# Song

**Exercise:** `part05-Part05_12.Song`
**Package:** `part05.s04objectsandreferences`

## Spec

In the exercise base there is a class called `Song` that can be used to create new objects that represent songs. Add to that class the `equals` method so that the similarity of songs can be examined.

```java
Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

if (jackSparrow.equals(anotherSparrow)) {
    System.out.println(".");
}

if (jackSparrow.equals("Another object")) {
    System.out.println("Strange things are afoot.");
}
```

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Songs are equal` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s04objectsandreferences.Part05SongTest"
```
