# Book

**Exercise:** `part05-Part05_02.Book`
**Package:** `part05.s01learningobjectorientedprogramming`

## Spec

Create a "Book" class that describes a book. Each book has an author, title, and page count.

Make the class a:

- Constructor `public Book(String author, String name, int pages)`
- Method `public String getAuthor()` that returns the book's author's name.
- Method `public String getName()` that returns the name of the book.
- Method `public int getPages()` that returns the number of pages in the book.

In addition, make a `public String toString()` method for the book that will be used to print the book object. For example, the method call should produce the following output:

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s01learningobjectorientedprogramming.BookTest"
```
