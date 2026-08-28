# LastWords

**Exercise:** `part03-Part03_29.LastWords`
**Package:** `part03.s04strings`

## Spec

Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces ` `  and prints the last part of the string.

**one two three four**
four
**this is a very important message**
message

Tip! You can find out the length of the array like this:

```java
String[] parts = {"one", "two", "three"};
System.out.println("Number of parts: " + parts.length);
```

Number of parts: 3

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `one two three four`<br>2. `this is a very important message` | **`one two three four`**<br>`four`<br>**`this is a very important message`**<br>`message`<br>`Number of parts: 3` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.LastWordsTest"
```
