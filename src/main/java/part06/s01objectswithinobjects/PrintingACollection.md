# Printing a Collection

**Exercise:** `part06-Part06_04.PrintingACollection`
**Package:** `part06.s01objectswithinobjects`

## Spec

The exercise template has a predefined `SimpleCollection` class, which is used to represent a group of values. The class is missing the `toString` method used for printing.

Implement a `toString` method for the class that will perform as demonstrated in the following examples.

```java
SimpleCollection s = new SimpleCollection("alphabet");
System.out.println(s);

System.out.println();

s.add("a");
System.out.println(s);

System.out.println();

s.add("b");
System.out.println(s);

System.out.println();

s.add("c");
System.out.println(s);
```

The collection alphabet has 3 elements:
a
b
c

```java
SimpleCollection s = new SimpleCollection("characters");
System.out.println(s);

System.out.println();

s.add("magneto");
System.out.println(s);

System.out.println();

s.add("mystique");
System.out.println(s);

System.out.println();

s.add("phoenix");
System.out.println(s);
```

The collection characters is empty.

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `The collection alphabet is empty.` |
| Program execution | `The collection alphabet has 1 element:`<br>`a` |
| Program execution | `The collection alphabet has 2 elements:`<br>`a`<br>`b` |
| Program execution | `The collection alphabet has 3 elements:`<br>`a`<br>`b`<br>`c`<br>`The collection characters is empty.` |
| Program execution | `The collection characters has 1 element:`<br>`magneto` |
| Program execution | `The collection characters has 2 elements:`<br>`magneto`<br>`mystique` |
| Program execution | `The collection characters has 3 elements:`<br>`magneto`<br>`mystique`<br>`phoenix` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part06.s01objectswithinobjects.PrintingACollectionTest"
```
