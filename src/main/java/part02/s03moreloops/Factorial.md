# Factorial

**Exercise:** `part02-Part02_19.Factorial`
**Package:** `part02.s03moreloops`

## Spec

Implement a program which calculates the factorial of a number given by the user.

Factorial of n, denoted `n!`, is calculated as 1 * 2 * 3 * ... * n. For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.

Sample output:

Give a number: **3**
Factorial: 6

The internal calculation here was 1 * 2 * 3 = 6

Give a number: **10**
Factorial: 3628800

And now the internal calculation was 1 * 2 * 3 * ... * 8 * 9 * 10 = 3628800

_Additional info_: Factorials are used especially in probability calculus when examining different possible orders of a set. For example, a group of five people can form 5! different lines, and a pack of 52 cards can be in 52! different orders. Factorial can also be used to calculate combinations; For example it is possible to deal 52! / (5! * (52-5)!) different hands from a 52 card pack, and you can form 40! / (7! * (40 - 7)!) different 7 number lottery lines from 40 numbers.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3</pre> | <pre>Give a number:<br>Factorial: 6</pre> |
| <pre>10</pre> | <pre>Give a number:<br>Factorial: 3628800</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s03moreloops.FactorialTest"
```
