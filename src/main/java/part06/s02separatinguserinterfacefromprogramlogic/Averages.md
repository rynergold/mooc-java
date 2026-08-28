# Averages (3 parts)

**Exercise:** `part06-Part06_11.Averages`
**Package:** `part06.s02separatinguserinterfacefromprogramlogic`

## Spec

The exercise base includes the previously constructed program to store grades. In this exercise you will further develop the class `GradeRegister` so that it can calculate the average of grades and exam results.

Average grade

Create the method `public double averageOfGrades()` for the class `GradeRegister`. It should return the average of the grades. If the register contains no grades, the method should return `-1`. Use the `grades` list to calculate the average.

Example:

```java
GradeRegister register = new GradeRegister();
register.addGradeBasedOnPoints(93);
register.addGradeBasedOnPoints(91);
register.addGradeBasedOnPoints(92);
register.addGradeBasedOnPoints(88);

System.out.println(register.averageOfGrades());
```

4.75

Average points

Give the class `GradeRegister` a new object variable: a list where you will store the exam points every time that the method `addGradeBasedOnPoints` is called. After this addition, create a method `public double averageOfPoints()` that calculates and returns the average of the exam points. If there are no points added to the register, the method should return the number `-1`.

Example:

```java
GradeRegister register = new GradeRegister();
register.addGradeBasedOnPoints(93);
register.addGradeBasedOnPoints(91);
register.addGradeBasedOnPoints(92);

System.out.println(register.averageOfPoints());
```

92.0

Prints in the user interface

As a final step, add the methods implemented above as parts of the user interface. When the program prints the grade distribution, it should also print the averages of the points and the grades.

Points: **82**
Points: **83**
Points: **96**
Points: **51**
Points: **48**
Points: **56**
Points: **61**
Points:

5: \*
4: \*\*
3:
2: \*
1: \*\*
0: \*
The average of points: 68.14285714285714
The average of grades: 2.4285714285714284

## Expected Output

```
4.75
92.0
Points: **82**
Points: **83**
Points: **96**
Points: **51**
Points: **48**
Points: **56**
Points: **61**
Points:

5: \*
4: \*\*
3:
2: \*
1: \*\*
0: \*
The average of points: 68.14285714285714
The average of grades: 2.4285714285714284
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part06.s02separatinguserinterfacefromprogramlogic.AveragesTest"
```
