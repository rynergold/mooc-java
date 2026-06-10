# Whistle

**Exercise:** `part04-Part04_05.Whistle`
**Package:** `part04.01introductiontoobjectorientedprogramming`

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

Kvaak
Peef
Kvaak

## Expected Output

```
Kvaak
Peef
Kvaak
```
