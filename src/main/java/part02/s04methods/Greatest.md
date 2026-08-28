# Greatest

**Exercise:** `part02-Part02_31.Greatest`
**Package:** `part02.s04methods`

## Spec

Define a method called `greatest` that takes three numbers and returns the greatest of them. If there are multiple greatest values, returning one of them is enough. Printing will take place in the main program.

```java
public static int greatest(int number1, int number2, int number3) {
  // write some code here
}

public static void main(String[] args) {
  int answer =  greatest(2, 7, 3);
  System.out.println("Greatest: " + answer);
}
```

The output of the program:

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `Greatest: 7` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part02.s04methods.GreatestTest"
```
