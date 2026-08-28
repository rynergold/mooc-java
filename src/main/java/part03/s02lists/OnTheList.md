# On the list?

**Exercise:** `part03-Part03_14.OnTheList`
**Package:** `part03.s02lists`

## Spec

In the exercise template there is a program that reads inputs from the user until an empty string is entered. Add the following functionality to it: after reading the inputs one more string is requested from the user. The program then tell whether that string was found in the list or not.

**Tom**
**Emma**
**Alex**
**Mary**

Search for? **Mary**
Mary was found!

**Tom**
**Emma**
**Alex**
**Mary**

Search for? **Logan**
Logan was not found!

## Expected Output

```
**Tom**
**Emma**
**Alex**
**Mary**

Search for? **Mary**
Mary was found!
**Tom**
**Emma**
**Alex**
**Mary**

Search for? **Logan**
Logan was not found!
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.OnTheListTest"
```
