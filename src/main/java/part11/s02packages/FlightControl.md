# FlightControl (2 parts)

**Exercise:** `part11-Part11_10.FlightControl`
**Package:** `part11.02packages`

## Spec

In this exercise, you will implement the application that was described above. You are free to design the structure as you wish, or you can follow the structure sketched out above. The appearance of the user interface and the required commands are predefined. This exercise is worth two normal exercise points.

**NB: for the tests to work, you can only create one Scanner object in your program to read user input.**

In this exercise, you will implement a flight control application. It is used to control the airplanes and their flight routes. The system always knows the identifier and the capacity of an airplane. The flight information consists of the used airplane, the departure airport id (e.g. HEL), and the destination airport ID (e.g. BAL).

There can be multiple airplanes and flights. The same airplane can be used to make several flights.

The application should operate in two parts: first, the user enters information about airplanes and flights in the airport asset control, after which the program offers the flight information service for the user. There are three operations in this latter flight control -- printing the airplanes, printing the flights, and printing the information of a single airplane. In addition, the user may exit the program by choosing the option `x`. If the user enters an invalid command, the program asks for a command again.

**The program should start when the main method of the Main class inside the package `FlightControl` is executed**

Example output of the program is presented below:

Airport Asset Control
--------------------
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **1**
Give the airplane id: **HA-LOL**
Give the airplane capacity: **42**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **1**
Give the airplane id: **G-OWAC**
Give the airplane capacity: **101**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **2**
Give the airplane id: **HA-LOL**
Give the departure airport id: **HEL**
Give the target airport id: **BAL**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **2**
Give the airplane id: **G-OWAC**
Give the departure airport id: **JFK**
Give the target airport id: **BAL**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **2**
Give the airplane id: **HA-LOL**
Give the departure airport id: **BAL**
Give the target airport id: **HEL**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **x**

Flight Control
------------
Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **1**
G-OWAC (101 capacity)
HA-LOL (42 capacity)
Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **2**
HA-LOL (42 capacity) (HEL-BAL)
HA-LOL (42 capacity) (BAL-HEL)
G-OWAC (101 capacity) (JFK-BAL)

Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **3**
Give the airplane id: **G-OWAC**
G-OWAC (101 capacity)

Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **x**

**NB** For the purposes of the test it is essential that the *user interface* work **exactly** as described above. You should probably copy the options printed by the program from here to your code. The tests won't assume that your program is prepared to handle improper input.

## Expected Output

```
Airport Asset Control
--------------------
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **1**
Give the airplane id: **HA-LOL**
Give the airplane capacity: **42**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **1**
Give the airplane id: **G-OWAC**
Give the airplane capacity: **101**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **2**
Give the airplane id: **HA-LOL**
Give the departure airport id: **HEL**
Give the target airport id: **BAL**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **2**
Give the airplane id: **G-OWAC**
Give the departure airport id: **JFK**
Give the target airport id: **BAL**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **2**
Give the airplane id: **HA-LOL**
Give the departure airport id: **BAL**
Give the target airport id: **HEL**
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
&gt; **x**

Flight Control
------------
Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **1**
G-OWAC (101 capacity)
HA-LOL (42 capacity)
Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **2**
HA-LOL (42 capacity) (HEL-BAL)
HA-LOL (42 capacity) (BAL-HEL)
G-OWAC (101 capacity) (JFK-BAL)

Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **3**
Give the airplane id: **G-OWAC**
G-OWAC (101 capacity)

Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
&gt; **x**
```
