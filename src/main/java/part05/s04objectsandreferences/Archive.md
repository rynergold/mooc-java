# Archive (2 parts)

**Exercise:** `part05-Part05_15.Archive`
**Package:** `part05.s04objectsandreferences`

## Spec

In this exercise you get to implement a program that can be used to handle an archive. Several items can be added to it. When no more items are added, all the items in the archive are printed.

Adding and listing items

The program should read items from the user. When all the items from the user have been read, the program prints the information of each item.

For each item, its identifier and name should be read. If the identifier or name is empty, the program stops asking for input, and prints all the item information.

Example print:

==Items==
B07H8ND8HH: He-Man figure
B07H8ND8HH: He-Man
B07NQFMZYG: He-Man figure
B07NQFMZYG: He-Man figure

The printing format of the items should be `identifier: name`.

NB! Don't print the colon (:) anywhere else in the output of the program.

You only print once (per item)

Modify the program so that after entering the items, each item is printed at most once. Two items should be considered the same if their identifiers are the same (there can be variation in their names in different countries, for instance).

If the user enters the same item multiple times, the print uses the item that was added first.

Hint! It is probably smart to add each item to the list at most once -- compare the equality of the objects based on their identifiers.

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `B07H8ND8HH`<br>2. `He-Man figure`<br>3. `B07H8ND8HH`<br>4. `He-Man`<br>5. `B07NQFMZYG`<br>6. `He-Man figure`<br>7. `B07NQFMZYG`<br>8. `He-Man figure` | `Identifier? (empty will stop)`<br>**`B07H8ND8HH`**<br>`Name? (empty will stop)`<br>**`He-Man figure`**<br>`Identifier? (empty will stop)`<br>**`B07H8ND8HH`**<br>`Name? (empty will stop)`<br>**`He-Man`**<br>`Identifier? (empty will stop)`<br>**`B07NQFMZYG`**<br>`Name? (empty will stop)`<br>**`He-Man figure`**<br>`Identifier? (empty will stop)`<br>**`B07NQFMZYG`**<br>`Name? (empty will stop)`<br>**`He-Man figure`**<br>`Identifier? (empty will stop)` |
| 1. `B07H8ND8HH`<br>2. `He-Man figure`<br>3. `B07H8ND8HH`<br>4. `He-Man`<br>5. `B07NQFMZYG`<br>6. `He-Man figure`<br>7. `B07NQFMZYG`<br>8. `He-Man figure` | `==Items==`<br>`B07H8ND8HH: He-Man figure`<br>`B07H8ND8HH: He-Man`<br>`B07NQFMZYG: He-Man figure`<br>`B07NQFMZYG: He-Man figure`<br>`Identifier? (empty will stop)`<br>**`B07H8ND8HH`**<br>`Name? (empty will stop)`<br>**`He-Man figure`**<br>`Identifier? (empty will stop)`<br>**`B07H8ND8HH`**<br>`Name? (empty will stop)`<br>**`He-Man`**<br>`Identifier? (empty will stop)`<br>**`B07NQFMZYG`**<br>`Name? (empty will stop)`<br>**`He-Man figure`**<br>`Identifier? (empty will stop)`<br>**`B07NQFMZYG`**<br>`Name? (empty will stop)`<br>**`He-Man figure`**<br>`Identifier? (empty will stop)` |
| Program execution | `==Items==`<br>`B07H8ND8HH: He-Man figure`<br>`B07NQFMZYG: He-Man figure` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s04objectsandreferences.ArchiveTest"
```
