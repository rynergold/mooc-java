# Regular expressions (3 parts)

**Exercise:** `part10-Part10_15.RegularExpressions`
**Package:** `part10.s03otherusefultechniques`

## Spec

Let's practice using regular expressions a little. The methods in this exercise should be created in the class `Checker`.

Day of week

Use regular expressions to create the method `public boolean isDayOfWeek(String string)`, which returns `true` if the parameter string is an abbreviation of a day of the week (mon, tue, wed, thu, fri, sat, sun)

Example outputs of a program that uses the method:

Enter a string: **tue**
The form is correct.

Enter a string: **abc**
The form is incorrect.

Vowel check

**NB**. For simplicity's sake, in this exercises **the letters that are considered vowels are: a, e, i, o, and u**.

Create the method `public boolean allVowels(String string)` that uses a regular expression to check whether all the characters in the parameter string are vowels.

Example outputs of a program that uses the method:

Enter a string: **oi**
The form is correct.

Enter a string: **queue**
The form is incorrect.

Time of day

Regular expressions come in handy in certain situations. In some cases the expressions become too complex, and the "correctness" of the string is best checked with some other style. Or it could be beneficial to use regular expressions for only some part of the check.

Create the method `public boolean timeOfDay(String string)`. It should use a regular expression to check whether the parameter string expresses a time of day in the form `hh:mm:ss` (hours, minutes, and seconds each always take up two spaces).

**NB. In this exercise we use the 24-hour clock**. So the acceptable values are between 00:00:00 and 23:59:59.

Example outputs of a program that uses the method:

Enter a string: **17:23:05**
The form is correct.

Enter a string: **abc**
The form is incorrect.

Enter a string: **33:33:33**
The form is incorrect.

## Expected Output

```
Enter a string: **tue**
The form is correct.
Enter a string: **abc**
The form is incorrect.
Enter a string: **oi**
The form is correct.
Enter a string: **queue**
The form is incorrect.
Enter a string: **17:23:05**
The form is correct.
Enter a string: **abc**
The form is incorrect.
Enter a string: **33:33:33**
The form is incorrect.
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s03otherusefultechniques.RegularExpressionsTest"
```
