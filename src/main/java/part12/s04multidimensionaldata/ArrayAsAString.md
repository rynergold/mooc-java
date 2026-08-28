# Array as a string

**Exercise:** `part12-Part12_09.ArrayAsAString`
**Package:** `part12.s04multidimensionaldata`

## Spec

Create in the exercise base a method called `public static String arrayAsString(int[][] array)`. It should create a string representation of the array it receives as the parameter and return it.

Brush up on using StringBuilder in part 10.3 before taking on this exercise. Below there are a few examples of how the method is expected to  work.

```java
int rows = 2;
int columns = 3;
int[][] matrix = new int[rows][columns];
matrix[0][1] = 5;
matrix[1][0] = 3;
matrix[1][2] = 7;
System.out.println(arrayAsString(matrix));
```

050
307

```java
int[][] matrix = {
    {3, 2, 7, 6},
    {2, 4, 1, 0},
    {3, 2, 1, 0}
};

System.out.println(arrayAsString(matrix));
```

3276
2410
3210

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>050<br>307<br>3276<br>2410<br>3210</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part12.s04multidimensionaldata.ArrayAsAStringTest"
```
