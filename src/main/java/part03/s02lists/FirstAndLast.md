# First and last

**Exercise:** `part03-Part03_06.FirstAndLast`
**Package:** `part03.s02lists`

## Spec

In the exercise template there is a program that reads inputs from the user and adds them to a list. Reading is stopped once the user enters an empty string.

Modify the program to print both the first and the last values after the reading ends. You may suppose that at least two values are read into the list.

**Tom**
**Emma**
**Alex**
**Mary**

Tom
Mary

**Juno**
**Elizabeth**
**Mason**
**Irene**
**Olivia**
**Liam**
**Ida**
**Christopher**
**Mark**
**Sylvester**
**Oscar**

Juno
Oscar

## Expected Output

```
**Tom**
**Emma**
**Alex**
**Mary**

Tom
Mary
**Juno**
**Elizabeth**
**Mason**
**Irene**
**Olivia**
**Liam**
**Ida**
**Christopher**
**Mark**
**Sylvester**
**Oscar**

Juno
Oscar
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.FirstAndLastTest"
```
