# Overloaded Counter (2 parts)

**Exercise:** `part05-Part05_06.OverloadedCounter`
**Package:** `part05.s02methodandconstructoroverloading`

## Spec

Multiple constructors

Implement a class called `Counter`. The class contains a number whose value can be incremented and decremented. The class must have the following constructors:

 -  `public Counter(int startValue)` sets the start value of the counter to startValue.

 -  `public Counter()` sets the start value of the counter to 0.

And the following methods:

 - `public int value()` returns the current value of the counter
  -  `public void increase()` increases the value by 1
   -  `public void decrease()` decreases the value by 1

Alternative methods

Implement versions which are given one parameter of the methods `increase` and `decrease`.

 - `public void increase(int increaseBy)` increases the value of the counter by the value of increaseBy. If the value of increaseBy is negative, the value of the counter does not change.

 -  `public void decrease(int decreaseBy)` decreases the value of the counter by the value of decreaseBy. If the value of decreaseBy is negative, the  value of the counter does not change.

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `(see spec)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s02methodandconstructoroverloading.OverloadedCounterTest"
```
