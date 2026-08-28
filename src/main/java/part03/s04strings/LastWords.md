# LastWords

**Exercise:** `part03-Part03_29.LastWords`
**Package:** `part03.s04strings`

## Spec

Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces ` `  and prints the last part of the string.

four
message

Tip! You can find out the length of the array like this:

```java
String[] parts = {"one", "two", "three"};
System.out.println("Number of parts: " + parts.length);
```

Number of parts: 3

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `one two three four`<br>2. `this is a very important message` | `four`<br>`message`<br>`Number of parts: 3` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.LastWordsTest"
```
