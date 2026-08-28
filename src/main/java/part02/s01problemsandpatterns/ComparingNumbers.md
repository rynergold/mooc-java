# Comparing Numbers

**Exercise:** `part02-Part02_04.ComparingNumbers`
**Package:** `part02.s01problemsandpatterns`

## Spec

Write a program that reads two integers from the user. If the first number is greater than the second, the program prints "(first) is greater than (second)." If the first number is less than the second, the program prints "(first) is smaller than (second)." Otherwise, the program prints "(first) is equal to (second)." The (first) and (second) should always be replaced with the actual numbers that were provided by the user.

A few examples of the expected behaviour:

8 is greater than 4.

-3 is smaller than 5.

1 is equal to 1.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. 8<br>2. 4<br>3. -3<br>4. 5<br>5. 1<br>6. 1</pre> | <pre>8 is greater than 4.<br>-3 is smaller than 5.<br>1 is equal to 1.</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s01problemsandpatterns.ComparingNumbersTest"
```
