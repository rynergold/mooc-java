# Agent

**Exercise:** `part04-Part04_13.Agent`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

The exercise template defines an Agent class, having a first name and last name. A `print` method is defined for the class that creates the following string representation.

```java
Agent bond = new Agent("James", "Bond");
bond.print();
```

My name is Bond, James Bond

Remove the class' `print` method, and create a `public String toString()` method for it, which returns the string representation shown above.

The class should function as follows.

```java
Agent bond = new Agent("James", "Bond");

bond.toString(); // prints nothing
System.out.println(bond);

Agent ionic = new Agent("Ionic", "Bond");
System.out.println(ionic);
```

My name is Bond, James Bond
My name is Bond, Ionic Bond

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `My name is Bond, James Bond`<br>`My name is Bond, James Bond`<br>`My name is Bond, Ionic Bond` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.AgentTest"
```
