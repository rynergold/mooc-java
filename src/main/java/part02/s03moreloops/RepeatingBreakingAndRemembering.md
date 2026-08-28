# Repeating, breaking and remembering (5 parts)

**Exercise:** `part02-Part02_20.RepeatingBreakingAndRemembering`
**Package:** `part02.s03moreloops`

## Spec

Next, we'll implement a program one piece at a time. This is always strongly recommended when coding.

The series of exercises form a larger program whose functionality is implemented in small pieces. If you do not finish the whole series, you can still submit the parts you've completed to be checked. This can be done by clicking the "submit" button (the arrow pointing up) to the right of the "test" button. Although the submission system complains about the tests of unfinished parts, you get points for the parts you have finished.

NB: Remember that each sub-part of the series is equivalent to one individual exercise. As such, the series is equivalent to five individual exercises.

**Note:** the tests might fail a correct solution. This is a known bug that will be fixed in the future. In the meantime, you can avoid the error by printing "Give numbers:" without **any** spaces after ':'

Reading

Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.

Sum of numbers

Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

Sum: 11

Sum and the number of numbers

Extend the program so that it also prints the number of numbers (not including the -1) the user has written.

Sum: 11
Numbers: 3

Average of numbers

Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.

Sum: 11
Numbers: 3
Average: 3.666666666666

Even and odd numbers

Extend the program so that it prints the number of even and odd numbers (excluding the -1).

Sum: 11
Numbers: 3
Average: 3.666666666666
Even: 2
Odd: 1

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `5`<br>2. `2`<br>3. `4`<br>4. `-1` | `Give numbers:`<br>**`5`**<br>**`2`**<br>**`4`**<br>**`-1`**<br>`Thx! Bye!` |
| 1. `5`<br>2. `2`<br>3. `4`<br>4. `-1` | `Give numbers:`<br>**`5`**<br>**`2`**<br>**`4`**<br>**`-1`**<br>`Thx! Bye!`<br>`Sum: 11` |
| 1. `5`<br>2. `2`<br>3. `4`<br>4. `-1` | `Give numbers:`<br>**`5`**<br>**`2`**<br>**`4`**<br>**`-1`**<br>`Thx! Bye!`<br>`Sum: 11`<br>`Numbers: 3` |
| 1. `5`<br>2. `2`<br>3. `4`<br>4. `-1` | `Give numbers:`<br>**`5`**<br>**`2`**<br>**`4`**<br>**`-1`**<br>`Thx! Bye!`<br>`Sum: 11`<br>`Numbers: 3`<br>`Average: 3.666666666666` |
| 1. `5`<br>2. `2`<br>3. `4`<br>4. `-1` | `Give numbers:`<br>**`5`**<br>**`2`**<br>**`4`**<br>**`-1`**<br>`Thx! Bye!`<br>`Sum: 11`<br>`Numbers: 3`<br>`Average: 3.666666666666`<br>`Even: 2`<br>`Odd: 1` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s03moreloops.RepeatingBreakingAndRememberingTest"
```
