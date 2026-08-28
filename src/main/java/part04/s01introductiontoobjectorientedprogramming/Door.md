# Door

**Exercise:** `part04-Part04_06.Door`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

Create a class named `Door`. The door does not have any variables. Create for it a constructor with no parameters (or use the default constructor). After that, create a `public void knock()` method for the door that prints the message "" when called.

The door should work as follows.

```java
Door alexander = new Door();

alexander.knock();
alexander.knock();
```

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Who's there?` |
| Program execution | `Who's there?` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.DoorTest"
```
