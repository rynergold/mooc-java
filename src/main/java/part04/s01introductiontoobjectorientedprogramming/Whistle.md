# Whistle

**Exercise:** `part04-Part04_05.Whistle`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

Create a class named `Whistle`. Add the variable `private String sound` to the class. After that, create the constructor `public Whistle(String whistleSound)`, which is used to create a new whistle that's given a sound.

Then create the method `public void sound()` that prints the whistle's sound.

```java
Whistle duckWhistle = new Whistle("Kvaak");
Whistle roosterWhistle = new Whistle("Peef");

duckWhistle.sound();
roosterWhistle.sound();
duckWhistle.sound();
```

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Kvaak`<br>`Peef`<br>`Kvaak` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.WhistleTest"
```
