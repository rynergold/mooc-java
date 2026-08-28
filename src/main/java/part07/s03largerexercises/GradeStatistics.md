# Grade statistics (4 parts)

**Exercise:** `part07-Part07_06.GradeStatistics`
**Package:** `part07.s03largerexercises`

## Spec

In this exercise we create a program for printing statistics for points in course. The program receives points (integers from zero to one hundred) as input, based on which it prints statistics about grades. Reading of input stops when the user enters the number -1. Numbers that are not within the interval [0-100] should not be taken into account when calculating the statistics.

A string read from the user can be converted to an integer using the `Integer` class' method `valueOf`. It works as follows:

```java
String numberAsString = "3";
int number = Integer.valueOf(numberAsString);

System.out.println(numberAsString + 7);
System.out.println(number + 7);
```

37
10

Point averages

Write a program that reads integers representing course point totals from the user. Numbers between [0-100] are acceptable and the number -1 ends the reading of input. Other numbers are erroneous input, which should be ignored. When the user enters the number -1, the program should print the average of the point totals that were input.

Enter point totals, -1 stops:
Point average (all): 54.0

Enter point totals, -1 stops:
Point average (all): 51.0

Point average for points giving a passing grade

Extend the program, such that it in addition to giving the point average of all totals also provides the point average for points giving a passing grade.

A passing grade is achieved by getting a minimum of 50 course points. You may assume that the user always provides at least one integer between [0-100]. If there are no numbers giving a passing grade, the program should print a line "-" where the average would be.

Enter point totals, -1 stops:
Point average (all): 54.0
Point average (passing): 68.0

Enter point totals, -1 stops:
Point average (all): 48.0
Point average (passing): -

Pass percentage

Extend the program from the previous part, such that it also print the pass percentage. The pass percentage is calculated using the formula 100 * passing / participants.

Enter point totals, -1 stops:
Point average (all): 48.0
Point average (passing): -
Pass percentage: 0.0

Enter point totals, -1 stops:
Point average (all): 52.5
Point average (passing): 88.0
Pass percentage: 50.0

Grade distribution

Extend the program, such that it also prints the grade distribution. The grade distribution is as follows:

  
    points
    grade
  
  
    
    failed, i.e. 0
  
  
    
    1
  
  
    
    2
  
  
    
    3
  
  
    
    4
  
  
    >= 90
    5
  

Each point total is converted to a grade based on the above table. If a point total isn't within [0-100], it should be ignored.

The grade distribution is printed out as stars. E.g. if there is one point total giving the grade 5, then it should print the row 5: *. If there are no point totals giving a particular grade, then no stars should be printed for it. In the sample below this is true for e.g. the grade 4.

Enter point totals, -1 stops:
Point average (all): 52.5
Point average (passing): 88.0
Pass percentage: 50.0
Grade distribution:
5: *
4:
3: *
2:
1:
0: **

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `-42`<br>2. `24`<br>3. `42`<br>4. `72`<br>5. `80`<br>6. `52`<br>7. `-1`<br>8. `50`<br>9. `51`<br>10. `52`<br>11. `-1`<br>12. `-42`<br>13. `24`<br>14. `42`<br>15. `72`<br>16. `80`<br>17. `52`<br>18. `-1`<br>19. `49`<br>20. `48`<br>21. `47`<br>22. `-1`<br>23. `49`<br>24. `48`<br>25. `47`<br>26. `-1`<br>27. `102`<br>28. `-4`<br>29. `33`<br>30. `77`<br>31. `99`<br>32. `1`<br>33. `-1`<br>34. `102`<br>35. `-2`<br>36. `1`<br>37. `33`<br>38. `77`<br>39. `99`<br>40. `-1` | `37`<br>`10`<br>`Enter point totals, -1 stops:`<br>`Point average (all): 54.0`<br>`Enter point totals, -1 stops:`<br>`Point average (all): 51.0`<br>`Enter point totals, -1 stops:`<br>`Point average (all): 54.0`<br>`Point average (passing): 68.0`<br>`Enter point totals, -1 stops:`<br>`Point average (all): 48.0`<br>`Point average (passing): -`<br>`Enter point totals, -1 stops:`<br>`Point average (all): 48.0`<br>`Point average (passing): -`<br>`Pass percentage: 0.0`<br>`Enter point totals, -1 stops:`<br>`Point average (all): 52.5`<br>`Point average (passing): 88.0`<br>`Pass percentage: 50.0`<br>`Enter point totals, -1 stops:`<br>`Point average (all): 52.5`<br>`Point average (passing): 88.0`<br>`Pass percentage: 50.0`<br>`Grade distribution:`<br>`5: *`<br>`4:`<br>`3: *`<br>`2:`<br>`1:`<br>`0: **` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part07.s03largerexercises.GradeStatisticsTest"
```
