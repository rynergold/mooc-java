# Hi Ada Lovelace!

**Exercise:** `part01-Part01_06.HiAdaLovelace`
**Package:** `part01.s03readinginput`

## Spec

The exercise template contains the following program.

```java
public class HiAdaLovelace {

    public static void main(String[] args) {
        String name = "Ada Lovelace";

    }
}
```

Modify the program so that it prints the contents of the variable `name`, and the printed text is the following in its full form:

Hi Ada Lovelace!

NB! When using the `System.out.println` command, do not pass in the string "Ada Lovelace" as a parameter. Instead, use the existing variable `name`: `System.out.println("Hi " + ...)`

## Expected Output

```
Hi Ada Lovelace!
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part01.s03readinginput.HiAdaLovelaceTest"
```
