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

The collection alphabet is empty.

The collection alphabet has 1 element:
a

The collection alphabet has 2 elements:
a
b

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

The collection characters has 1 element:
magneto

The collection characters has 2 elements:
magneto
mystique

The collection characters has 3 elements:
magneto
mystique
phoenix

## Expected Output

```
The collection alphabet is empty.

The collection alphabet has 1 element:
a

The collection alphabet has 2 elements:
a
b

The collection alphabet has 3 elements:
a
b
c
The collection characters is empty.

The collection characters has 1 element:
magneto

The collection characters has 2 elements:
magneto
mystique

The collection characters has 3 elements:
magneto
mystique
phoenix
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part06.s01objectswithinobjects.PrintingACollectionTest"
```
