# Greatest in list

**Exercise:** `part03-Part03_09.GreatestInList`
**Package:** `part03.s02lists`

## Spec

The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers. The programming should work in the following manner.

You can use the source code below as an example. It is used to find the smallest number.

```java
// assume we have a list that contains integers

int smallest = list.get(0);

for(int i = 0; i  number) {
        smallest = number;
    }
}

System.out.println("The smallest number: " + smallest);
```

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `72`<br>2. `2`<br>3. `8`<br>4. `93`<br>5. `11`<br>6. `-1` | *(No output)* |
| Program execution | `The greatest number: 93` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part03.s02lists.GreatestInListTest"
```
