# Liquid containers (3 parts)

**Exercise:** `part07-Part07_01.LiquidContainers`
**Package:** `part07.s01programmingparadigms`

## Spec

Let's create an interactive program to control two liquid containers. The containers are named "first" and "second". Each are capable of containing 100 liters of liquid at a time.

The program offers the functionality to add, move and remove liquid. Using the "add" command will add liquid to the first container, "move" will move liquid from the first container to the second container and "remove" will remove liquid from the second container.

The commands must be defined as following:

- `add amount` adds the amount of liquid specified by the parameter to the first container. The inserted amount must be specified as an integer. The container can't hold more than a hundred liters and everything added past that will go to waste.

- `move amount` moves the amount of liquid specified by the parameter from the first container to the second container. The given amount must be specified as an integer. If the program is requested to move more liquid than than the first container currently holds, move all the remaining liquid. The second container can't hold more than one hundred liters of liquid and everything past that will go to waste.

- `remove amount` removes the amount of liquid specified by the parameter from the second container. If the program is requested to remove more liquid than the container currently holds, remove all the remaining liquid.

After every command the program will print the contents of both containers. You don't have to take negative values into consideration.

All the functionality must be added to the method `main` in the class `LiquidContainers` (do not create new methods). The template already contains a loop which exits the program with the command "quit".

A reminder of how to split a string below.

```java
String input = scan.nextLine();
String[] parts = input.split(" ");

String command = parts[0];
int amount = Integer.valueOf(parts[1]);
```

Adding

Implement the functionality to add liquid to the first container. The user interface should work as follows:

First: 100/100
Second: 0/100

Moving

Implement the functionality to move liquid from the first container to the second. The user interface should work as follows:

First: 0/100
Second: 0/100

First: 0/100
Second: 100/100

Second example:

First: 0/100
Second: 0/100

First: 0/100
Second: 10/100

Removing

Implement the functionality to remove liquid from the second container. The user interface should work as follows:

First: 0/100
Second: 0/100

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>add 5</pre> | <pre>First: 0/100<br>Second: 0/100</pre> |
| <pre>add 25</pre> | <pre>First: 5/100<br>Second: 0/100</pre> |
| <pre>add 60</pre> | <pre>First: 30/100<br>Second: 0/100</pre> |
| <pre>add 1000</pre> | <pre>First: 90/100<br>Second: 0/100</pre> |
| <pre>add -5</pre> | <pre>First: 100/100<br>Second: 0/100</pre> |
| <pre>1. quit<br>2. add 1000</pre> | <pre>First: 100/100<br>Second: 0/100<br>First: 0/100<br>Second: 0/100</pre> |
| <pre>move 50</pre> | <pre>First: 100/100<br>Second: 0/100</pre> |
| <pre>add 100</pre> | <pre>First: 50/100<br>Second: 50/100</pre> |
| <pre>move 100</pre> | <pre>First: 100/100<br>Second: 50/100</pre> |
| <pre>1. quit<br>2. move 30</pre> | <pre>First: 0/100<br>Second: 100/100<br>First: 0/100<br>Second: 0/100</pre> |
| <pre>add 10</pre> | <pre>First: 0/100<br>Second: 0/100</pre> |
| <pre>move -5</pre> | <pre>First: 10/100<br>Second: 0/100</pre> |
| <pre>move 20</pre> | <pre>First: 10/100<br>Second: 0/100</pre> |
| <pre>move 10</pre> | <pre>First: 0/100<br>Second: 10/100</pre> |
| <pre>1. quit<br>2. remove 10</pre> | <pre>First: 0/100<br>Second: 10/100<br>First: 0/100<br>Second: 0/100</pre> |
| <pre>add 20</pre> | <pre>First: 0/100<br>Second: 0/100</pre> |
| <pre>remove 5</pre> | <pre>First: 20/100<br>Second: 0/100</pre> |
| <pre>move 15</pre> | <pre>First: 20/100<br>Second: 0/100</pre> |
| <pre>remove 5</pre> | <pre>First: 5/100<br>Second: 15/100</pre> |
| <pre>remove 20</pre> | <pre>First: 5/100<br>Second: 10/100</pre> |
| <pre>quit</pre> | <pre>First: 5/100<br>Second: 0/100</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part07.s01programmingparadigms.LiquidContainersTest"
```
