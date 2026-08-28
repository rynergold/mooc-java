# Liquid Containers 2.0 (2 parts)

**Exercise:** `part07-Part07_02.LiquidContainers2`
**Package:** `part07.s01programmingparadigms`

## Spec

Let's redo the previous program for handling two liquid containers. This time we'll create a class "Container", which is responsible for managing the contents of a container.

Container

Make a class called Container. The class must have a constructor which does not take any parameters, and the following methods:

 -  `public int contains()` which returns the amount of liquid in a container as an integer.

 -  `public void add(int amount)` which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.

 -  `public void remove(int amount)` which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.

 -  `public String toString()` which returns the container as a string formatted "amount of liquid/100, for example "32/100".

The class should work as follows:

```java
Container container = new Container();
System.out.println(container);

container.add(50);
System.out.println(container);
System.out.println(container.contains());

container.remove(60);
System.out.println(container);

container.add(200);
System.out.println(container);
```

0/100
50/100
50
0/100
100/100

Functionality

Copy the user interface you implemented for the previous example, and modify it to use the new Container class.
The main method in the class `LiquidContainers2` must start the program.

Below is some sample output. The user interface should work as follows:

First: 0/100
Second: 0/100
**remove 10**

First: 0/100
Second: 0/100
**add 20**

First: 20/100
Second: 0/100
**remove 5**

First: 20/100
Second: 0/100
**move 15**

First: 5/100
Second: 15/100
**remove 5**

First: 5/100
Second: 10/100
**remove 20**

First: 5/100
Second: 0/100
**quit**

## Expected Output

```
0/100
50/100
50
0/100
100/100
First: 0/100
Second: 0/100
**remove 10**

First: 0/100
Second: 0/100
**add 20**

First: 20/100
Second: 0/100
**remove 5**

First: 20/100
Second: 0/100
**move 15**

First: 5/100
Second: 15/100
**remove 5**

First: 5/100
Second: 10/100
**remove 20**

First: 5/100
Second: 0/100
**quit**
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part07.s01programmingparadigms.LiquidContainers2Test"
```
