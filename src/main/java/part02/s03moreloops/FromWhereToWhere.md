# From where to where? (2 parts)

**Exercise:** `part02-Part02_16.FromWhereToWhere`
**Package:** `part02.s03moreloops`

## Spec

This exercise is the first two-part exercise. When you complete both parts, you will get two exercise points. You can also submit the exercise after completing only the first part.

Where to

Write a program which prints the integers from 1 to a number given by the user.

Where to? **3**
1
2
3

Where to? **5**
1
2
3
4
5

**hint** the number read from the user is now the upper limit of the condition. Remember that in Java `a Where from

Ask the user for the starting point as well.

Where to? **8**
Where from? **5**
5
6
7
8

If the upper limit is smaller than the starting point, nothing is printed:

Where to? **12**
Where from? **16**

**NB** remember that the lower and upper limits can be negative!

## Expected Output

```
Where to? **3**
1
2
3
Where to? **5**
1
2
3
4
5
Where to? **8**
Where from? **5**
5
6
7
8
Where to? **12**
Where from? **16**
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s03moreloops.FromWhereToWhereTest"
```
