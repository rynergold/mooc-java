# Big year (3 parts)

**Exercise:** `part07-Part07_08.BigYear`
**Package:** `part07.s03largerexercises`

## Spec

In this exercise you will design and implement a database for bird-watchers. The database contains birds, each of which has a name (string) and a name in Latin (string). The database also counts the observations of each bird.

The program must implement the following commands:

 -  `Add` - adds a bird

 -  `Observation` - adds an observation

 -  `All` - prints all birds

 -  `One` - prints one bird

 - `Quit` - ends the program

Incorrect input must also be handled.
The following is an example of the program functionality:

**NB** You're free to structure your program the way you want. We only test that the `main` method of the `mainProgram` class works as shown above. You will most likely find it useful to use classes that are descriptive of the problem domain.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. Add<br>2. Crow<br>3. Corvus Corvus<br>4. Add<br>5. Hawk<br>6. Dorkus Dorkus<br>7. Observation<br>8. Hawk<br>9. Observation<br>10. Lion<br>11. Observation<br>12. Hawk<br>13. All<br>14. One<br>15. Hawk<br>16. Quit</pre> | <pre>?<br>Name:<br>Name in Latin:<br>?<br>Name:<br>Name in Latin:<br>?<br>Bird?<br>?<br>Bird?<br>Not a bird!<br>?<br>Bird?<br>?<br>Hawk (Dorkus Dorkus): 2 observations<br>Crow (Corvus Corvus): 0 observations<br>?<br>Bird?<br>Hawk (Dorkus Dorkus): 2 observations<br>?</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part07.s03largerexercises.BigYearTest"
```
