# Literature (3 parts)

**Exercise:** `part10-Part10_14.Literature`
**Package:** `part10.s02interfacecomparable`

## Spec

Write a program that reads user input for books and their age recommendations.

The program asks for new books until the user gives an empty String (only presses enter). After this, the program will print the number of books, their names, and their recommended ages.

Reading and printing the books

Implement the reading and printing the books first, the ordering of them doesn't matter yet.

Books:
The Ringing Lullaby Book (recommended for 0 year-olds or older)
The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)
The Snowy Forest Calls (recommended for 12 year-olds or older)
Litmanen 10 (recommended for 10 year-olds or older)

Ordering books based on their age recommendation

Expand your program so, that the books are sorted based on their age recommendations when they are printed. If two (or more) books share the same age recommendations the order between them does not matter.

Books:
The Ringing Lullaby Book (recommended for 0 year-olds or older)
The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)
Litmanen 10 (recommended for 10 year-olds or older)
The Snowy Forest Calls (recommended for 12 year-olds or older)

Ordering books based on their age recommendation and name

Expand your program, so that it sorts the books with the same age recommendation based on their name alphabetically.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `The Ringing Lullaby Book`<br>2. `0` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `The Exiting Transpotation Vehicles`<br>2. `0` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `The Snowy Forest Calls`<br>2. `12` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `Litmanen 10`<br>2. `10` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| Program execution | `Input the name of the book, empty stops:` |
| Program execution | `4 books in total.` |
| 1. `The Ringing Lullaby Book`<br>2. `0` | `Books:`<br>`The Ringing Lullaby Book (recommended for 0 year-olds or older)`<br>`The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)`<br>`The Snowy Forest Calls (recommended for 12 year-olds or older)`<br>`Litmanen 10 (recommended for 10 year-olds or older)`<br>`Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `The Exiting Transpotation Vehicles`<br>2. `0` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `The Snowy Forest Calls`<br>2. `12` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `Litmanen 10`<br>2. `10` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| Program execution | `Input the name of the book, empty stops:` |
| Program execution | `4 books in total.` |
| 1. `The Ringing Lullaby Book`<br>2. `0` | `Books:`<br>`The Ringing Lullaby Book (recommended for 0 year-olds or older)`<br>`The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)`<br>`Litmanen 10 (recommended for 10 year-olds or older)`<br>`The Snowy Forest Calls (recommended for 12 year-olds or older)`<br>`Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `The Exiting Transpotation Vehicles`<br>2. `0` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `The Snowy Forest Calls`<br>2. `12` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| 1. `Litmanen 10`<br>2. `10` | `Input the name of the book, empty stops:`<br>`Input the age recommendation:` |
| Program execution | `Input the name of the book, empty stops:` |
| Program execution | `4 books in total.` |
| Program execution | `Books:`<br>`The Exiting Transpotation Vehicles (recommended for 0 year-olds or older)`<br>`The Ringing Lullaby Book (recommended for 0 year-olds or older)`<br>`Litmanen 10 (recommended for 10 year-olds or older)`<br>`The Snowy Forest Calls (recommended for 12 year-olds or older)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s02interfacecomparable.LiteratureTest"
```
