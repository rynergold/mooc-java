# To do list (2 parts)

**Exercise:** `part08-Part08_05.TodoList`
**Package:** `part08.s01recap`

## Spec

In this exercise we are going to create a program that can be used to create and modify a to-do list. The final product will work in the following manner.

Command: **add**
Task: **go to the store**
Command: **add**
Task: **vacuum clean**
Command: **list**
1: go to the store
2: vacuum clean
Command: **completed**
Which task was completed? **2**
Task go to the store tehty
Command: **list**
1: go to the store
Command: **add**
Task: **program**
Command: **list**
1: go to the store
2: program
Command: **stop**

We will build the program in parts.

TodoList

Create a class called `TodoList`. It should have a constructor without parameters and the following methods:

- `public void add(String task)` - add the task passed as a parameter to the todo list.
- `public void print()` - prints the exercises. Each task has a number associated with it on the print statement -- use the task's index here (+1).
- `public void remove(int number)` - removes the task associated with the given number; the number is the one seen associated with the task in the print.

```java
TodoList list = new TodoList();
list.add("read the course material");
list.add("watch the latest fool us");
list.add("take it easy");

list.print();
list.remove(2);

System.out.println();
list.print();
```

1: read the course material
2: watch the latest fool us
3: take it easy

1: read the course material
2: take it easy

**NB!** You may assume that the `remove` method is given a number that corresponds to a real task. The method only has to correctly work once after each print call.

Another example:

```java
TodoList list = new TodoList();
list.add("read the course material");
list.add("watch the latest fool us");
list.add("take it easy");
list.print();
list.remove(2);
list.print();
list.add("buy rasins");
list.print();
list.remove(1);
list.remove(1);
list.print();
```

1: read the course material
2: watch the latest fool us
3: take it easy
1: read the course material
2: take it easy
1: read the course material
2: take it easy
3: buy rasins
1: buy rasins

User interface

Next, implement a class called `UserInterface`. It should have a constructor with two parameters. The first parameter is an instance of the class `TodoList`, and the second is an instance of the class `Scanner`. In addition to the constructor, the class should have the method `public void start()` that is used to start the text user interface. The text UI works with an eternal looping statement (`while-true`), and it must offer the following commands to the user:

- The command `stop` stops the execution of the loop, after which the execution of the program advances out of the `start` method.

- The command `add` asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.

- The commmand `list` prints all the tasks on the to-do list.

- The command `remove` asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.

Below is an example of how the program should work.

Command: **add**
To add: **write an essay**
Command: **add**
To add: **read a book**
Command: **list**
1: write an essay
2: read a book
Command: **remove**
Which one is removed? **1**
Command: **list**
1: read a book
Command: **remove**
Which one is removed? **1**
Command: **list**
Command: **add**
To add: **stop**
Command: **list**
1: stop
Command: **stop**

NB! The user interface is to use the TodoList and Scanner that are passed as parameters to the constructor.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| 1. `add`<br>2. `go to the store`<br>3. `add`<br>4. `vacuum clean`<br>5. `list`<br>6. `completed`<br>7. `2`<br>8. `list`<br>9. `add`<br>10. `program`<br>11. `list`<br>12. `stop` | Command:<br>Task:<br>Command:<br>Task:<br>Command:<br>`1: go to the store`<br>`2: vacuum clean`<br>Command:<br>Which task was completed?<br>`Task go to the store tehty`<br>Command:<br>`1: go to the store`<br>Command:<br>Task:<br>Command:<br>`1: go to the store`<br>`2: program`<br>Command:<br>`1: read the course material`<br>`2: watch the latest fool us`<br>`3: take it easy` |
| 1. `add`<br>2. `write an essay`<br>3. `add`<br>4. `read a book`<br>5. `list`<br>6. `remove`<br>7. `1`<br>8. `list`<br>9. `remove`<br>10. `1`<br>11. `list`<br>12. `add`<br>13. `stop`<br>14. `list`<br>15. `stop` | `1: read the course material`<br>`2: take it easy`<br>`1: read the course material`<br>`2: watch the latest fool us`<br>`3: take it easy`<br>`1: read the course material`<br>`2: take it easy`<br>`1: read the course material`<br>`2: take it easy`<br>`3: buy rasins`<br>`1: buy rasins`<br>Command:<br>To add:<br>Command:<br>To add:<br>Command:<br>`1: write an essay`<br>`2: read a book`<br>Command:<br>Which one is removed?<br>Command:<br>`1: read a book`<br>Command:<br>Which one is removed?<br>Command:<br>Command:<br>To add:<br>Command:<br>`1: stop`<br>Command: |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part08.s01recap.Part08TodoListTest"
```
