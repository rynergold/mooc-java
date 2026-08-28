# Reprint

**Exercise:** `part02-Part02_22.Reprint`
**Package:** `part02.s04methods`

## Spec

Expand the previous program so that the main program asks the user for the number of times the phrase will be printed (i.e. how many times the method will be called).

```java
public static void main(String[] args) {
    // ask the user for the number of times that the phrase will be printed
    // use the while command to call the method a suitable number of times
}

public static void printText() {
    // write some code in here
}
```

Sample output:

**NB:** print the prompt `How many times?` on its own separate line!

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>7</pre> | <pre>How many times?<br>In a hole in the ground there lived a method<br>In a hole in the ground there lived a method<br>In a hole in the ground there lived a method<br>In a hole in the ground there lived a method<br>In a hole in the ground there lived a method<br>In a hole in the ground there lived a method<br>In a hole in the ground there lived a method</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s04methods.ReprintTest"
```
