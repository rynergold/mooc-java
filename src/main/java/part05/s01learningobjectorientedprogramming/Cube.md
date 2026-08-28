# Cube

**Exercise:** `part05-Part05_03.Cube`
**Package:** `part05.s01learningobjectorientedprogramming`

## Spec

Create a `Cube` class that represents a cube (i.e., a standard hexahedron). Create a `public Cube (int edgeLength)` constructor for the class, that takes the length of the cube's edge as its parameter.

Make a `public int volume()` method for the cube, which calculates and returns the cube's volume. The volume of the cube is calculated with the formula `edgeLength * edgeLength * edgeLength`. Moreover, make a `public String toString()` method for the cube, which returns a string representation of it. The string representation should take the form "`The length of the edge is l and the volume v`", where `l` is the length and `v` the volume - both the length and volume must be represented as integers.

Examples are provided underneath

```java
Cube oSheaJackson = new Cube(4);
System.out.println(oSheaJackson.volume());
System.out.println(oSheaJackson);

System.out.println();

Cube salt = new Cube(2);
System.out.println(salt.volume());
System.out.println(salt);
```

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `64`<br>`The length of the edge is 4 and the volume 64` |
| Program execution | `8`<br>`The length of the edge is 2 and the volume 8` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s01learningobjectorientedprogramming.CubeTest"
```
