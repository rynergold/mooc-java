# Books

**Exercise:** `part05-Part05_14.Books`
**Package:** `part05.s04objectsandreferences`

## Spec

There is a program in the exercise base that asks for books from the user and adds them to a list.

Modify the program so that books that are already on the list are not added to it again. Two books should be considered the same if they have the same name and publication year.

Example print

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. Bossypants<br>2. 2013<br>3. Seriously...I'm Kidding<br>4. 2012<br>5. Seriously...I'm Kidding<br>6. 2012</pre> | <pre>Name (empty will stop):<br>Publication year:<br>Name (empty will stop):<br>Publication year:<br>Name (empty will stop):<br>Publication year:<br>The book is already on the list. Let's not add the same book again.<br>Name (empty will stop):</pre> |
| Program execution | <pre>Thank you! Books added: 2</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s04objectsandreferences.Part05BooksTest"
```
