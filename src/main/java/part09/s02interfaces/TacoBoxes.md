# TacoBoxes (2 parts)

**Exercise:** `part09-Part09_05.TacoBoxes`
**Package:** `part09.s02interfaces`

## Spec

In the exercise template you'll find Interface `TacoBox` ready for your use. It has the following methods:

- the method `int tacosRemaining()` return the number of tacos remaining in the box.

- the method `void eat()` reduces the number of tacos remaining by one. The number of tacos remaining can't become negative.

```java
public interface TacoBox {
    int tacosRemaining();
    void eat();
}
```

Triple taco box

Implement the class `TripleTacoBox`, that implements the `TacoBox` interface. `TripleTacobox` has a constructor with no parameters. `TripleTacobox` has an object variable `tacos` which is initialized at 3 when the constructor is called.

Custom taco box

Implement the class `CustomTacoBox`, that implements the `TacoBox` interface. `CustomTacoBox` has a constructor with one parameter defining the initial number of tacos in the box(`int tacos`).

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `(see spec)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part09.s02interfaces.TacoBoxesTest"
```
