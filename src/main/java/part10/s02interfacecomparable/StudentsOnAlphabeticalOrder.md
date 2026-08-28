# Students on alphabetical order

**Exercise:** `part10-Part10_12.StudentsOnAlphabeticalOrder`
**Package:** `part10.s02interfacecomparable`

## Spec

The exercise template includes the class `Student`, which has a name. Implement the `Comparable` interface in the Student class in a way, such that the `compareTo` method sorts the students in alphabetical order based on their names.

 The name of the `Student` is a String, which implements `Comparable` itself. You may use its `compareTo` method when implementing the method for the `Student` class. Note that `String.compareTo()` also treats letters according to their size, while the `compareToIgnoreCase` method of the same class ignores the capitalization completely. You may use either of these methods in the exercise.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `(see spec)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s02interfacecomparable.StudentsOnAlphabeticalOrderTest"
```
