# Index was not found

**Exercise:** `part03-Part03_19.IndexWasNotFound`
**Package:** `part03.s03arrays`

## Spec

The exercise template already has an array containing numbers. Complete the program so that it asks the user for a number to search in the array. If the array contains the given number, the program tells the index containing the number. If the array doesn't contain the given number, the program will advise that the number wasn't found.

Search for? **3**
3 is at index 4.

Search for? **7**
7 is at index 7.

Search for? **22**
22 was not found.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3</pre> | <pre>Search for?<br>3 is at index 4.</pre> |
| <pre>7</pre> | <pre>Search for?<br>7 is at index 7.</pre> |
| <pre>22</pre> | <pre>Search for?<br>22 was not found.</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s03arrays.IndexWasNotFoundTest"
```
