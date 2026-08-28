# Books

**Exercise:** `part05-Part05_14.Books`
**Package:** `part05.s04objectsandreferences`

## Spec

There is a program in the exercise base that asks for books from the user and adds them to a list.

Modify the program so that books that are already on the list are not added to it again. Two books should be considered the same if they have the same name and publication year.

Example print

Name (empty will stop):
**Bossypants**
Publication year:
**2013**
Name (empty will stop):
**Seriously...I'm Kidding**
Publication year:
**2012**
Name (empty will stop):
**Seriously...I'm Kidding**
Publication year:
**2012**
The book is already on the list. Let's not add the same book again.
Name (empty will stop):

Thank you! Books added: 2

## Expected Output

```
Name (empty will stop):
**Bossypants**
Publication year:
**2013**
Name (empty will stop):
**Seriously...I'm Kidding**
Publication year:
**2012**
Name (empty will stop):
**Seriously...I'm Kidding**
Publication year:
**2012**
The book is already on the list. Let's not add the same book again.
Name (empty will stop):

Thank you! Books added: 2
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s04objectsandreferences.Part05BooksTest"
```
