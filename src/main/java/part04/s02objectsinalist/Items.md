# Items

**Exercise:** `part04-Part04_17.Items`
**Package:** `part04.s02objectsinalist`

## Spec

Implement the class `Items` described here. **NB!** Don't modify the class `Item`.

Write a program that reads names of items from the user. If the name is empty, the program stops reading. Otherwise, the given name is used to create a new item, which you will then add to the `items` list.

Having read all the names, print all the items by using the `toString` method of the  `Item` class. The implementation of the `Item` class keeps track of the time of creation, in addition to the name of the item.

An example of the working program is given below:

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `Hammer`<br>2. `Collar` | `Name:`<br>`Name:`<br>`Name:` |
| Program execution | `Hammer (created at: 06.07.2018 12:34:56)`<br>`Collar (created at: 06.07.2018 12:34:57)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s02objectsinalist.ItemsTest"
```
