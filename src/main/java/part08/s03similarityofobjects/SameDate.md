# Same date

**Exercise:** `part08-Part08_11.SameDate`
**Package:** `part08.s03similarityofobjects`

## Spec

The exercise template contains a class `SimpleDate`, which defines a date object based on a given day, month, and year. In this exercise you will expand the SimpleDate class with an equals method, which can tell if the dates are exactly the same.

Create a method `public boolean equals(Object object)` for the `SimpleDate` class, which returns true if the date of the object passed to the method as a parameter is the same as the date of the object used to call the method.

The method should work as follows:

```java
SimpleDate d = new SimpleDate(1, 2, 2000);
System.out.println(d.equals("heh"));
System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
```

false
false
true

## Expected Output

```
false
false
true
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part08.s03similarityofobjects.SameDateTest"
```
