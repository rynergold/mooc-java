# Sum of a sequence - the sequel

**Exercise:** `part02-Part02_18.SumOfASequenceTheSequel`
**Package:** `part02.s03moreloops`

## Spec

Implement a program which calculates the sum of a closed interval, and prints it. Expect the user to write the smaller number first and then the larger number.

You can base your solution to this exercise to the solution of last exercise -- add the functionality for the user to enter the starting point as well.

Sample output:

First number? **3**
Last number? **5**
The sum is 12

The above example internally calculated  3 + 4 + 5 = 12

First number? **2**
Last number? **8**
The sum is: 35

And now the internal calculation was 2 + 3 + 4 + 5 + 6 + 7 + 8 = 35

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. 3<br>2. 5<br>3. 2<br>4. 8</pre> | <pre>First number?<br>Last number?<br>The sum is 12<br>First number?<br>Last number?<br>The sum is: 35</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s03moreloops.SumOfASequenceTheSequelTest"
```
