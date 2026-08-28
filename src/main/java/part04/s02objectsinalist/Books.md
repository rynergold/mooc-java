# Books

**Exercise:** `part04-Part04_20.Books`
**Package:** `part04.s02objectsinalist`

## Spec

Write a program that first reads book information from the user. The details to be asked for each book include the title, the number of pages and the publication year. Entering an empty string as the name of the book ends the reading process.

After this the user is asked for what is to be printed. If the user inputs "everything", all the details are printed: the book titles, the numbers of pages and the publication years. However, if the user enters the string "name", only the book titles are printed.

It is probably worthwhile to implement a class called `Book` to represent a book. There are two points in total available for this exercise.

What information will be printed? **everything**
To Kill a Mockingbird, 281 pages, 1960
A Brief History of Time, 256 pages, 1988
Beautiful Code, 593 pages, 2007
The Name of the Wind, 662 pages, 2007

## Examples

| User Input (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `To Kill a Mockingbird`<br>2. `281`<br>3. `1960`<br>4. `A Brief History of Time`<br>5. `256`<br>6. `1988`<br>7. `Beautiful Code`<br>8. `593`<br>9. `2007`<br>10. `The Name of the Wind`<br>11. `662`<br>12. `2007` | Title: **`To Kill a Mockingbird`**<br>Pages: **`281`**<br>Publication year: **`1960`**<br>Title: **`A Brief History of Time`**<br>Pages: **`256`**<br>Publication year: **`1988`**<br>Title: **`Beautiful Code`**<br>Pages: **`593`**<br>Publication year: **`2007`**<br>Title: **`The Name of the Wind`**<br>Pages: **`662`**<br>Publication year: **`2007`**<br>`Title:` |
| 1. `everything`<br>2. `To Kill a Mockingbird`<br>3. `281`<br>4. `1960`<br>5. `A Brief History of Time`<br>6. `256`<br>7. `1988`<br>8. `Beautiful Code`<br>9. `593`<br>10. `2007`<br>11. `The Name of the Wind`<br>12. `662`<br>13. `2007` | What information will be printed? **`everything`**<br>`To Kill a Mockingbird, 281 pages, 1960`<br>`A Brief History of Time, 256 pages, 1988`<br>`Beautiful Code, 593 pages, 2007`<br>`The Name of the Wind, 662 pages, 2007`<br>Title: **`To Kill a Mockingbird`**<br>Pages: **`281`**<br>Publication year: **`1960`**<br>Title: **`A Brief History of Time`**<br>Pages: **`256`**<br>Publication year: **`1988`**<br>Title: **`Beautiful Code`**<br>Pages: **`593`**<br>Publication year: **`2007`**<br>Title: **`The Name of the Wind`**<br>Pages: **`662`**<br>Publication year: **`2007`**<br>`Title:` |
| `name` | What information will be printed? **`name`**<br>`To Kill a Mockingbird`<br>`A Brief History of Time`<br>`Beautiful Code`<br>`The Name of the Wind` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s02objectsinalist.BooksTest"
```
