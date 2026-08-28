# Guest List From a File

**Exercise:** `part04-Part04_26.GuestListFromAFile`
**Package:** `part04.s03filesandreadingdata`

## Spec

The exercise template comes ready with functionality for the guest list application. It checks whether names entered by the user are on the guest list.

However, the program is missing the functionality needed for reading the guest list. Modify the program so that the names on the guest list are read from the file.

**NB!** The exercise template comes with two files, `names.txt` and `other-names.txt`, which have the following contents. Do not change the contents of the files!

names.txt:

ada
arto
leena
test

other-names.txt:

leo
jarmo
alicia

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| `guestlist.txt` | `Name of the file:`<br>**`guestlist.txt`** |
| 1. `Chuck Norris`<br>2. `Jack Baluer`<br>3. `Jack Bauer`<br>4. `Jack Bower` | `Enter names, an empty line quits.`<br>**`Chuck Norris`**<br>`The name is not on the list.`<br>**`Jack Baluer`**<br>`The name is not on the list.`<br>**`Jack Bauer`**<br>`The name is on the list.`<br>**`Jack Bower`**<br>`The name is on the list.` |
| Program execution | `Thank you!` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s03filesandreadingdata.GuestListFromAFileTest"
```
