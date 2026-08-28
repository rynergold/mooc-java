# Database

**Exercise:** `part14-Part14_10.Database`
**Package:** `part14.s04mavenandthirdpartylibraries`

## Spec

The exercise base contains an application that has the H2 database configured as a dependency. It also includes the following four classes:

- `Todo`: a class that represents a task that is to be done. Each todo has a numerical identifier (id), a name, a description, and the information abot whether it has been done.

- `TodoDao`: a class that is used to store todos to the database. The word "dao" comes from the phrase "data access object". The class offers methods for listing, adding, setting as completed, and removing todos. Removing or setting as done is done on the basis of the id. The class constructor receives the location of the database.

- `UserInterface`: a class that is used to ask the user for instructions for what to do. The constructor receives a Scanner object and a TodoDao object as its parameters. Calling the `start` method starts the user interface, after which the user controls the program with their keyboard input.

- `Program`: a class that serves as a starting point for the program.

In this exercise it is your task to modify the user interface so that the user of the program can add new todos, or list, mark as done, or remove existing ones. Don't do changes in the classes `Todo`, `TodoDao`, or `Program`.

The finished program is expected to behave in the following manner:

```

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 1
Listing the database contents

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 2
Adding a new todo
Enter name
code
Enter description
code a whole lot

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 2
Adding a new todo
Enter name
prepare food
Enter description
rice porridge

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 1
Listing the database contents
Todo{id=1, name=code, description=code a whole lot, done=false}
Todo{id=2, name=prepare food, description=rice porridge, done=false}

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 3

Which todo should be marked as done (give the id)?
2

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 1
Listing the database contents
Todo{id=1, name=code, description=code a whole lot, done=false}
Todo{id=2, name=prepare food, description=rice porridge, done=true}

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 4

Which todo should be removed (give the id)?
2

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 1
Listing the database contents
Todo{id=1, name=code, description=code a whole lot, done=false}

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 3

Which todo should be marked as done (give the id)?
1

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> 1
Listing the database contents
Todo{id=1, name=code, description=code a whole lot, done=true}

Enter command:
1) list
2) add
3) mark as done
4) remove
x) quit
> x
Thank you!

```

The text user interface in this exercise does not differ in any essential way from the earlier text UIs we have created. The difference is that the data is being stored in a database: *the stored data will be available for the program when it is started the next time.*

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>(see spec)</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part14.s04mavenandthirdpartylibraries.DatabaseTest"
```
