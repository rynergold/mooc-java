# First packages (3 parts)

**Exercise:** `part11-Part11_08.FirstPackages`
**Package:** `part11.s02packages`

## Spec

UserInterface

There is a package called `mooc` included in the exercise. We will create the functionality of the program inside this package. Add the package `ui` inside the package `mooc` (after which the package `mooc.ui` should be available), and add an interface called `UserInterface` in it.

The interface `UserInterface` defines the method `void update()`.

Text user interface

In the same package, create the class `TextInterface` that implements the `UserInterface` interface. Implement the method `public void update()`, required by the interface `UserInterface`, so that the only thing it does is print the string `"Updating UI"` by calling the method `System.out.println`.

Application logic

Then create the package `mooc.logic`. Create the class `ApplicationLogic` in it. The functionality that the application logic offers should be as follows:

- `public ApplicationLogic(UserInterface ui)`The constructor of the ApplicationLogic class. It receives as a parameter a class that implements the UserInterface interface. NB: For application logic to see the interface, it must be "imported". Add the line `import mooc.ui.UserInterface` at the beginning of the file.

- `public void execute(int times)`Prints the string "Application logic is working" the number of times that is indicated by the variable `times`. After each print, the method should call the `update()` method of the object that was received as a constructor parameter (which implements the `UserInterface` interface).

You can test the program with the following main program class.

```java
import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
```

Application logic is working
Updating UI
Application logic is working
Updating UI
Application logic is working
Updating UI

## Expected Output

```
Application logic is working
Updating UI
Application logic is working
Updating UI
Application logic is working
Updating UI
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part11.s02packages.FirstPackagesTest"
```
