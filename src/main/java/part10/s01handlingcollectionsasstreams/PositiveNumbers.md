# Positive Numbers

**Exercise:** `part10-Part10_03.PositiveNumbers`
**Package:** `part10.s01handlingcollectionsasstreams`

## Spec

In the exercise template, implement the class method `public static List positive(List numbers)`, which receives an ArrayList of integers, and returns the positive integers from the list.

Implement the method using stream! For collecting the numbers try the command `Collectors.toList()` in addition to the `Collectors.toCollection(ArrayList::new)` command.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `(see spec)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s01handlingcollectionsasstreams.PositiveNumbersTest"
```
