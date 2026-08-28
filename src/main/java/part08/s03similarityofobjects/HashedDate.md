# Hash for date

**Exercise:** `part08-Part08_12.HashedDate`
**Package:** `part08.s03similarityofobjects`

## Spec

Let's expand the `SimpleDate` class from the previous exercise to also have its own `hashCode` method.

Create a method `public int hashCode()` for the `SimpleDate` class, which calculates a hash for the the SimpleDate object. Implement the calculation of the hash in way that there are as few similar hashes as possible between the years 1900 and 2100.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `(see spec)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part08.s03similarityofobjects.HashedDateTest"
```
