# Print me another hash map

**Exercise:** `part08-Part08_09.PrintMeAnotherHashmap`
**Package:** `part08.s02hashmap`

## Spec

The exercise template contains the already familiar classes `Book` and `Program`.
In the class `Program` implement the following class methods:

 - `public static void printValues(HashMap hashmap)`, which prints all the values in the hashmap given as a parameter using
 the toString method of the Book objects.

- `public static void printValueIfNameContains(HashMap hashmap, String text)`, which prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method `getName`.

An example of using the class methods:

```java
HashMap hashmap = new HashMap<>();
hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

printValues(hashmap);
System.out.println("---");
printValueIfNameContains(hashmap, "prejud");
```

NB! The order of the output may vary. The implementation of a hashmap does not guarantee the order of the objects in it.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Name: Pride and prejudice (1813)`<br>`Contents: ...`<br>`Name: Sense and Sensibility (1811)`<br>`Contents: ...`<br>`---`<br>`Name: Pride and prejudice (1813)`<br>`Contents: ...` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part08.s02hashmap.PrintMeAnotherHashmapTest"
```
