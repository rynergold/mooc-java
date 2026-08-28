# Square root of sum

**Exercise:** `part02-Part02_02.SquareRootOfSum`
**Package:** `part02.s01problemsandpatterns`

## Spec

Write a program that reads two integers from the user and prints the square root of the sum of these integers. The program does not need to work with negative values.

You can calculate the square root of an integer with the command `Math.sqrt` like this:

```java
int number = 42;
double squareRoot = Math.sqrt(number);
System.out.println(squareRoot);
```

Here are a few examples:

**1**
**0**
1

**5**
**4**
3

**1**
**35**
6

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `1`<br>2. `0`<br>3. `5`<br>4. `4`<br>5. `1`<br>6. `35` | **`1`**<br>**`0`**<br>`1`<br>**`5`**<br>**`4`**<br>`3`<br>**`1`**<br>**`35`**<br>`6` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s01problemsandpatterns.SquareRootOfSumTest"
```
