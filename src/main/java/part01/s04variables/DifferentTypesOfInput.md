# Different Types of Input

**Exercise:** `part01-Part01_15.DifferentTypesOfInput`  
**Package:** `part01.s04variables`

## Spec

Write a program that prompts the user for 4 different types in sequence:
1. A string: `"Give a string:"`
2. An integer: `"Give an integer:"`
3. A floating-point number: `"Give a double:"`
4. A boolean: `"Give a boolean:"`

After gathering all four inputs, print the values back in the summary format shown below.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>bye-bye<br>11<br>4.2<br>true</pre> | <pre>Give a string:<br>Give an integer:<br>Give a double:<br>Give a boolean:<br>You gave the string bye-bye<br>You gave the integer 11<br>You gave the double 4.2<br>You gave the boolean true</pre> |
| <pre>Oops!<br>-4<br>3200.1<br>false</pre> | <pre>Give a string:<br>Give an integer:<br>Give a double:<br>Give a boolean:<br>You gave the string Oops!<br>You gave the integer -4<br>You gave the double 3200.1<br>You gave the boolean false</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s04variables.DifferentTypesOfInputTest"
```
