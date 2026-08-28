# AV Club

**Exercise:** `part03-Part03_27.AVClub`
**Package:** `part03.s04strings`

## Spec

Write a program that reads user input until an empty line. For each non-empty string, the program splits the string by spaces ` ` and then prints the pieces that contain `av`, each on a new line.

**java is a programming language**
java
**navy blue shirt**
navy

**Do you have a favorite flavor**
have
favorite
flavor
**was it a cat?**

Tip! Strings have a `contains`-method, which tells if a string contains another string. It works like this:

```java
String text = "volcanologist";

if (text.contains("can")) {
    System.out.println("can was found");
}

if (!text.contains("tin")) {
    System.out.println("tin wasn't found");
}
```

can was found
tin wasn't found

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `java is a programming language`<br>2. `navy blue shirt`<br>3. `Do you have a favorite flavor`<br>4. `was it a cat?` | `java`<br>`navy`<br>`have`<br>`favorite`<br>`flavor`<br>`can was found`<br>`tin wasn't found` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s04strings.AVClubTest"
```
