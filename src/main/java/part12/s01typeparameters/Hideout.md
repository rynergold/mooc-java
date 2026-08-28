# Hideout

**Exercise:** `part12-Part12_01.Hideout`
**Package:** `part12.s01typeparameters`

## Spec

Implement a class called Hideout, which has a single generic type parameter. The object created from the class may only hide one object at a time. The class should provide a parameterless constructor as well as the following three methods:

- `public void putIntoHideout(T toHide)` puts an object with a type in accordance with the type parameter given to the the class into the hideout. In case an object is already in the hideout, it will disappear.

- `public T takeFromHideout()` takes out the object with a type in accordance with the type parameter given to the the class from the hideout. In case there is nothing in the hideout, we return `null`. Calling the method returns the object in the hideout and removes the object from the hideout.

- `public boolean isInHideout()` returns the value `true` if there is an object in the hideout. In case there isn't an object in the hideout, it should return the value `false`.

**There are no tests for the class in the exercise template**. Submit the exercise when the following examples work as intended.

```java
Hideout den = new Hideout<>();
System.out.println(den.isInHideout());
den.putIntoHideout("peekaboo");
System.out.println(den.isInHideout());
System.out.println(den.takeFromHideout());
System.out.println(den.isInHideout());
den.putIntoHideout("toodaloo");
den.putIntoHideout("heelloo");
System.out.println(den.isInHideout());
System.out.println(den.takeFromHideout());
System.out.println(den.isInHideout());
```

false
true
peekaboo
false
true
heelloo
false

```java
Hideout den = new Hideout<>();
System.out.println(den.isInHideout());
den.putIntoHideout(1);
System.out.println(den.isInHideout());
System.out.println(den.isInHideout());
System.out.println(den.takeFromHideout());
System.out.println(den.isInHideout());
```

false
true
true
1
false

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `false`<br>`true`<br>`peekaboo`<br>`false`<br>`true`<br>`heelloo`<br>`false`<br>`false`<br>`true`<br>`true`<br>`1`<br>`false` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part12.s01typeparameters.HideoutTest"
```
