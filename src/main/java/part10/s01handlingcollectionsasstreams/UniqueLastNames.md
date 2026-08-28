# Unique last names

**Exercise:** `part10-Part10_07.UniqueLastNames`
**Package:** `part10.s01handlingcollectionsasstreams`

## Spec

The exercise template contains a sketch of a program that reads user-provided information about people. Expand the program so that it will print all the unique last names of the user-provided people in alphabetical order.

**quit**

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `Continue personal information input? "quit" ends:` |
| 1. `Ada`<br>2. `Lovelace`<br>3. `1815` | Input first name: **`Ada`**<br>Input last name: **`Lovelace`**<br>Input the year of birth: **`1815`** |
| Program execution | `Continue personal information input? "quit" ends:` |
| 1. `Grace`<br>2. `Hopper`<br>3. `1906` | Input first name: **`Grace`**<br>Input last name: **`Hopper`**<br>Input the year of birth: **`1906`** |
| Program execution | `Continue personal information input? "quit" ends:` |
| 1. `Alan`<br>2. `Turing`<br>3. `1912` | Input first name: **`Alan`**<br>Input last name: **`Turing`**<br>Input the year of birth: **`1912`** |
| `quit` | `Continue personal information input? "quit" ends:`<br>**`quit`** |
| Program execution | `Unique last names in alphabetical order:`<br>`Hopper`<br>`Lovelace`<br>`Turing` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s01handlingcollectionsasstreams.UniqueLastNamesTest"
```
